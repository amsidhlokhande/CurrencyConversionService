# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.4.2/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#using-boot-devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#configuration-metadata-annotation-processor)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#production-ready)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.4.2/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


C:\Users\amsid\kompose.exe convert -f "docker-compose -combine of both microservice.yaml"

kubectl apply -f currency-app-network-networkpolicy.yaml,mysql-database-currency-volume-persistentvolumeclaim.yaml,mysql-deployment.yaml,mysql-service.yaml,zipkin-deployment.yaml,zipkin-service.yaml,currencyexchangerateservice-deployment.yaml,currencyexchangerateservice-service.yaml,currencyconversionservice-deployment.yaml,currencyconversionservice-service.yaml
Delete all resources created with above command
kubectl delete -f currency-app-network-networkpolicy.yaml,mysql-database-currency-volume-persistentvolumeclaim.yaml,mysql-deployment.yaml,mysql-service.yaml,zipkin-deployment.yaml,zipkin-service.yaml,currencyexchangerateservice-deployment.yaml,currencyexchangerateservice-service.yaml,currencyconversionservice-deployment.yaml,currencyconversionservice-service.yaml