package com.adkrive.main.general;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class Argon2HashedPassword {

	private static final int DEFAULT_SALT_LENGTH = 16;
	private static final int DEFAULT_HASH_LENGTH = 32;
	private static final int DEFAULT_PARALLELISM = 4;
	private static final int DEFAULT_MEMORY = 16777;
	private static final int DEFAULT_ITERATIONS = 10;
	
	public static String hashedPassword(String rawPassword)
	{
		Argon2PasswordEncoder encoder = new Argon2PasswordEncoder(DEFAULT_SALT_LENGTH, DEFAULT_HASH_LENGTH,DEFAULT_PARALLELISM, DEFAULT_MEMORY, DEFAULT_ITERATIONS);
		String hashPassword = encoder.encode(rawPassword);
		return hashPassword;
	}
	
	public static boolean matches(String rawpass,String hash)
	{
		Argon2PasswordEncoder encoder=new Argon2PasswordEncoder();
		encoder.encode(rawpass);
		boolean status=encoder.matches(rawpass, hash);
		return status;
		
	}
}
