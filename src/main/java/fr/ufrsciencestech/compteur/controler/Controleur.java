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
            try{
                m.ajout(f);
            }
            catch(PanierPleinException p){System.out.println("Panier plein");}
            this.vg.getJtextArea().setText("");
            this.vg.getJtextArea().append(m.toString());
        }
        else if(((Component)e.getSource()).getName().equals("RemoveLastFruit")){
            try{
                m.retrait();
            }
            catch(PanierVideException p){System.out.println("Panier Vide");}
            this.vg.getJtextArea().setText("");
            this.vg.getJtextArea().append(m.toString());
        }
        else{
            System.out.println(((Component)e.getSource()).getName());
        }
    }
    public void setModele(Panier m){
        this.m = m;
        
    }
    public void setVue(VueGSwingNew vg){
        this.vg = vg;
    }
}
