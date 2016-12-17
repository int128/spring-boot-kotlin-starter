# Spring Boot App in Kotlin [![Build Status](https://travis-ci.org/int128/spring-boot-kotlin-starter.svg?branch=master)](https://travis-ci.org/int128/spring-boot-kotlin-starter)

An example project with Spring Boot and Kotlin.

* Serving static content under `/src/main/resources/static` with Spring MVC.
* Providing REST endpoint with Spring Data REST.
* Accessing to database with Spring Data JPA.
* Configuring application with Spring Boot.
* Written in Kotlin.
* Storing data on MySQL.
* Runnable on Cloud Foundry.


## How to Use

Build and run.

```sh
./gradlew build
java -jar build/libs/spring-boot-kotlin-starter.jar
```

Open http://localhost:8080/items in your browser.
Make post request to add an item as follows.

```sh
curl http://localhost:8080/items -X POST -d '{"name": "Foo", "description": "Bar"}' -H 'Content-Type: application/json'
```

Deploy on Cloud Foundry.
Note that you should attach a database service to the app.

```sh
cf push
```
