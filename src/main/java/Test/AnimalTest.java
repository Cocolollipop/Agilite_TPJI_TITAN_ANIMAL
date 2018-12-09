package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import vivant.faune.Animal;
import vivant.humain.homme.Homme;

public class AnimalTest {

	 
	public void testConstructeur(){
		//Test Homme
		Homme homme = new Homme();
		assertEquals("test constructeur Homme","Jonh", homme.getNom());

		Homme homme2 = new Homme("Thomas");
		assertEquals("test constructeur Homme avec nom", "Thomas", homme2.getNom());
		homme2.setNom("Matt");
		assertEquals("test  modif nom Homme", "Matt", homme2.getNom());
		
		//Test Animal
		Animal animal = new Animal();
		assertEquals("test constructeur Animal","SansNom", animal.getNom());

		Animal chat = new Animal("Patrick", 18, "noir", 11);
		assertEquals("Patrick", chat.getNom());
		assertEquals(18, chat.getAge());

	}
	 
	public void testModifierAnimal(){
		Animal chat = new Animal("Patrick", 18, "noir", 11);
		chat.setNom("Marou");
		assertEquals("Marou",chat.getNom());
		chat.getCollier().setCouleur("rouge");
		assertEquals("rouge",chat.getCollier().getCouleur());
		chat.getCollier().setLongueur(14);
		assertEquals(14,chat.getCollier().getLongueur());
		
	}
	
	/**
	 * Test d'association bidirectionnelle
	 */
	 
	public void testAdopterAnimal(){
		Homme homme = new Homme();
		Animal chat = new Animal("Patrick", 18, "noir", 11);
		homme.adopterAnimal(chat);
		try{
		homme.adopterAnimal(chat);
		fail("expected IllegalArgumentException");
		} catch(IllegalArgumentException e){
			
		}
		assertTrue("test adopter", homme.getMesAnimaux().contains(chat));
		assertEquals("test proprietaire",chat.getProprietaire(),homme);
		
	}
	/**
	 * Test methode simples
	 */
	 
	public void testSePresenter(){
		Animal chat = new Animal("Patrick", 18, "noir", 11);
		String texte = "Je suis Patrick,";
		texte+="18 ans";
		assertEquals(texte,chat.toString());
		
	}
	
	/**
	 * Test d une exception
	 */
	 
	public void testArgument(){
		Animal chat = new Animal("Patrick", 18, "noir", 11);
		
		try{
			chat.setAge(-5);
			fail("expected IllegalArgumentException");
		} catch(IllegalArgumentException e){
			
		}
	}
}
