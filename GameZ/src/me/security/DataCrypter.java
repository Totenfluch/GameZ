package me.security;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;


public class DataCrypter {
	private static byte[] key = {
		0x43, 0x07, 0x5c, 0x1a, 0x4f, 0x0d, 0x22, 0x5d, 0x3c, 0x15, 0x0d, 0x06, 0x76, 0x57, 0x16, 0x1e
	};
	private static byte[] key2 = {
		0x5f, 0x0c, 0x42, 0x62, 0x45, 0x30, 0x0f, 0x54, 0x37, 0x04, 0x25, 0x54, 0x3e, 0x63, 0x2a, 0x5f
	};
	private static byte[] key3 = {
		0x70, 0x42, 0x04, 0x06, 0x3b, 0x56, 0x62, 0x5c, 0x74, 0x41, 0x23, 0x6c, 0x1f, 0x6f, 0x2c, 0x3f
	};
	/*private static byte[] key4 = {
		0x4f, 0x0e, 0x61, 0x4d, 0x66, 0x04, 0x77, 0x1c, 0x46, 0x3a, 0x04, 0x7c, 0x70, 0x0f, 0x61, 0x3d
	};
	private static byte[] key5 = {
		0x55, 0x52, 0x17, 0x0f, 0x3c, 0x33, 0x53, 0x15, 0x7d, 0x36, 0x2d, 0x2a, 0x30, 0x34, 0x6d, 0x55
	};
	private static byte[] key6 = {
		0x14, 0x4f, 0x57, 0x63, 0x64, 0x55, 0x5b, 0x3e, 0x70, 0x0f, 0x75, 0x3f, 0x4a, 0x6a, 0x53, 0x7a 
	};*/


	public static String encrypt(String strToEncrypt){
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");  SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			String encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
			return encryptedString;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String encrypt2(String strToEncrypt){
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");  SecretKeySpec secretKey = new SecretKeySpec(key2, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			String encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
			return encryptedString;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String encrypt3(String strToEncrypt){
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");  SecretKeySpec secretKey = new SecretKeySpec(key3, "AES");
			cipher.init(Cipher.ENCRYPT_MODE, secretKey);
			String encryptedString = Base64.encodeBase64String(cipher.doFinal(strToEncrypt.getBytes()));
			return encryptedString;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String decrypt(String strToDecrypt){
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			String decryptedString = new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));
			return decryptedString;

		} catch (Exception e) {
			e.printStackTrace();
			return "Your String is not Encrypted!";
		}
	}

	public static String decrypt2(String strToDecrypt)
	{	
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			SecretKeySpec secretKey = new SecretKeySpec(key2, "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			String decryptedString = new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));
			return decryptedString;

		} catch (Exception e) {
			e.printStackTrace();
			return "Your String is not Encrypted!";
		}
	}

	public static String decrypt3(String strToDecrypt)
	{	
		try{
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
			SecretKeySpec secretKey = new SecretKeySpec(key3, "AES");
			cipher.init(Cipher.DECRYPT_MODE, secretKey);
			String decryptedString = new String(cipher.doFinal(Base64.decodeBase64(strToDecrypt)));
			return decryptedString;

		} catch (Exception e) {
			e.printStackTrace();
			return "Your String is not Encrypted!";
		}
	}

}
