package com.srikanth.dto;

import java.security.Key;
import java.util.Date;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
public class ZoomGenerateToken {
	 public static void main(String[] args) {
	        // Your client ID and client secret
	        String clientId = "edWTcol9O1sjehB4kPwgfXeHFKTWNnBz3Q3t";
	        String clientSecret = "VGGOordiJJFsp6wEAm6g7BlXHXY6wVkJbDXn";

	        // Calculate the expiration date (one year from the current date)
	        Date expiration = new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 * 1000L);

	        // Build the JWT token
	        String jwtToken = Jwts.builder()
	                .setIssuer(clientId)
	                .setExpiration(expiration)
	                .signWith(SignatureAlgorithm.HS256, clientSecret)
	                .compact();

	        System.out.println("Generated JWT Token: " + jwtToken);
	    }
	
	/*
	 * public static void main(String[] args) { // Generate a secure key for HS256
	 * Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	 * 
	 * // Define your JWT claims Claims claims = Jwts.claims();
	 * claims.setIssuer("eWFoMjAyMSBkYXRh"); claims.setSubject("");
	 * claims.setExpiration(new Date(System.currentTimeMillis() + 3600000)); // Set
	 * expiration to 1 hour from now
	 * 
	 * // Sign the JWT using the secure key String jwt = Jwts.builder()
	 * .setClaims(claims) .signWith(key) .compact();
	 * 
	 * System.out.println("Generated JWT Token: " + jwt); }
	 */
	/*
	 * public static void main(String[] args) { // Your client ID and client secret
	 * String clientId = "bSpPfznwSWGJIkXMC7_v2w"; String clientSecret =
	 * "K18giDtJA0tZlxL7QdJIct4ryRrQ69xb";
	 * 
	 * // Generate a key from your client secret (you can also use a long secret key
	 * // instead of this approach) Key key =
	 * Keys.hmacShaKeyFor(clientSecret.getBytes());
	 * 
	 * // Calculate the expiration date (one year from the current date) Date
	 * expiration = new Date(System.currentTimeMillis() + 365 * 24 * 60 * 60 *
	 * 1000L);
	 * 
	 * // Build the JWT token String jwtToken =
	 * Jwts.builder().setIssuer(clientId).setExpiration(expiration) .signWith(key,
	 * SignatureAlgorithm.HS256).compact();
	 * 
	 * System.out.println("Generated JWT Token: " + jwtToken); }
	 */
}
