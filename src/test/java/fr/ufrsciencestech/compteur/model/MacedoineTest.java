/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.compteur.model;

import static junit.framework.Assert.assertTrue;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author hg642766
 */
public class MacedoineTest {
    
    Macedoine m;
    
   public MacedoineTest() {
        m = new Macedoine();
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of update method, of class Modele.
     */
     @Test
    public void testGetPrix() {
        System.out.println("getPrix");
        double prix = 5.6;
        assertTrue(m.getPrix() == prix);
    }
    
    @Test
    public void testAjoute() {
        System.out.println("Ajoute");
        int cpt =4;
        m.ajoute(new Banane());
        assertTrue(m.getMacedoine().size() == cpt+1);
    }
    
    @Test
    public void testRemove() {
        System.out.println("Remove");
        int cpt = 4;
        m.remove(1);
        assertTrue(m.getMacedoine().size() == cpt-1);
    }
    
    @Test
    public void testEquals() {
        System.out.println("Equals");
        Macedoine m2 = new Macedoine();

        assertEquals(m,m2);
    }
    
}
