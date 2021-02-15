FROM openjdk:8-jdk-alpine
VOLUME ["/tmp"]
COPY target/CurrencyConversionService-*.jar CurrencyConversionService.jar
COPY src/ src
COPY pom.xml pom.xml
COPY Dockerfile Dockerfile
ENTRYPOINT ["java","-jar","CurrencyConversionService.jar"]