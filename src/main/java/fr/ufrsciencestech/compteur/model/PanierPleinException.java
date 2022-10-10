package fr.ufrsciencestech.compteur.model;
/**
 *
 * @author nous
 */
public class PanierPleinException extends Exception {
    
    public PanierPleinException()
    {
	super("Ajout impossible car le panier est plein !");
    }
}