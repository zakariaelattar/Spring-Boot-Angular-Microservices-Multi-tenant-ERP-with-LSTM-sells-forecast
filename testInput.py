
import pickle
import pandas as pd


uid=input("id: ")
filename="dump"
infile = open(filename,'rb')
new_dict = pickle.load(infile)
infile.close()
userx=new_dict.loc[[uid]]
res=userx.T.max()
print(res)