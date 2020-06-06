package weno.controllers;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class codigo {
	
	private String sip;
	
	public codigo(String pass) throws NoSuchAlgorithmException {	
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] encodedhash = digest.digest(pass.getBytes(StandardCharsets.UTF_8));
		setTEST(bytesToHex(encodedhash));
	}
	
	public String getTEST() {
		return sip;
	}

	public void setTEST(String TEST) {
		this.sip = TEST;
	}

	private static String bytesToHex(byte[] hash) {
	    StringBuffer hexString = new StringBuffer();
	    for (int i = 0; i < hash.length; i++) {
	    String hex = Integer.toHexString(0xff & hash[i]);
	    if(hex.length() == 1) hexString.append('0');
	        hexString.append(hex);
	    }
	    return hexString.toString();
	}
}
	
	
	
	
	

