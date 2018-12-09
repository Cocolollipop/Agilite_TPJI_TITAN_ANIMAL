package cucumber.groupe4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vivant.Humain;
import vivant.humain.homme.Homme;
import vivant.humain.titan.Titan;

import static org.junit.Assert.assertEquals;

public class US04 {
	
	Humain humain;
	String courir;
	

	@Given("Un humain {string} {int}")
	public void un_humain(String nom, int taille) {
		humain = new Humain(nom,taille);
	}

	@When("je cours")
	public void je_cours() {
		 courir = humain.courir();
		
	}

	@Then("je cours a ma facon {string}")
	public void je_cours_a_ma_facon(String resultat) {
		assertEquals(resultat,courir);
	}

	@Given("Un titan {string} {int} {string}")
	public void un_titan(String nom, int taille, String type) {
		humain = new Titan(nom, taille, type);
	}

	@Given("Un homme {string}")
	public void un_homme(String nom) {
		humain = new Homme(nom);
	}
 
}
