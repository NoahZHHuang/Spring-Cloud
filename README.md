# Spring-Cloud


#senoria
Eureka-Server is the service registeration center， key annotation "@EnableEurekaServer"
Eureka-Client & Eureka-Client-2 are the real services, their service name are the same "service-hi", distinguish by Port(Or Ip:Port if in different machines), key annotation "@EnableEurekaClient"
Rest-Ribbon is the client side "service discoverer" and "load balancer", we can specify the service name in the application.yml, key annotation "@EnableDiscoveryClient" & "@LoadBalanced". And Ribbon is used together with RestTemplate



