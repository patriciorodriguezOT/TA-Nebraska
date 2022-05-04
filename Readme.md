# Nebraska Test Automation

## Profiles

The Profiles section contains all the Global Variables needed to execute the test cases.

Each profile contains the links, variables, users, and configuration necessary to execute the test scrips in a specific environment.

~~Execution Profile helps cover multiple and different environments to execute your automation test scripts with ease. You can configure the testing environment in terms of data and behaviors through Global variables.~~

 - ### QA Env
Contains the global variables needed for vv5qa environment. 

- ### Dev Env
Contains the global variables needed for vv5qa environment. 


## Test Cases

Here are located all the test scripts developed. They are organized by section. Each folder represents a specific form/section of the project.


## Object Repository

Here are located all the elements the test scripts interact with. They are organized by forms. Each folder contains the objects of a specific one.


## Test Suites

A test suite is a collection of multiple different or duplicate test cases.

They are grouped by section or linked processes where one needs from the other. For example, Registration, Applying for a License, and Deny License Application.

### Individual Test Cases:
In this folder, there is a Test Suite for each test case. This is in case we need to execute a specific script from Test Cloud.

### Test Suite Collection
Here is the Test Suite Collection which contains all the Test Suites that need to be executed every day.

### Test Suites - Process
In this folder there are the Test Suites executed on the Test Suite Collection. These TS contains groups of TCs.


### Test Suites for testing
Used for testing. 


## Keywords

### api_Connection:
In this folder, there are the classes created in order to handle the JSON response obtained from an API call. Each class contains all the functions for a specific form.

### compareImages
Here is contained the class used for comparing two images and checking if they are equal or not. In case there is a difference, an image is created marking the differences.

### generic
Here there are generic functions that are needed to execute the test scripts, like date handling, generating random strings, etc.

### gmailConnection:
Here is the class used to connect with Gmail account and verify emails received by registration.

### pages
In this folder, there is a class for each form. These classes contain all the keywords needed to interact with them. Apart from that, all the elements are declared in the corresponding class.

### tc_listener
Here is the class which contains the functions to be executed after or before a TC is executed.

### ws
Here are the classes to make the API calls. Each class contains all calls for a specific form.


## Test Listeners
Here is the event that is triggered once the test cases have been completed.