/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.compteur.model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author vr144361
 */
public class JusTest {
    //Jus j;
    public JusTest() {
        //j= new Jus(new Cerise());
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
     * Test of isSeedless method, of class Jus.
     */
    @Test
    public void testIsSeedless() {
        System.out.println("isSeedless");
        Jus instance = new Jus(new Cerise());
        boolean expResult = true;
        boolean result = instance.isSeedless();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrix method, of class Jus.
     */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        Jus instance = new Jus(new Cerise());
        double expResult =(double) 0.96;
        double result = instance.getPrix();
        assertTrue(expResult == result);
        // TODO review the generatsed test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOrigine method, of class Jus.
     */
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        Jus instance = null;
        String expResult = "";
        String result = instance.getOrigine();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Jus.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jus instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
