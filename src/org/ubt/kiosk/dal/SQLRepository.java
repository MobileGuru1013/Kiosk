/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.dal;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author F
 */
public class SQLRepository implements PersistenceInterface {

    @Override
    public void add(Object student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void update(Object student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void remove(Object student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(student);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public List<Object> findAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        //Query query = session.createQuery("From Patient"); HQL
        Query query = session.getNamedQuery("Student.findAll");// NamedQuery
        List<Object> list = query.list();
        session.getTransaction().commit();
        return list;
    }

    @Override
    public Object findById(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.getNamedQuery("Student.findByStudentId");
        query.setParameter("studentId", id);
        List<Object> student = query.list();
        session.close();
        return student.get(0);
    }
    
}
