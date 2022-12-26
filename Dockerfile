FROM openjdk:11 
EXPOSE 8063
ADD target/cloud-config-2.jar cloud-config-2.jar
ENTRYPOINT ["java","-jar", "/cloud-config-2.jar"]
