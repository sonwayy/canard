package canardB.model;

import canardB.model.vol.ComportementVol;
import canardB.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard{
	private String name;
	public Colvert(String name) {
		super(name);
	}
	@Override
	public String afficher() {
		return "Je suis un vrai colvert";
	}
	@Override
	public String effectuerVol() {
		return "Je vole !";
	}
	@Override
	public String effectuerCancan() {
		return "Can-can";
	}
}
