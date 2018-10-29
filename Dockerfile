FROM openjdk:8
ADD . /src
WORKDIR /src
COPY target/notification-service-*.jar /usr/local/bin/notification-service.jar
RUN chmod +x /usr/local/bin/notification-service.jar
CMD ["java", "-jar", "/usr/local/bin/notification-service.jar"]