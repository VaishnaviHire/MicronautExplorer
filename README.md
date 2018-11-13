# Micronaut
Exploring a full stack framework for building micro services

## Feautures
Micronaut is both an HTTP Server and an HTTP client. It supports multiple features :
  * Languages - Java, Groovy and Kotlin.
  * Databases - SQL, NoSql
  * JWT support.
  * Session storage in Redis.
  * Built-in Cloud Support
  
## Running the Micronaut App 
```
Requirements :  JDK 1.8 or greater with JAVA_HOME configured

Download Micronaut : 
$ curl -s https://get.sdkman.io | bash
$ source "$HOME/.sdkman/bin/sdkman-init.sh"
$ sdk install micronaut

$ git clone "this-repo"
$ cd hello-world/

Test : 
$ ./gradlew test

Run :
./gradlew run

```

## HTTP Server :

1. There are two ways in which micronaut http servers can be designed -
      * Creating controllers and adding server side logic (implemented in HelloController.kt)
      * More control over http processing using HTTPRequest and HTTPResponse methods (implemented in RequestController.kt and ResponseController.kt)
2. HTTP requests can be easily manipulated using inbuilt annotations such as @Controller, @Body, @Header
3. HTTP servers can be tested using micronaut`s inbuilt low-level HTTP-client ( implemented in HelloAppTests.kt)

## HTTP Client :

1. We can create declarative HTTP clients using @Client annotation ( implemented in HelloClient.kt)
2. Micronaut HTTP clients can be easily manipulated using inbuilt configuration methods.
3. JSON streaming over HTTP is also possible in Micronaut using RXJava 2 methods. However to convert them to Kotlin is complex.

## Security :

1. IP whitelisting can by changing configuration file. (implemented in /src/main/resources/application.yml)
2. Secured annotations and built-in end-points security is also available.
3. Authentication -  Micronaut supports RFC7617: transmits credentials as user-id/password pairs, encoded using Base64.
4. Session based authentication by using security-session dependency

## Sessions:

1. One of the most interesting features is, it supports in-memory session dependency.
2. It uses redis for this.
3. If the http client is a browser, sessions will act as if cookies are enabled by the browser.


## Testing:

1. Micronaut uses Spek for doinf unit tests.
2. Spek makes unit testing easier and more compact. 
3. Spek is explicitly written in Kotlin but also works with java.
      

         



