package com.srikanth.javaOops;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

public class Zoom {
	public static String generateZoomJwt(String apiKey, String apiSecret) {
        // Generate a new key
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

        // Define token expiration time (e.g., 1 hour from now)
		long expirationMillis = System.currentTimeMillis() + 100 *60000; // 1 hour in milliseconds

        // Build the JWT token
        String jwtToken = Jwts.builder()
                .setHeaderParam("alg", "HS256")
                .setHeaderParam("typ", "JWT")
                .setIssuer(apiKey)
                .setSubject("")
                .setExpiration(new Date(expirationMillis))
                .signWith(key)
                .compact();

        return jwtToken;
}
	 public static void main(String[] args) {
	        String apiKey = "edWTcol9O1sjehB4kPwgfXeHFKTWNnBz3Q3t";
	        String apiSecret = "VGGOordiJJFsp6wEAm6g7BlXHXY6wVkJbDXn";

	        String jwtToken = generateZoomJwt(apiKey, apiSecret);
	        System.out.println("Zoom JWT Token: " + jwtToken);
	    }
}
