package fr.ufrsciencestech.compteur.model;
public class Cerise implements Fruit{
    private double prix;
    private String origine;

    public Cerise()
    {
        this.prix = 0.8;  //prix en euros
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
	return this.prix;
    }

    public void setPrix(double prix){
        if(prix < 0)
	    this.prix = -prix; 
        else
            this.prix=prix;
    }

    public String getOrigine(){
	return this.origine;
    }

    public void setOrigine(String origine){
        if(origine.equals(""))
            this.origine = "Belgique"; 
        else
            this.origine=origine;
    }

    @Override
    public String toString(){
        return "Cerise de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 cerises sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Cerise b = (Cerise) o;
            return (prix == b.prix && origine.equals(b.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une cerise a un noyeau
        return true;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
	System.out.println("premier test Cerise");
        Cerise b = new Cerise(10,"france");
        System.out.println(b.toString());
   }
}