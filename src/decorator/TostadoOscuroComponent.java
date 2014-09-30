package decorator;

public class TostadoOscuroComponent extends Bebida {
	public TostadoOscuroComponent() {
		description = "Dark Roast Coffee";
	}
 
	public double cost() {
		return .99;
	}
}

