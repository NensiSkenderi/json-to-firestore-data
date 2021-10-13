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
 The JSON file should look like this:
 
 ```
 {
  "type": "service_account",
  "project_id": "your_project_id", //change this
  "private_key_id": "your_private_key_id", //change this
  "private_key": "your_private_key", //change this
  "client_email": "nensi-test@fresh-span-242610.iam.gserviceaccount.com", //change this
  "client_id": "your_client_id", //change this
  "auth_uri": "https://accounts.google.com/o/oauth2/auth",
  "token_uri": "https://oauth2.googleapis.com/token",
  "auth_provider_x509_cert_url": "https://www.googleapis.com/oauth2/v1/certs",
  "client_x509_cert_url": "your_client_x509_cert_url" //change this
}
```
Place this JSON under resources/static and configure application.yml live above.
 
Keep in mind to store this file because for security reasons Google won't let you redownload it.

## Technologies used: 

  * Kotlin
  * Spring Boot
  * Spring Cloud GCP Datastore
  * Firestore

## Contact 
Nensi Skenderi - nensiskenderi20@gmail.com

  
