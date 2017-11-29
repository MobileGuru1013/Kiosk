/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.bussiness;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.DatatypeConverter;
/**
 *
 * @author F
 */
public class PasswordHashing {
    
    
    public String encodehashPassword(String password)
    {
        try 
        {
            MessageDigest md = MessageDigest.getInstance("MD5");// SHA-512m SHA-256
            byte [] message = password.getBytes();
            md.update(message);
            byte[] digestbyte = md.digest();
            password = DatatypeConverter.printHexBinary(digestbyte).toLowerCase();
            
        } catch (NoSuchAlgorithmException ex) 
        {
            Logger.getLogger(PasswordHashing.class.getName()).log(Level.SEVERE, null, ex);
        }
        return password;
    }
    
    public String decodehashPassword(String password) 
    {
        return password;
    }
}
