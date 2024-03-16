spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=dev souza11/fiap-checkpoint1
```
spring.profiles.active=prd

```
docker run -d -p 8080:8080 -e PROFILE=prd souza11/fiap-checkpoint1
```

spring.profiles.active=stg

```
docker run -d -p 8080:8080 -e PROFILE=stg souza11/fiap-checkpoint1
```
