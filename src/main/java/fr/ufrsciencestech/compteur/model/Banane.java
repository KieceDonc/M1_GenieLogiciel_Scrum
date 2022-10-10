package fr.ufrsciencestech.compteur.model;
public class Banane implements Fruit{
    private double prix;
    private String origine;

    public Banane()
    {
        this.prix = 2;  //prix en euros
        this.origine="Espagne";
    }

    public Banane(double prix, String origine)
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
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
    public boolean equals(Object o){  //predicat pour tester si 2 bananes sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Banane b = (Banane) o;
            return (prix == b.prix && origine.equals(b.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Banane a des pepins
        return false;
    }

    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Banane");
        Banane b = new Banane(10,"france");
        System.out.println(b.toString());
   }
}