/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mur;

import vivant.humain.titan.Titan;

/**
 * Décrivez votre classe Mur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Mur {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private Titan titan;
    private String nom = "Mur";
    private int ordre;
    private int taille;

    /**
     * Constructeur d'objets de classe Mur
     *
     */
    public Mur() {
    	this.taille = 10;
    }
    
    /**
     * 
     * @param nom
     */
   public Mur(String nom, int taille){
	   this.nom = nom;
	   this.taille = taille;
   }

    public Mur(String nom) {
        this.nom = nom;
    }

    public Mur(int ordre) {
        this.ordre = ordre;
    }

    public void setTitan(Titan titan) {
        this.titan = titan;
    }

    public Titan murDetruitPar() {
        return titan;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getOrdre() {
        return ordre;
    }

    public void setOrdre(int ordre) {
        this.ordre = ordre;
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param y le paramètre de la méthode
     * @return la somme de x et de y
     */
    public int sampleMethod(int y) {
        // Insérez votre code ici
        return y;
    }

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public Titan getTitan() {
		return titan;
	}


}
