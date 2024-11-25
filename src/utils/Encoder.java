/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Camila
 */
public class Encoder {
    
    private final Cipher cipher;
    private final MessageDigest md5;
    private final String secretKey = "ProgramacionAvanzada";
    private final SecretKey secret;
    
    
    public Encoder() throws NoSuchAlgorithmException, NoSuchPaddingException, UnsupportedEncodingException {
        cipher = Cipher.getInstance("AES");
        md5 = MessageDigest.getInstance("MD5");
        byte[] llavePassword = md5.digest(secretKey.getBytes("utf-8"));
        byte[] bytesKey = Arrays.copyOf(llavePassword, 24);
        secret = new SecretKeySpec(bytesKey, "AES");
    }
    
    public String encrypt(String plainText) throws UnsupportedEncodingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        cipher.init(Cipher.ENCRYPT_MODE, secret);
        byte[] encryptedByte = cipher.doFinal(plainText.getBytes());
        return Base64.getEncoder().encodeToString(encryptedByte);
    }
    
    public String decrypt(String encryptedText) throws UnsupportedEncodingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] encryptedTextByte = Base64.getDecoder().decode(encryptedText);
        cipher.init(Cipher.DECRYPT_MODE, secret);
        byte[] decryptByte = cipher.doFinal(encryptedTextByte);
        return new String(decryptByte);
    }
     
    public static void main(String[] args) throws Exception {
        Encoder seguridad = new Encoder();
        String pass = "dbuitrago";
        String passCifrado = seguridad.encrypt(pass);
        System.out.println(pass);
        System.out.println(passCifrado);
        String passDescifrado = seguridad.decrypt(passCifrado);
        System.out.println(passDescifrado);
    }

}
