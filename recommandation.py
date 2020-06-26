# %% [markdown]
# # Demonstrating the use of simple collaborative filtering algorithms on small data set which contains ratings for musical instruments.

# %% [code]
import numpy as np
import pandas as pd
import pickle
from sklearn.metrics import mean_squared_error
from math import sqrt
import matplotlib.pyplot as plt


# %% [code]
df=pd.read_csv('./ratings_Musical_Instruments.csv',header=None, nrows=12000)
#df.head() #column order: user, items, ratings, timestamp

# %% [code]
#df.shape

# %% [code]
n_users = df[0].unique().shape[0]
n_items = df[1].unique().shape[0]
n_rating = df[2].unique().shape[0]

#print ('%i unique users' %n_users)
#print ('%i unique items' %n_items)
#print ('%i unique ratings' %n_rating)

# %% [code]
#generate user-item matrix
df=df.truncate(before=1)
ratings_with_nan=df.pivot(index=0, columns=1, values=2)
#ratings_with_nan

# %% [code]
ratings=ratings_with_nan.fillna(0).values


# %% [code]
sparsity = float(len(ratings.nonzero()[0]))
sparsity /= (ratings.shape[0] * ratings.shape[1])
sparsity *= 100
print ('percentage of user-items that have a rating: {:.2f}%'.format(sparsity))

# %% [code]
# This creats a validation dataset by selecting rows (user) that have 35 or more ratings, then randomly select 15 of those ratings
#for validation set, but set those values to 0 in the training set.

def train_test_split(ratings):
    
    validation = np.zeros(ratings.shape)
    train = ratings.copy() #don't do train=ratings, other wise, ratings becomes empty
    
    for user in np.arange(ratings.shape[0]):
        if len(ratings[user,:].nonzero()[0])>=35:# 35 seems to be best, it depends on sparsity of your user-item matrix
            val_ratings = np.random.choice(ratings[user, :].nonzero()[0], 
                                        size=15, #tweak this, 15 seems to be optimal
                                        replace=False)
            train[user, val_ratings] = 0
            validation[user, val_ratings] = ratings[user, val_ratings]
    print(validation.shape)
    return train, validation

# %% [code]
train, val = train_test_split(ratings)

# %% [markdown]
# # Using Stochastic Gradient Descend method to update the above low rank matrices for the latent features (online learning). 

# %% [code]
#P is latent user feature matrix
#Q is latent item feature matrix
def prediction(P,Q):
    return np.dot(P.T,Q)

# %% [code]
lmbda = 0.4 # Regularization parameter
k = 3 #tweak this parameter
m, n = train.shape  # Number of users and items
n_epochs = 100  # Number of epochs
alpha=0.01  # Learning rate

P = 3 * np.random.rand(k,m) # Latent user feature matrix
Q = 3 * np.random.rand(k,n) # Latent movie feature matrix

# %% [code]

def rmse(prediction, ground_truth):
    prediction = prediction[ground_truth.nonzero()].flatten() 
    ground_truth = ground_truth[ground_truth.nonzero()].flatten()
    return sqrt(mean_squared_error(prediction, ground_truth))

# %% [code]
train_errors = []
val_errors = []

#Only consider items with ratings 
users,items = train.nonzero()      
for epoch in range(n_epochs):
    for u, i in zip(users,items):
        e = train[u, i] - prediction(P[:,u],Q[:,i])  # Calculate error for gradient update
        P[:,u] += alpha * ( e * Q[:,i] - lmbda * P[:,u]) # Update latent user feature matrix
        Q[:,i] += alpha * ( e * P[:,u] - lmbda * Q[:,i])  # Update latent item feature matrix
    
    train_rmse = rmse(prediction(P,Q),train)
    val_rmse = rmse(prediction(P,Q),val) 
    train_errors.append(train_rmse)
    val_errors.append(val_rmse)

# %% [code]
'''
%matplotlib inline
plt.plot(range(n_epochs), train_errors, marker='o', label='Training Data');
plt.plot(range(n_epochs), val_errors, marker='v', label='Validation Data');
plt.xlabel('Number of Epochs');
plt.ylabel('RMSE');
plt.legend()
plt.grid()
plt.show()
'''
# %% [markdown]
# # Take a look at prediction vs. actual ratings

# %% [code]
SGD_prediction=prediction(P,Q)

# %% [code]
estimation= SGD_prediction[val.nonzero()]
ground_truth = val[val.nonzero()]
results=pd.DataFrame({'prediction':estimation, 'actual rating':ground_truth})

# %% [code]
#results.head()


# %% [code]
filename = 'dump'
outfile = open(filename,'wb')


prediction_data=pd.DataFrame(data=SGD_prediction, index=ratings_with_nan.index, columns=ratings_with_nan.columns)

pickle.dump(prediction_data,outfile)
outfile.close()


user_id='A19K10Z0D2NTZK'

# %% [code]
infile = open(filename,'rb')
new_dict = pickle.load(infile)
infile.close()
userx=new_dict.loc[[user_id]]
print(userx.T.sort_values(by=user_id, ascending=False))



# %% [code]
