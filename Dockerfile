FROM amazoncorretto:17

COPY target/gestion-empleados-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java" , "-jar" , "/app.jar"]