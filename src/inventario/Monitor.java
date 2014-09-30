package inventario;

public class Monitor extends IntegrantesDecorator {
	Computadora computadora;

	public Monitor(Computadora beverage) {
		this.computadora = beverage;
	}

	public String getDescription() {
		return computadora.getDescription() + ", Monitor";
	}

	public double cost() {
		return .10 + computadora.cost();
	}

}
