FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/docker-test-0.0.1-SNAPSHOT.jar docker-test-app.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /docker-test-app.jar" ]