FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8083
ADD target/*.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "java", "-jar", "app.jar"]