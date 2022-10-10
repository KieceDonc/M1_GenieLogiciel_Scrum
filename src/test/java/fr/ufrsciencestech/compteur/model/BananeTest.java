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
public class BananeTest {
    Banane b;
    
    public BananeTest() {
        b = new Banane();
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
        int prix = 2;
        assertTrue(b.getPrix() == prix);
    }
    
    @Test
    public void testSetPrix() {
        System.out.println("setPrix");
        int prix = 2;
        b.setPrix(2);
        assertTrue(b.getPrix() == prix);
        
        //test avec des valeurs negatives
        b.setPrix(-4);
        assertTrue(b.getPrix() >= 0);
    }
    
    @Test
    public void testGetOrigine() {
        System.out.println("getOrigine");
        String origine = "Espagne";
        assertTrue(b.getOrigine().equals(origine));
    }
    
    @Test
    public void testSetOrigine() {
        System.out.println("setOrigine");
        String origine = "Espagne";
        b.setOrigine(origine);
        assertTrue(b.getOrigine().equals(origine));
        
        //test avec des chaines vide 
        b.setOrigine("");
        assertTrue(b.getOrigine().equals(origine));
    }
    
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Banane b2 = new Banane();
        assertTrue(b.getPrix() == b2.getPrix());
        assertTrue(b.getOrigine().equals(b2.getOrigine()));
    }
}
