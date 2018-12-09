package vivant.humain.titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque le titan est plus petit que le mur
 * @author Cocolollipop
 *
 */
public class AttaqueTailleInf implements AttaqueImpl{
	
	
	public String detruireMur(Mur mur) {
		return "Le mur a senti des chatouilles..";
	}
	
}
