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
	@Override
	public String effectuerVol() {
		return "Je ne sais pas voler !";
	}
	@Override
	public String effectuerCancan() {
		return "Coin-coin";
	}
}
