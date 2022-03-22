package canardB.model;

public class Colvert extends Canard{
	private String name;
	public Colvert(String name) {
		super(name);
	}
	@Override
	public String afficher() {
		return "Je suis un vrai colvert";
	}
}
