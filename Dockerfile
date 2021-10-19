FROM openjdk:11-slim as build

COPY target/route-zips-0.0.1-SNAPSHOT.jar route-zips-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/route-zips-0.0.1-SNAPSHOT.jar"]