/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur;

import fr.ufrsciencestech.compteur.controler.Controleur;
import fr.ufrsciencestech.compteur.view.*;
import fr.ufrsciencestech.compteur.model.*;

//utilise pour springIoC :
import javax.swing.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author celine
 */
public class TestMVC {
    private VueGSwingNew vueg;      //pour pouvoir changer de vue si on le souhaite
    private Controleur controleur;  //pour pouvoir changer de controleur si on le souhaite
    
    /**
     * @return the vueg
     */
    public VueGSwingNew getVueg() {
        return vueg;
    }

    /**
     * @param vueg the vueg to set
     */
    public void setVueg(VueGSwingNew vueg) {
        this.vueg = vueg;
    }

    /**
     * @return the controleur
     */
    public Controleur getControleur() {
        return controleur;
    }

    /**
     * @param controleur the controleur to set
     */
    public void setControleur(Controleur controleur) {
        this.controleur = controleur;
    }
    
    public TestMVC(){
      
        vueg = new VueGSwingNew();
        
        Panier p = new Panier(10);
        Cerise c = new Cerise();
        Banane b = new Banane();
        try{
            p.ajout(b);
            p.ajout(c);
        }
        catch(PanierPleinException e){System.out.println("Panier plein");}
        controleur = new Controleur();
        controleur.setModele(p);  
        controleur.setVue(vueg);     
        //controleur.
        vueg.addControleur(controleur);
        vueg.getJtextArea().append(p.toString());
    }
    
    public static void main(String[] args){
        TestMVC test = new TestMVC();    //sans utiliser SpringIoC
        
        
    }
}
