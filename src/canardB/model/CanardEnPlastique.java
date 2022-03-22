package canardB.model;

public class CanardEnPlastique extends Canard{
	private String name;
	public CanardEnPlastique(String name) {
		super(name);
	}
	@Override
	public String afficher() {
		return "Je suis un canard en plastique";
	}
}
