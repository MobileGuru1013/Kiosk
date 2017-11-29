/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.bussiness;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author F
 */
public class PasswordHashingTest {
    
    public PasswordHashingTest() {
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
     * Test of encodehashPassword method, of class PasswordHashing.
     */
    @Test
    public void testEncodehashPassword() {
        System.out.println("encodehashPassword");
        String password = "password";
        PasswordHashing instance = new PasswordHashing();
        String expResult = "";
        String result = instance.encodehashPassword(password);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail. 
        fail("The test case is a prototype.");
    }

    /**
     * Test of decodehashPassword method, of class PasswordHashing.
     */
    @Ignore
    public void testDecodehashPassword() {
        System.out.println("decodehashPassword");
        String password = "";
        PasswordHashing instance = new PasswordHashing();
        String expResult = "";
        String result = instance.decodehashPassword(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testClassPath()
    {
        System.out.println(this.getClass().getResource("."));
    }
    
}
