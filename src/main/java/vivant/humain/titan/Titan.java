package vivant.humain.titan;

import java.util.ArrayList;
import java.util.List;

import mur.Mur;
import vivant.Humain;
import vivant.humain.titan.attaque.AttaqueImpl;
import vivant.humain.titan.attaque.AttaqueTailleEgale;
import vivant.humain.titan.attaque.AttaqueTailleInf;
import vivant.humain.titan.attaque.AttaqueTailleSup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Décrivez votre classe Titan ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Titan extends Humain {
	
	public enum Type{
		COLOSSAL,CUIRASSE,DEVIANT;
		
	}

	// variables d'instance - remplacez l'exemple qui suit par le vôtre
	private int taille = 5; // en metre
	private String nom;
	private Mur frontal = new Mur();
	private Mur central = new Mur();
	private Mur intermediaire = new Mur();
	private List<Mur> listeMurs = new ArrayList<Mur>();
	private AttaqueImpl strategieAttaque;
	private String type;

	/**
	 * Constructeur d'objets de classe Titan
	 */
	public Titan(String nom, int taille) {
		super(nom, taille);
		type = Type.DEVIANT.toString();
	}

	public Titan(){
		super();
	}
	public Titan(String nom, Integer taille, String type) {
		this.nom=nom;
		this.taille = taille;
		this.type = type;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * 
	 * Demolir le mur 
	 * 
	 */

	public void demolirMur(Mur mur) {
		if (mur.getNom().equals("Intermediaire") && frontal.getNom().equals("Frontal")) {
			intermediaire = mur;
		}
		if (mur.getNom().equals("Centrale") && frontal.getNom().equals("Frotal")
				&& intermediaire.getNom().equals("Intermediaire")) {
			central = mur;
		}
		if (mur.getNom().equals("Frontal")) {
			frontal = mur;
		}
		mur.setTitan(this);
	}

	public List<Mur> getMurDemoli() {
		return listeMurs;
	}

	public String getNom() {
		return nom;
	}

	public int getTaille() {
		return taille;
	}

	public Mur getFrontal() {
		return frontal;
	}

	public void setFrontal(Mur frontal) {
		this.frontal = frontal;
	}

	public Mur getCentral() {
		return central;
	}

	public void setCentral(Mur central) {
		this.central = central;
	}

	public Mur getIntermediaire() {
		return intermediaire;
	}

	public void setIntermediaire(Mur intermediaire) {
		this.intermediaire = intermediaire;
	}

	public List<Mur> getListeMurs() {
		return listeMurs;
	}

	public void setListeMurs(List<Mur> listeMurs) {
		this.listeMurs = listeMurs;
	}

	public AttaqueImpl getStrategieAttaque() {
		return strategieAttaque;
	}

	public void setStrategieAttaque(AttaqueImpl strategieAttaque) {
		this.strategieAttaque = strategieAttaque;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * 
	 * AJOUT DU PATTERN STRATEGY
	 * 
	 * 
	 */
	/**
	 * Le titan choisit la stratégie a appliquer en fonction de la taille du mur
	 * 
	 * @param mur
	 */
	public void evaluerMur(Mur mur) {

		if (this.getTaille() == mur.getTaille()) {
			strategieAttaque = new AttaqueTailleEgale();
		} else if (this.getTaille() < mur.getTaille()) {
			strategieAttaque = new AttaqueTailleInf();
		} else if (this.getTaille() > mur.getTaille()) {
			strategieAttaque = new AttaqueTailleSup();
		}

	}

	/**
	 * Le titan attaque
	 * 
	 * @param strategy
	 * @param mur
	 * @return
	 */
	public String attaquerMur(Mur mur) {
		evaluerMur(mur);
		return strategieAttaque.detruireMur(mur);
	}

	@Override
	public String courir() {
		return "Je zig-zag comme un Titan";
	}
}
