Very basic Spring Boot project using a `CommandLineRunner` bean.

To build the native application packaged in a lightweight container:
```
# JVM app image
./mvnw clean package

# Native executable
./mvwn clean package -Pnative

# JVM image
./mvnw spring-boot:build-image

# Native image
./mvnw spring-boot:build-image -Pnative
```

To run the image:
```shell
time java -jar target/clr-native-base.jar

time target/clr-native 
```

