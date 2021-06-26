FROM java:8 
EXPOSE 8088
COPY target target
ENTRYPOINT ["java","-jar","target/dashboard-manager-0.0.1-SNAPSHOT.war"]