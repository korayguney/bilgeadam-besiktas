package com.bilgeadam.security;

public class SecurityConstants {

    public static final String SIGN_UP_URL = "/api/users/sign-up";
    public static final String LOGIN = "/api/login";
    public static final String LOGIN_2 = "/login";
    public static final String SECRET = "BilgeAdam";
    public static final long EXPIRATION_TIME = 432_000_000; // 5 gün
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
}
