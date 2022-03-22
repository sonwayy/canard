package canardB.model;

public class Leurre extends Canard{
	private String name;
	public Leurre(String name) {
		super(name);
	}
	@Override
	public String afficher() {
		return "Je suis un leurre";
	}
	@Override
	public String effectuerVol() {
		return "Je ne sais pas voler !";
	}
}
