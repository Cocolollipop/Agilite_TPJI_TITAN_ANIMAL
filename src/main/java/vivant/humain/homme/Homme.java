package vivant.humain.homme;

import java.util.ArrayList;
import java.util.List;

import vivant.Humain;
import vivant.faune.Animal;

public class Homme extends Humain {
	
	private String nom;
	private List<Animal> mesAnimaux = new ArrayList<Animal>();
	
	public Homme(){
		super();
		this.nom = "Jonh";
		
	}
	
	public Homme(String nom){
		super();
		this.nom = nom;
	}
	
	public void adopterAnimal(Animal animal){
		if(this.getMesAnimaux().contains(animal)){
			throw new IllegalArgumentException();
		}
		else{
		this.mesAnimaux.add(animal);
		animal.setProprietaire(this);
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Animal> getMesAnimaux() {
		return mesAnimaux;
	}

	public void setMesAnimaux(List<Animal> mesAnimaux) {
		this.mesAnimaux = mesAnimaux;
	}
	
	@Override
	public String courir(){
		return "Je cours comme un Homme";
	}
	
	

}
