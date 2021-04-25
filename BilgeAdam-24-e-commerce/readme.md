How to run the project:
-----------------------
* It is ready to run project on localhost;
**_E-Commerce Application for BilgeAdam Spring Boot Course_**

**Required dependencies for the project:**

* Spring Boot 
* Spring Data
* Lombok
* Spring Web
* Validation
* H2 Database
* Swagger-SwaggerUI
* JSON Web Token
* Spring Security

``` <dependencies>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-web</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<dependency>
<groupId>com.h2database</groupId>
<artifactId>h2</artifactId>
<scope>runtime</scope>
</dependency>
<dependency>
<groupId>io.springfox</groupId>
<artifactId>springfox-swagger2</artifactId>
<version>2.9.2</version>
</dependency>
<dependency>
<groupId>io.springfox</groupId>
<artifactId>springfox-swagger-ui</artifactId>
<version>2.9.2</version>
</dependency>
<dependency>
<groupId>org.projectlombok</groupId>
<artifactId>lombok</artifactId>
<optional>true</optional>
</dependency>
<dependency>
<groupId>io.jsonwebtoken</groupId>
<artifactId>jjwt</artifactId>
<version>0.7.0</version>
</dependency>
<dependency>
<groupId>mysql</groupId>
<artifactId>mysql-connector-java</artifactId>
<scope>runtime</scope>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>
<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-test</artifactId>
<scope>test</scope>

How to configure the project:
-----------------------

It is necessary to configure project for your local machine. To do this;
* Configure `SpringFoxFonfig.java`;
```
private ApiInfo apiInfo() {
        return new ApiInfo(
                "BilgeAdam E-Commerce REST API",
                "BilgeAdam E-Commerce REST API project",
                "1.0",
                "Terms of service",
                new Contact("Koray Guney", "https://github.com/nameSurname", "nameSurname@hotmail.com"),
                "License of API",
                "API license URL",
                Collections.emptyList());
    }
```
* For securirty; add `JWTAuthenticationFilter.java`, `JWTAuthorizationFilter.java`, `SecurityConstants.java`, `WebSecurityConfig.java`;

* Configure `SecurityConstants.java`
```
public class SecurityConstants {
    public static final String SIGN_UP_URL = "/api/users/sign-up";
    public static final String LOGIN = "/api/login";
    public static final String LOGIN_2 = "/login";
    public static final String SECRET = "BilgeAdam";
    public static final long EXPIRATION_TIME = 432_000_000; // 5 gün
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
```



</dependency>
<dependency>
<groupId>org.springframework.security</groupId>
<artifactId>spring-security-test</artifactId>
<scope>test</scope>
</dependency>
</dependencies> ```

