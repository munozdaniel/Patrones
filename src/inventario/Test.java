package inventario;

public class Test {

	public static void main(String[] args) {
		Computadora computadora = new HardwareComponent();
		computadora = new Impresora(computadora);
		computadora = new Teclado(computadora);
		computadora = new Monitor(computadora);

		System.out.println(computadora.getDescription() + " $"
				+ computadora.cost());
	}

}
