/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.compteur.controler;


import fr.ufrsciencestech.compteur.view.*;
import fr.ufrsciencestech.compteur.model.*;
import fr.ufrsciencestech.compteur.model.Panier;
import fr.ufrsciencestech.compteur.model.PanierPleinException;
import fr.ufrsciencestech.compteur.model.PanierVideException;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;

/**
 *
 * @author celine
 */
public class Controleur implements ActionListener {
    private Panier m;
    private VueGSwingNew vg;
    
    
    @Override
    public void actionPerformed(ActionEvent e){   //Invoked when an action occurs
        if(((Component)e.getSource()).getName().equals("AddFruit")) 
        {
            int index = vg.getItemJCombo();
            Fruit f =null;
            if(index == 0){
                f = new Banane();
            }
            else if(index == 1){
                f = new Cerise();
            }
            else{
                f = new Macedoine();
            }
            try{
                m.ajout(f);
                this.vg.getJtextArea().setText("");
                this.vg.getJtextArea().append(m.toString());
            }
            catch(PanierPleinException p){
                this.vg.getJtextArea().setText("");
                this.vg.getJtextArea().append(m.toString() +"\n\n PANIER PLEIN");
                System.out.println("Panier plein");
            }
            
        }
        else if(((Component)e.getSource()).getName().equals("RemoveLastFruit")){
            try{
                m.retrait();
                this.vg.getJtextArea().setText("");
                this.vg.getJtextArea().append(m.toString());
            }
            catch(PanierVideException pp){
                System.out.println("Panier Vide");
                this.vg.getJtextArea().setText("");
                this.vg.getJtextArea().append("PANIER VIDE");
            }
            
        }
        
    }
    public void setModele(Panier m){
        this.m = m;
        
    }
    public void setVue(VueGSwingNew vg){
        this.vg = vg;
    }
}
