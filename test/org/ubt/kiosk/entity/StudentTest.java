/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.entity;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import org.ubt.kiosk.bussiness.StudentService;
import org.ubt.kiosk.dal.SQLRepository;

/**
 *
 * @author F
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStudentId method, of class Student.
     */
    @Ignore
    public void testGetStudentId() {
        System.out.println("getStudentId");
        Student instance = new Student();
        Integer expResult = null;
        Integer result = instance.getStudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStudentId method, of class Student.
     */
    @Ignore
    public void testSetStudentId() {
        System.out.println("setStudentId");
        Integer studentId = null;
        Student instance = new Student();
        instance.setStudentId(studentId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassCode method, of class Student.
     */
    @Ignore
    public void testGetPassCode() {
        System.out.println("getPassCode");
        Student instance = new Student();
        String expResult = "";
        String result = instance.getPassCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassCode method, of class Student.
     */
    @Ignore
    public void testSetPassCode() {
        System.out.println("setPassCode");
        String passCode = "";
        Student instance = new Student();
        instance.setPassCode(passCode);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonId method, of class Student.
     */
    @Ignore
    public void testGetPersonId() {
        System.out.println("getPersonId");
        Student instance = new Student();
        Person expResult = null;
        Person result = instance.getPersonId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonId method, of class Student.
     */
    @Ignore
    public void testSetPersonId() {
        System.out.println("setPersonId");
        Person personId = null;
        Student instance = new Student();
        instance.setPersonId(personId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGroupId method, of class Student.
     */
    @Ignore
    public void testGetGroupId() {
        System.out.println("getGroupId");
        Student instance = new Student();
        StudentGroup expResult = null;
        StudentGroup result = instance.getGroupId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGroupId method, of class Student.
     */
    @Ignore
    public void testSetGroupId() {
        System.out.println("setGroupId");
        StudentGroup groupId = null;
        Student instance = new Student();
        instance.setGroupId(groupId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Ignore
    public void testHashCode() {
        System.out.println("hashCode");
        Student instance = new Student();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Student.
     */
    @Ignore
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Student.
     */
    @Ignore
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testStudent()
    {
        StudentService ss = new StudentService();
        SQLRepository sr = new SQLRepository();
        SQLRepository pr = new SQLRepository();
        Student st = (Student)sr.findById(151635581);
        StudentGroup sg = new StudentGroup();
        /*sg = st.getGroupId();
        sg.setGroupId(3);
        sg.setGroupName("Third N");
        st.setGroupId(sg);*/
        Person p = new Person();
        p = st.getPersonId();
        p.setCountry("USA");
        p.setCity("New York");
        st.setPersonId(p);
        p.setStudent(st);
        Object o = (Object)p;
        pr.update(o);
        ss.update(st);
        
        Person per1 = new Person();
        per1.setCity("Pr");
        per1.setCountry("Kosovo");
        per1.setFirstName("Ylli");
        per1.setLastName("Petrovci");
        per1.setPersonId(10000654);
        per1.setPhoneCollection(null);
        sr.add(per1);
    }
    @Test
    public void testUser()
    {
        SQLRepository sr = new SQLRepository();
        Person per1 = new Person();
        per1.setCity("Pr");
        per1.setCountry("Kosovo");
        per1.setFirstName("Rinor");
        per1.setLastName("Petrovci");
        per1.setPersonId(10000653);
        per1.setPhoneCollection(null);
        sr.add(per1);
        Student st1 = new Student();
        st1.setPassCode("123");
        st1.setPersonId(per1);
        st1.setStudentId(3456788);
        sr.add(st1);
    }
}
