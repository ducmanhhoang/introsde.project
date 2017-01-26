#Project: Virtual Lifestyle Coach

**Introduction to Service Design and Engineering | University of Trento |** 

**Name:** DUC MANH HOANG
**ID No.:** MAT.180387

##1. Introduction

This project names Virtual Lifestyle Coach. It is a information system of services created to support  the tracking of physical activities, health measures and food calories for a given user. The platform will enable a user to track his/her lifestyle and progresses by registering measures about various parameters of health in a simple way. The users can see again their histories of his/her health status to have a good view of his/her progresses. In addition, the system will allow users to create a new his/her own goal automatically or manually. The goal regards to activities, calories eaten or shaved and also some ideal figure as weight depending on height and age.

Furthermore, there is a motivation service that will provide the motivating quotes to encourage for the users doing with Virtual Lifestyle Coach and following their progresses reaching their goals.

There are some conceptualized entities related to our service systems. They are the most important information entities that will take the roles for tracking user's health progresses:

**Person:** contains the attributes describing the personal informations non changing in the future time such as: name, birth date, gender and etc.
**Health Measure:** contains the measurement attributes such as weight, height, age, BMI (Body mass index), BMR (Basal metabolic rate). These attribute can change at a time of the future. Depending on the BMI and BMR indexes, Virtual Lifestyle Coach will suggest to users their goals contains the ideal indexes such as weight ideal.
**Health Measure History:** contains the measurement attributes to be the same Health Measure but its figures consider as the past time. It provides the good tracking of users' health status changed.
**Activity:** contains the attributes showing the informations of a particular activity. The vital figure is the number of calories burnt per one hour.
**Food:** contains the attributes presenting the informations of a particular recipe. We will care about the number of calories eaten per one recipe.
**Goal:** is the essential entity to the system. It is depended on the Health Measure figure to produce the goal figure in Goal. Its important measurement attributes are ideal weight, ideal BMI, and shaved calories.
**Motivation:** contains the phrase to motivate the target users to help user gain their confidence.

From the above conception, we will have good imagine for data model look like.

##2. Data Models

Depending on the conceptual components, the data models will be designed as follows:

**Person:** The model keeps the information about a user.
**Health Measure:** The model keeps information about the current health status of a user.
**Health Measure History:** The model keeps information about the historical health status of a user.
**Goal:** The model keeps information about the ideal indexes, selected activities, selected foods during of one day time.
**Food Selection:** The model keeps information about a recipe that user have selected to eat. It is also describing the eaten calories.
**Activity Selection:** The model keeps information about a activity that user have selected to play. It is also describing the time of user's playing on it and the burnt calories of user for that activity.
**Activity:** The model keeps information about a pure activity describing the number of calories to be burnt per one hour.
**Other models,** Measure Definition and Measure Range are designed to supported the Health Measure and Health Measure History.

**Entity-Relationship Diagram**
![](diagrams/ER.png?raw=true)

##3. Architecture

There will be 3 main components to be User interface, Business logic, and Data resources. They are all containing the services and going to interact each other to achieve the operation of system. We will consider each of its components and each service of each component by bottom-up direction.

###3.1. Data Resources

It contains the basic services for permanently storeing data entities and offers basic CRUD functionalities.  Each persistence unit uses JPA and SQLite to store model instances and offers RESTful communication. Addition, we will allocate a adapter service purposing to connect and transform data of external services to suitable data model of our own model.

**Local Database Service:**  is a RESTful service. Basically, it provides the interacting operation with the main database containing the above models described in section 2. It provides basic CRUD functionalities. We can call it as a connecting API between the above service to a under database.
**Adapter Service:** is a RESTful service. It is a bridge between the internal services and other external services (for example: recipe of food in this case). It is also a transformer to convert data model of external services become a compatible data sources for our internal data model (for example: we will map recipe foods of the api.edamam.com into recipe foods of our model in this case). It is also considered as a connector of our internal services to other external services.
**Storage Service:** is a top service of Data resources block and provides RESTful communication. It groups all the functionalities of Data resources bock with purpose to centralize the Data resources layer. All queries from above services of other above layers will have to pass through this storage service.

###3.2. System Logics

This layer contains the business logic services required to perform tasks delivered from upper layers, while accessing data from lower layers. It consist of two kind of service communications to be RESTful and SOAP.

**Business logic service:** is a RESTful service. It provides some business processes. For example:

* When a user enter the figure of health measurement such as height, weight and age, this service will compute the BMI and BMR index, and then automatically generate a new user's goal depending on the BMI and BMR index.
* It will allow user for searching the food recipes and activities. Moreover it also provides the suggestion functionalities of food recipes and activities depending on the goal that already have been setup for a specific user.
* It provides function allow user create new goal for the current health status. The created goal have to depend on the current health measurement figures.

Addition, the Business logic service again connect to a database of motivation quotes. This provides the encouraging phrase to make its user more confident.

**Process Centric Service:** is a SOAP service. As under Storage service, Process centric service also centralizes the System logics component. It will be a API of whole queries from User interface component to Data sources component and the external services in System logic component (for example: Business logic service). It has to contain all the functionalities at the highest level of a server application. The functionalities of Process centric service will guarantee to provide all the functions that user interface application need.

![](diagrams/architecture.bmp?raw=true)

###3.3. User Interface

This component provides a end user interface that users use it for interacting with Virtual Lifestyle Coach system. This application is the client of a SOAP communication.

**Use-case**

* View user's information and current health measure: will allow user to see the general own information.
* Update current health measure: will allow user to update the health measure figures such as height, weight, age.
* Create new goal: will allow user to create new suitable goal.
* Get suggestion foods: will allow user to get the suggestion of food recipes.
* Get suggestion activities: will allow user to get the suggestion of the activities.
* Search foods: will allow user to get the list of foods can eat following the interest of user.
* Search activities: will allow user to to get the list of activities can play following the interest of user.
* Update time for current activity: will allow user to update the playing time of user on a activity chosen.
* Show health measure histories: will allow user to see his/her own health measure histories.
* Show goal histories: will allow user to see his/her own goal histories

**Use-Case diagram**

![](diagrams/use-case.bmp?raw=true)


##4. Implementation

The below image show the user's interface of the program.

![](diagrams/implementation.png?raw=true)

##5. References

[1]. https://sites.google.com/a/unitn.it/introsde_2016-17/
