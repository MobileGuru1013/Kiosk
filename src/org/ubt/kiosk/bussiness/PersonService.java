/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.bussiness;

import org.ubt.kiosk.dal.SQLRepository;
import org.ubt.kiosk.entity.Person;

/**
 *
 * @author F
 */
public class PersonService {
     private SQLRepository sqlRepository;

    public PersonService() {
        sqlRepository = new SQLRepository();
    }
    
    public void update(Person person)
    {
        sqlRepository.update(person);
    }
    
}
