package canardB.model;

public class Canard {
	
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
	
}
