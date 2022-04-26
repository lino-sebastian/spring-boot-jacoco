# Spring Boot JaCoCo
Simple Spring boot project implementing code coverage for the Junit Test using [JaCoCo](https://www.eclemma.org/jacoco/) Plugin

## Jacoco
Code coverage is a software metric used to measure how many lines of our code are executed during automated tests.

JaCoCo is an open source project, which can be used to check production code for test code coverage. 
It creates reports and integrates well with IDEs like the Eclipse IDE. 

Integration is also available for other IDEs and continuous integration environments. 
So there are also Gradle, SonarQube and Jenkins plugins to make these code coverage checks outside the IDE and therefore globally available to the development team.

## What have been done
1. Constructed basic Spring boot project using [Spring Initializer](https://start.spring.io/)
2. Added JaCoCo Plugin configuration
3. Implemented the required Tests

## Build
```
mvn clean install
```
## Run
```
mvn spring-boot:run
```
## Working
1. Build the Project
2. Move to Jacoco folder and open ```target/site/jacoco/index.html```
3. ```index.html``` will list the coverage for the complete Project

**Coverage Indicators**
- Red    : Not Covered
- Yellow : Partially Covered
- Green  : Completely Covered

