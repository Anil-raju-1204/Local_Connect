package com.Local.Utils;

import java.io.Serializable;
import java.security.Key;
import java.util.Date;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.Localconnect.Bean.LoginRequestBean;
import com.google.gson.Gson;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Utils implements Serializable{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	
	private static final long serialVersionUID = 1L;
	
	private static String SECRET_KEY ="Y3JlZHI=";
	
	public static String createJWT(LoginRequestBean req) {
	
	SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;

	long nowMillis = System.currentTimeMillis();
	long ttlMillis = System.currentTimeMillis();

	Date now = new Date(nowMillis);

	byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SECRET_KEY);
	

	Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());
	
	
	JwtBuilder builder = Jwts.builder().setId(req.getMobileno()).setIssuedAt(now).setSubject("Test")
			.setIssuer(req.getMobileno()).signWith(signatureAlgorithm, signingKey);
	
	if (ttlMillis >= 0) {
		
	    long expMillis = nowMillis + ttlMillis;
	        Date exp = new Date(expMillis);
	        builder.setExpiration(exp);
	    }
	return builder.compact();

}

}
