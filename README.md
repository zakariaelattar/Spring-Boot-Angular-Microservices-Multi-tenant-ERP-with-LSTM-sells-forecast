# ERP Spring boot angular application, under microservices and Multi tenancy architectures 
The project is a prototype and was done by 3 Software engineers (Zakaria El attar, Omar Imai, Abderrafia Niya), it may help to understand the architecture of microservices under Spring Boot, and also an implementation of the LSTM algorithm for forcast recommandation.
to contact Us:

* El Attar Zakaria: elattarz@yahoo.com
* Omar Imai: omarimai@gmail.com

# Introduction
This project is about an ERP (Entreprise Resource Planning) developped using the latest technologies, a microservice architecture with an asynchronous communication via RabbitMQ broker, a multi tenancy, architecture (single database, multiple schemas), and a machine learning algorithm for sales forecasting.

## Structure
![alt text](https://github.com/zakariaelattar/Spring-Boot-Angular-Microservices-Multi-tenant-ERP-with-LSTM-sells-forecast/blob/master/cannon_erp.png?raw=true)

## Microservices

These are the microserices used in the project, and functional port : 

> Config microservice :8888

> Register microservice :8761

> Proxy microservice :8088

>Database handler microservice :8081 

>Product and stock microservice :8082

>Tiers microservice :8083

>Purshases and sells microservice :8084

>Finance and marketing microservice :8085

## Instalation
## Docker
Using docker compose :

>$ docker-compose -f docker-compose up -d

run each microservice independently of the others:

>$ docker build  


To be continued ..
