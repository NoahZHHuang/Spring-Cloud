# Spring-Cloud

## Eureka-Server 
The service registeration center. Key annotation "@EnableEurekaServer".
## Eureka-Client & Eureka-Client-2 
The real services. Their service name are the same "service-hi", distinguish by Port(Or Ip:Port if in different machines). Key annotation "@EnableEurekaClient".
## Rest-Ribbon 
The client side "service discoverer" and "load balancer", we can specify the service name in the application.yml. Key annotation "@EnableDiscoveryClient" & "@LoadBalanced". And Ribbon is used together with RestTemplate
## Feign-Client
Feigh-Client is just like Rest-Ribbon(actually Feigh-Client is based on Ribbon), just the coding style is a little different. Key annotation "@EnableDiscoveryClient", "@EnableFeignClients", "@FeignClient"
## Hystrix 
Hystrix is a circuit breaker, it can make the unavailable service out of the routing scope in a cluster. And also Hytrix can auto detect the unavailable service recover.
Ribbon need to add the dependency ">spring-cloud-starter-hystrix", but Feigh-Client doesnt because it contain hystrix already.
In Ribbon the key annotation is @EnableHystrix & @HystrixCommand
In Feigh-Client the key annotation is @FeignClient(fallback=Class.class)



