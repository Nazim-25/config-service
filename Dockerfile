FROM openjdk:11 
EXPOSE 8063
ADD target/cloud-config.jar cloud-config.jar
ENTRYPOINT ["java","-jar", "/cloud-config.jar"]