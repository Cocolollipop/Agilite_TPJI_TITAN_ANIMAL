package vivant.faune;

import vivant.EtreVivant;
import vivant.humain.homme.Homme;
/**
 * Classe fétiche Animal
 *
 */
public class Animal extends EtreVivant {
	private int age;
	private String nom;
	private Collier collier;
	private Homme proprietaire;
	
	/**
	 * Constructeur par defaut d'objets de classe Animal
	 */
	public Animal(){
		super();
		this.age = 0;
		this.nom = "SansNom";
		
	}
	
	/**
	 * Constructeur d'objets de classe Animal à collier
	 */
	public Animal(String name, int age, String couleur, int longueur){
		super();
		this.age = age;
		this.nom = name;
		this.collier = new Collier(couleur, longueur);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0){
			throw new IllegalArgumentException();
		} else{
		this.age = age;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Collier getCollier() {
		return collier;
	}

	public void setCollier(Collier collier) {
		this.collier = collier;
	}

	public Homme getProprietaire() {
		return proprietaire;
	}
	

	public void setProprietaire(Homme homme) {
		this.proprietaire = homme;
		
	}
	
	public String toString(){
		String texte = "Je suis " + this.getNom() + ",";
		texte+= this.getAge() + " ans";
		return texte;
	}

}
