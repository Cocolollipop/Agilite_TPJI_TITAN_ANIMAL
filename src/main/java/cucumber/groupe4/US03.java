package cucumber.groupe4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vivant.faune.Animal;
import vivant.humain.homme.Homme;

public class US03 {

	Animal animal;
	Homme homme;

	@Given("Un homme quelconque {string}")
	public void un_homme_quelconque(String nom) {
		homme = new Homme(nom);
	}

	@Given("Un animal {string} {int} {string} {int}")
	public void un_animal(String nom, int age, String couleurCollier, int longueurCollier) {
		animal = new Animal(nom, age, couleurCollier, longueurCollier);
	}

	@When("l homme adopte animal")
	public void l_homme_adopte_animal() {
		homme.adopterAnimal(animal);

	}

	@Then("le lien entre les deux se créer")
	public void le_lien_entre_les_deux_se_créer() {
		assertTrue("test adopter", homme.getMesAnimaux().contains(animal));
		assertEquals("test proprietaire",animal.getProprietaire(),homme);
	}

}
