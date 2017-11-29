/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ubt.kiosk.view;

import org.ubt.kiosk.ui.JPLoginScreen;
import java.awt.event.MouseAdapter;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author F
 */
public class JPLoginScreenTest {
    
    public JPLoginScreenTest() {
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
     * Test of getJtfpassCode method, of class JPLoginScreen.
     */
    @Test
    public void testGetJtfpassCode() {
        System.out.println("getJtfpassCode");
        JPLoginScreen instance = new JPLoginScreen();
        JPasswordField expResult = null;
        JPasswordField result = instance.getJtfpassCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJtfstudentId method, of class JPLoginScreen.
     */
    @Test
    public void testGetJtfstudentId() {
        System.out.println("getJtfstudentId");
        JPLoginScreen instance = new JPLoginScreen();
        JTextField expResult = null;
        JTextField result = instance.getJtfstudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJlpassCode method, of class JPLoginScreen.
     */
    @Test
    public void testGetJlpassCode() {
        System.out.println("getJlpassCode");
        JPLoginScreen instance = new JPLoginScreen();
        JLabel expResult = null;
        JLabel result = instance.getJlpassCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJlstudentId method, of class JPLoginScreen.
     */
    @Test
    public void testGetJlstudentId() {
        System.out.println("getJlstudentId");
        JPLoginScreen instance = new JPLoginScreen();
        JLabel expResult = null;
        JLabel result = instance.getJlstudentId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJllogin method, of class JPLoginScreen.
     */
    @Test
    public void testGetJllogin() {
        System.out.println("getJllogin");
        JPLoginScreen instance = new JPLoginScreen();
        JLabel expResult = null;
        JLabel result = instance.getJllogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJlcloseWindows method, of class JPLoginScreen.
     */
    @Test
    public void testGetJlcloseWindows() {
        System.out.println("getJlcloseWindows");
        JPLoginScreen instance = new JPLoginScreen();
        JLabel expResult = null;
        JLabel result = instance.getJlcloseWindows();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCloseMainWindowsMouseAdapter method, of class JPLoginScreen.
     */
    @Test
    public void testAddCloseMainWindowsMouseAdapter() {
        System.out.println("addCloseMainWindowsMouseAdapter");
        MouseAdapter e = null;
        JPLoginScreen instance = new JPLoginScreen();
        instance.addCloseMainWindowsMouseAdapter(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addLoginMouseAdapter method, of class JPLoginScreen.
     */
    @Test
    public void testAddLoginMouseAdapter() {
        System.out.println("addLoginMouseAdapter");
        MouseAdapter e = null;
        JPLoginScreen instance = new JPLoginScreen();
        instance.addLoginMouseAdapter(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testClassPath()
    {
        System.out.println(this.getClass().getResource("."));
    }
}
