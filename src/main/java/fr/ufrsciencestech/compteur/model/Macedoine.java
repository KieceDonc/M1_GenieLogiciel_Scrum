/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.ufrsciencestech.compteur.model;
import java.util.ArrayList;

/**
 *
 * @author hg642766
 */
public class Macedoine implements Fruit {
    
    
    private ArrayList<Fruit> lstFruits;
    private boolean seedless;
    
    public Macedoine(){
       this.lstFruits = new ArrayList<Fruit>();
       this.seedless = false;
    }
    
    public ArrayList<Fruit> getMacedoine() {  //accesseur du premier attribut
       return this.lstFruits;
    }
    
    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
        this.lstFruits = fruits;
    }
    
    public void ajoute(Fruit f){
        this.lstFruits.add(f);
    }
    
    public void remove(int i){
        this.lstFruits.remove(i);
    }
    
    public String ToString(){
        String s = "La macédoine contient : ";
        for(int i=0;i<this.lstFruits.size();i++){
            s+=lstFruits.get(i)+", \n";
        }
        return s;
    }
    
    public double getPrix(){
        double prix =0;
        for(int i=0; i<this.lstFruits.size();i++){
            prix += this.lstFruits.get(i).getPrix();
        }
        return prix;
    }
    
    public boolean isSeedless(){
        return this.seedless;
    }
    
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        //TODO : Test equals function
        if(!(o.getClass().equals(Panier.class))){
            return false;
        }else{
            Macedoine m2 = (Macedoine) o;
            ArrayList<Fruit> fruitsP1 = this.lstFruits;
            ArrayList<Fruit> fruitsP2 = new ArrayList<>(m2.getMacedoine());

            if(!(fruitsP1.size() == fruitsP2.size())){
                return false;
            }else{
                for(int indexP1 = 0; indexP1 < fruitsP1.size(); indexP1++){
                    Fruit currentFruit = fruitsP1.get(indexP1);
                    int indexFruit = fruitsP2.indexOf(currentFruit);

                    if(indexFruit == -1){
                        return false;
                    }else{
                        fruitsP2.remove(indexFruit);
                    }
                }

            }

            return true;
        }
    }
    
    public String getOrigine(){
        return "";
    } 
}