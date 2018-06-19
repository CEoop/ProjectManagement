package main;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class Helpers {

    public static int generateSalt() {
    
        Random rnd = new Random();
        return rnd.nextInt();
    }
    
    public static String hashPassword(String plainPassword, int salt) {
    
        String input = plainPassword + salt;
        
        try {            
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());         
            return bytesToHex(hash);
        }
        catch(NoSuchAlgorithmException ex) {}
                return "";
    }
    
    private static String bytesToHex(byte[] bytes) {
        
        StringBuffer result = new StringBuffer();
        
        for (byte byt : bytes) 
            result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
                return result.toString();
    }    
}
