/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package criptografia;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author notebook
 */
/*
public class HashMD5 {
    public static String hashMD5(String hash){
        StringBuffer sb = new StringBuffer();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(hash.getBytes());
            byte[] b = md.digest();
            for(byte b1 : b){
                sb.append(Integer.toHexString(b1 & 0xff).toString());
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(HashMD5.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }
}
 */
public class HashMD5 {

    public static String hashMD5(String value) {
        MessageDigest md;
        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        BigInteger hash = new BigInteger(1, md.digest(value.getBytes()));
        return hash.toString(16);
    }
}
