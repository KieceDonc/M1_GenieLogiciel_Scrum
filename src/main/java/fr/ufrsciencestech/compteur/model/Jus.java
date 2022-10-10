package fr.ufrsciencestech.compteur.model;
/**
 * 
 * @author Cybermade
 */

public class Jus implements Fruit {
    private Fruit f;

    Jus(Fruit f)
    {
        this.f = f;

    }
    @Override
    public boolean isSeedless() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public double getPrix() {
        // TODO Auto-generated method stub
        return f.getPrix()*1.2;
    }

    @Override
    public String getOrigine() {
        // TODO Auto-generated method stub
        return f.getOrigine();
    }
    @Override
    public String toString(){
        return "Jus de " + f.toString() + " et le prix du jus est à " + f.getPrix()*1.2 + " euros";
    }

    public static void main (String[] args){
        //Ecrire ici vos tests
        Jus j = new Jus(new Banane());
	       System.out.println("premier test jus");
         
         System.out.println(j.toString());

   }
}
