# Spring-Cloud

## Eureka-Server 
The service registeration center. Key annotation "@EnableEurekaServer".
## Eureka-Client & Eureka-Client-2 
The real services. Their service name are the same "service-hi", distinguish by Port(Or Ip:Port if in different machines). Key annotation "@EnableEurekaClient".
## Rest-Ribbon 
The client side "service discoverer" and "load balancer", we can specify the service name in the application.yml. Key annotation "@EnableDiscoveryClient" & "@LoadBalanced". And Ribbon is used together with RestTemplate
## Feign-Client
Feigh-Client is just like Rest-Ribbon(actually Feigh-Client is based on Ribbon), just the coding style is a little different. Key annotation "@EnableDiscoveryClient", "@EnableFeignClients", "@FeignClient"



