/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.controler;

import fr.ufrsciencestech.compteur.view.VueGraphSwing;
import fr.ufrsciencestech.compteur.model.Modele;
import fr.ufrsciencestech.compteur.model.Panier;
import fr.ufrsciencestech.compteur.view.VueGSwingNew;
import java.awt.event.ActionEvent;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author celine
 */
public class ControleurTest {
    Controleur c1;
    Controleur c2;
    Panier m1, m2;
    VueGSwingNew vueg;
    ActionEvent einc;
    ActionEvent edec;

    public ControleurTest() {
    }
    
    @Before
    public void setUp(){
        /*c1 = new Controleur();
        c2 = new Controleur();
        m1 = new Panier(10);
        m2 = new Panier(10);
        vueg = new VueGSwingNew(); 
        c1.setModele(m1);*/
        
        //edec = new ActionEvent(vueg.getDec(), 1, "dec");
        //einc = new ActionEvent(vueg.getInc(), 0, "inc");
    }
    


}
