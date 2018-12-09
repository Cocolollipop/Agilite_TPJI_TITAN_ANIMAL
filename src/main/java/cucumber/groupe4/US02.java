package cucumber.groupe4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mur.Mur;
import vivant.humain.titan.Titan;

import static org.junit.Assert.assertEquals;

public class US02 {

	Titan titan;
	Mur mur;
	String res;

	@Given("Un titan")
	public void un_titan() {
		titan = new Titan("Eren", 50, "COLOSSAL");
	}

	@Given("Un mur {string} {int}")
	public void un_mur(String nom, Integer taille) {
		mur = new Mur(nom, taille);
	}

	@When("il attaque le mur")
	public void il_attaque_le_mur() {
		res = titan.attaquerMur(mur);
	}

	@Then("j obtiens {string}")
	public void j_obtiens_resultat(String resultat) {
		assertEquals(resultat,res);
	}

}
