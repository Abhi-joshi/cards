FROM amazoncorretto:17
MAINTAINER abhishek
COPY target/cards-0.0.1-SNAPSHOT.jar cards-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/cards-0.0.1-SNAPSHOT.jar"]