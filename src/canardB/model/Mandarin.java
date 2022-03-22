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
	@Override
	public String effectuerVol() {
		return "Je vole !";
	}
	@Override
	public String effectuerCancan() {
		return "Can-can";
	}
}
