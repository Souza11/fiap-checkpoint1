spring.profiles.active=dev

```
docker run -d -p 8080:8080 -e PROFILE=dev ping
```
spring.profiles.active=prd

```
docker run -d -p 8080:8080 -e PROFILE=prd ping
```

spring.profiles.active=stg

```
docker run -d -p 8080:8080 -e PROFILE=stg ping
```
