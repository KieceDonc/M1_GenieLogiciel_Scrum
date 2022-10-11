/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package fr.ufrsciencestech.compteur.view;

import fr.ufrsciencestech.compteur.controler.Controleur;
import javax.swing.JTextArea;
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
public class VueGSwingNewTest {
    
    public VueGSwingNewTest() {
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
     * Test of addControleur method, of class VueGSwingNew.
     */
    @Test
    public void testAddControleur() {
        System.out.println("addControleur");
        Controleur c = null;
        VueGSwingNew instance = new VueGSwingNew();
        instance.addControleur(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJtextArea method, of class VueGSwingNew.
     */
    @Test
    public void testGetJtextArea() {
        System.out.println("getJtextArea");
        VueGSwingNew instance = new VueGSwingNew();
        JTextArea expResult = null;
        JTextArea result = instance.getJtextArea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemJCombo method, of class VueGSwingNew.
     */
    @Test
    public void testGetItemJCombo() {
        System.out.println("getItemJCombo");
        VueGSwingNew instance = new VueGSwingNew();
        int expResult = 0;
        int result = instance.getItemJCombo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class VueGSwingNew.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        VueGSwingNew.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
