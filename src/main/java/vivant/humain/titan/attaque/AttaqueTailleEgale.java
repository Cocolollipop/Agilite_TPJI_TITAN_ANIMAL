package vivant.humain.titan.attaque;

import mur.Mur;
/**
 * Pattern Strategy
 * Classe utilisée lorsque le titan est aussi grand que le mur
 * @author Cocolollipop
 *
 */
public class AttaqueTailleEgale implements AttaqueImpl{
	
	
	public String detruireMur(Mur mur) {
		int degat = mur.getTaille()/2;
		mur.setTaille(degat);
		return "Pas très efficace";
	}
	
}
