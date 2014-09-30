package decorator;

public class DescafeinadoComponent extends Bebida {
	public DescafeinadoComponent() {
		description = "Decaf Coffee";
	}
 
	public double cost() {
		return 1.05;
	}
}

