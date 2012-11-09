This contains the set of instructions required to build and run the address book application.

Contents :
==========
.
├── pom.xml
├── ReadMe.txt
├── ReadMe.txt~
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── vijitha
    │   │           └── jbehave
    │   │               └── simple
    │   │                   ├── calc
    │   │                   │   └── Calculator.java
    │   │                   └── results
    │   │                       └── ResultGenerator.java
    │   └── resources
    └── test
        ├── java
        │   └── com
        │       └── vijitha
        │           └── jbehave
        │               └── simple
        │                   ├── calc
        │                   │   ├── CalculatorStorySteps.java
        │                   │   └── calculator_story_steps.story
        │                   └── results
        │                       ├── ResultGeneratorStorySteps.java
        │                       └── result_generator_story_steps.story
        └── resources



Description
-----------
This example explain two simple methods of BDD implements using JBehaviour
1 - Test data using in line parameters (CalculatorStorySteps.java)
2 - Test data using a table (ResultGeneratorStorySteps.java)

Both the classes are run as JUnitStory.


Building the Project.
====================

Pre-requisites
--------------
JDK 1.5.x or higher
Maven 2 or higher
set java_home and m2_home.
eClipse 3.5 or higher (Optional)

Steps:
------
1 - To run the test in the application
    mvn clean install

Running the application.
========================

This sample is done only for Testing purpose.


