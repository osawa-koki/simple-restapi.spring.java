FROM openjdk:17
EXPOSE 8080
COPY . /work
WORKDIR /work
RUN maven install
RUN mv /work/build/libs/simple-restapi-spring-java-1.0.0.jar /work/app.jar
ENTRYPOINT ["java", "-jar", "/work/app.jar"]
