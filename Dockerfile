#FROM amazoncorretto:17

#ENV DATABASE_URL jdbc:mysql://localhost/control_empleados
#ENV DATABASE_USERNAME root
#ENV DATABASE_PASSWORD root
#ENV DATABASE_PLATFORM org.hibernate.dialect.MySQL8Dialect
#ENV DATABASE_DRIVER com.mysql.cj.jdbc.Driver


#COPY target/gestion-empleados-backend-0.0.1-SNAPSHOT.jar app.jar

#ENTRYPOINT ["java" , "-jar" , "/app.jar"]