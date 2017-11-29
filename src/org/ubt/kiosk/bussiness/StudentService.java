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
public class StudentService {
    
    private SQLRepository sqlRepository;

    public StudentService() {
        sqlRepository = new SQLRepository();
    }
    
    public void update(Student student)
    {
        sqlRepository.update(student);
    }
}
