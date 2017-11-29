/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.bussiness;

import org.ubt.kiosk.dal.SQLRepository;
import org.ubt.kiosk.entity.Student;

/**
 *
 * @author F
 */
public class AuthenticateUser {

    private SQLRepository studentRepository = new SQLRepository();
    private PasswordHashing hashing = new PasswordHashing();
    
    public Student authenticate(String user, String password) 
    {
        Student student = (Student)studentRepository.findById(Integer.parseInt(user));
        
        if (student != null && hashing.encodehashPassword(password).equals(student.getPassCode())) 
        {
            return student;
        }
        return null;
    }
}
