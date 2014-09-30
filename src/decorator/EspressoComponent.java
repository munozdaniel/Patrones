package decorator;

public class EspressoComponent extends Bebida {
  
	public EspressoComponent() {
		description = "Espresso";
	}
  
	public double cost() {
		return 1.99;
	}
}

