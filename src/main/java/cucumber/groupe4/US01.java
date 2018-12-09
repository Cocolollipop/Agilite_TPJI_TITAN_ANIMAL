package cucumber.groupe4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import vivant.humain.titan.Titan;
import static org.junit.Assert.assertEquals;

public class US01 {
	int taille;
	Titan titan;
	
	@Given("Les attributs {string} {int} {string}")
	public void les_attributs(String string, Integer int1, String string2) {
	    
	}

	@When("je cree un titan {string} {int} {string}")
	public void je_cree_un_titan(String nom, Integer taille, String type) {
	    titan = new Titan(nom,taille,type);
	    
	}

	@Then("j obtiens un titan {string} {int} {string}")
	public void j_obtiens_un_titan(String nom, int taille, String type) {
	    assertEquals(titan.getNom(),nom);
	    assertEquals(titan.getTaille(),taille);
	    assertEquals(titan.getType(),type);
	}


}
