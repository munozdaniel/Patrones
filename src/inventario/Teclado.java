package inventario;

public class Teclado extends  IntegrantesDecorator {
	Computadora computadora;

	public Teclado(Computadora beverage) {
		this.computadora = beverage;
	}

	public String getDescription() {
		return computadora.getDescription() + ", Teclado";
	}

	public double cost() {
		return .10 + computadora.cost();
	}


}
