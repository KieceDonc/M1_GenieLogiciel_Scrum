package fr.ufrsciencestech.compteur.model;
public class Cerise implements Fruit{
    private double prix;
    private String origine;

    public Cerise()
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Belgique";
    }

    public Cerise(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Belgique";  //Espagne par défaut
	else
            this.origine = origine;
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }

    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Banane de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 oranges sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Cerise b = (Cerise) o;
            return (prix == b.prix && origine.equals(b.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une orange a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	       System.out.println("premier test Cerise");
         Cerise b = new Cerise(10,"france");
         System.out.println(b.toString());

   }
}