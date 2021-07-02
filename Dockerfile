FROM openjdk:8-jdk-alpine 
EXPOSE 8088
COPY target target
ENTRYPOINT ["java","-jar","target/dashboard-manager-0.0.1-SNAPSHOT.war"]