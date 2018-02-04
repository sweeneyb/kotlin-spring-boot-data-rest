## Kotlin + Spring Boot + Spring Data REST

Take a look at the http://localhost:8080/restaurants for the backend generated 
by Spring Data REST
from the `RestaurantRepository` interface declaration it found.

For explicitly defined endpoints, `HelloController` annotations produced 
http://localhost:8080/hello and http://localhost:8080/count .

Build with `mvn clean package`, which packages all the dependencies + an embedded web server into a runnable JAR.

Then in production, just run the JAR, with any command line parameters you'd want. They match the `application.yml`
settings.
