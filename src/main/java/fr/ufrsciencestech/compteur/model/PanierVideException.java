package fr.ufrsciencestech.compteur.model;
/**
 *
 * @author nous
 */
public class PanierVideException extends Exception {
    public PanierVideException()
    {
	super("Suppression impossible car le panier est vide !");
    }
}