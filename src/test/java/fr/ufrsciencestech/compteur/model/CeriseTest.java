/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.model;

import static junit.framework.Assert.*;
import org.junit.*;

/**
 *
 * @author celine
 */
public class CeriseTest {
    Cerise c;
    
    public CeriseTest() {
        c = new Cerise();
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
    * Test of update method, of class Banane.
    */
    @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double prix = 0.8;
        assertTrue(c.getPrix() == prix);
    }
    
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        double prix = 0.8;
        c.setPrix(prix);
        assertTrue(c.getPrix() == prix);
        
        //test avec des valeurs negatives
        c.setPrix(-4);
        assertTrue(c.getPrix() >= 0);
    }
    
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String origine = "Belgique";
        assertTrue(c.getOrigine().equals(origine));
    }
    
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "Andalousie";
        c.setOrigine(origine);
        assertTrue(c.getOrigine().equals(origine));
        
        //test avec des chaines vide 
        c.setOrigine("");
        assertTrue(c.getOrigine().equals("Belgique"));
    }
    
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Cerise c2 = new Cerise();
        assertTrue(c.getPrix() == c2.getPrix());
        assertTrue(c.getOrigine().equals(c2.getOrigine()));
    }
}
