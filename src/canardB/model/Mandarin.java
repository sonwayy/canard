package canardB.model;

public class Mandarin extends Canard{
	private String name;
	public Mandarin(String name) {
		super(name);
	}
	@Override
	public String afficher() {
		return "Je suis un vrai mandarin";
	}
}
