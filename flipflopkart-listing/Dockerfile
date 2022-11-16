FROM openjdk:11
EXPOSE 8083
WORKDIR .
COPY target/flipflop-*.jar flipflop-listing-docker-sample.jar
CMD ["ls", "-la"]
CMD ["java", "-jar", "flipflop-listing-docker-sample.jar"]
