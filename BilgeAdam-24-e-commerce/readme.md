E-Commerce Application for BilgeAdam Spring
-----------------------------
This is an example demo project for Spring application.

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

How to run the project:
-----------------------
* It is ready to run project on localhost;
