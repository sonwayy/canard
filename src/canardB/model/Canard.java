package canardB.model;

import canardB.model.cancan.ComportementCancan;
import canardB.model.vol.ComportementVol;

public class Canard implements ComportementVol{
	
	private String name;
	public Canard(String name){
		this.name = name;
	}
	public String nager() {
		return "Tous les canards flottent, même les leurres !";
	}
	public String afficher() {
		return "Je suis un canard !";
	}
	public String getNom() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String effectuerVol() {
		return ComportementVol.voler();
	}
	public String effectuerCancan() {
		return ComportementCancan.cacaner();
	}
	
}
