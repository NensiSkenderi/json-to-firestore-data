# JSON to Firestore Data

## About The Project

A sample application to show how to create and manage data from json to firesore using Kotlin, Spring Boot.

In the resource folder you can find the json file needed for telling spring about the firestore credentials

```java
spring:
  cloud:
    gcp:
      datastore:
        project-id: fresh-span-242610
        credentials:
          location: classpath:/static/fresh-span-242610-f9bd930c01b1.json
 ```
 
 You can download this file by going to https://console.cloud.google.com/apis/credentials <br/>
 Choose one from Service Accounts (if you don't have one just create it) <br/>
 Press **Edit Service Account** and go to **Keys** <br/>
 Press Add Key and choose JSON, then the .json file will be created for you <br/>
 
 For security reasons Google won't let you redownload it.

## Technologies used: 

  * Kotlin
  * Spring Boot
  * Spring Cloud GCP Datastore
  * Firestore

## Contact 
Nensi Skenderi - nensiskenderi20@gmail.com

  
