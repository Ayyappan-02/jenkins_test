FROM openjdk
LABEL maintainer ="abc@mail.com"
EXPOSE 8082
WORKDIR /app
COPY target/add_num.jar /app/add_num.jar
ENTRYPOINT ["java", "-jar","add_num.jar"]