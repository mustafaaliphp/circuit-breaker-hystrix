# circuit-breaker-hystrix
Customer - Shipping Microservices with Spring Boot ( Hystrix Circuit Breaker, Netflix Eureka).

• Discovery-service: a Netflix Eureka server, used for service discovery.
• Shipping-service: a simple Shipping Service that uses Spring Data REST to serve up a REST API of 
shipping details.
• Customer-service: a simple Customer Service that uses Spring Data REST to serve up a REST API of 
shipping-service along with it’s own customer details and it implements hystrix circuit breaker when 
calls shipping service API
