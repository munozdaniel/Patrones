package inventario;


public class Impresora extends IntegrantesDecorator {
	Computadora computadora;

	public Impresora(Computadora computadora) {
		this.computadora = computadora;
	}

	public String getDescription() {
		return computadora.getDescription() + ", Impresora";
	}

	public double cost() {
		return .10 + computadora.cost();
	}

}
