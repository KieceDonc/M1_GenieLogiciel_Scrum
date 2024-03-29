package fr.ufrsciencestech.compteur.model;
import java.util.*;
/**
 *
 * @author nous
 */
public class Panier {
    private ArrayList<Fruit> fruits;  //attribut pour stocker les fruits
    private int contenanceMax;        //nb maximum d'oranges que peut contenir le panier

    //groupe 1
    public Panier(int contenanceMax){  //initialise un panier vide ayant une certaine contenance maximale (precisee en parametre)
        this.fruits = new ArrayList<Fruit>();
        this.contenanceMax = contenanceMax;
    }

    @Override
    public String toString(){  //affichage de ce qui est contenu dans le panier : liste des fruits presents
        String msg = "Le panier peut contenir encore " + (this.getContenanceMax() - this.getTaillePanier()) + " fruits.\n" 
                + "Les fruits dans le panier sont: \n";
        for(int i = 0; i < fruits.size(); i++){
          msg += getFruit(i) +", \n";
        }
        return msg;
    }

    //groupe 2
    public ArrayList<Fruit> getFruits() {  //accesseur du premier attribut
       return fruits;
    }

    public void setFruits(ArrayList<Fruit> fruits) { //modificateur du premier attribut
        if (this.getContenanceMax() >= fruits.size())
            this.fruits = fruits;
        else
            this.fruits = new ArrayList<Fruit>();
    }

    public int getTaillePanier(){  //accesseur retournant la taille allouee pour l'attibut fruits
        return this.fruits.size();
    }


    public int getContenanceMax(){  //accesseur du second attribut
	return this.contenanceMax;
    }
    
    public void setContenanceMax(int contenanceMax){  
	this.contenanceMax = contenanceMax;
    }

    //groupe 3
    public Fruit getFruit(int i){  //accesseur retournant le fruit contenu dans le panier a l'emplacement n°i ou null s'il n'y a rien a cet emplacement
	return this.fruits.get(i);
    }

    public void setFruit(int i, Fruit f){  //modificateur du fruit contenu dans le panier a l'emplacement n°i par f (s'il y a bien deja un fruit a cet emplacement, ne rien faire sinon)
        this.fruits.remove(i);
        this.fruits.add(i, f);
    }

    public boolean estVide(){  //predicat indiquant que le panier est vide
	return this.fruits.isEmpty();
    }

    public boolean estPlein(){  //predicat indiquant que le panier est plein
        return this.getTaillePanier() == this.contenanceMax;
    }

    //groupe 4
    public void ajout(Fruit o) throws PanierPleinException{  //ajoute le fruit o a la fin du panier si celui-ci n'est pas plein
        if(contenanceMax <= fruits.size()) 
            throw new PanierPleinException();
        fruits.add(o);
    }

    //groupe 5
    public void retrait() throws PanierVideException{ //retire le dernier fruit du panier si celui-ci n'est pas vide
        if ( !this.estVide() )
        {
            this.fruits.remove(this.getTaillePanier()-1);
        }
        else{
            throw new PanierVideException();
        }
    }

    //groupe 6
    public double getPrix(){  //calcule le prix du panier par addition des prix de tous les fruits contenus dedans
	    double somme = 0;

        for(int i = 0; i < fruits.size(); i++)
            somme += fruits.get(i).getPrix();

        return somme;
    }

    //groupe 7
    public void boycotteOrigine(String origine){  //supprime du panier tous les fruits provenant du pays origine
        for(int x = 0; x < this.getTaillePanier(); x++ ){
            if(this.getFruit(x).getOrigine().equals(origine)){
                this.fruits.remove(x);
            }
        }
    }

    //groupe 8
    @Override
    public boolean equals(Object o){  ///predicat pour tester si 2 paniers sont equivalents : s'ils contiennent exactement les memes fruits
        //TODO : Test equals function
        if(!(o.getClass().equals(Panier.class))){
            return false;
        }else{
            Panier panier2 = (Panier) o;
            ArrayList<Fruit> fruitsP1 = fruits;
            ArrayList<Fruit> fruitsP2 = new ArrayList<>(panier2.getFruits());

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

    //tests
    public static void main (String[] args){
    	//Ecrire ici vos tests
	    System.out.println("premier test Panier");
    }
}
