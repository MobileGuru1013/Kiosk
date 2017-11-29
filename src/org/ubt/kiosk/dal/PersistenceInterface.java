/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.dal;

import java.util.List;
import org.ubt.kiosk.entity.Student;

/**
 *
 * @author F
 */
public interface PersistenceInterface {
    
    public void add(Object student);
    public void update(Object student);
    public void remove(Object student);
    public List<Object> findAll();
    public Object findById(int id);
}
