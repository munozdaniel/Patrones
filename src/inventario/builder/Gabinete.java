package inventario.builder;

import inventario.Computadora;
import inventario.IntegrantesDecorator;


public class Gabinete extends IntegrantesDecorator {
	Computadora computadora;

	public Gabinete(Computadora computadora) {
		this.computadora = computadora;
		
	}

	public Gabinete() {
		// TODO Auto-generated constructor stub
	}

	public String getDescription() {
		return computadora.getDescription() + ", Gabinete";
	}

	public double cost() {
		return .10 + computadora.cost();
	}
	
	/**
	 * Builder
	 */
	
	/** "Product" */
	 private String placaDeVideo = "";
	 private String placaDeSonido = "";
	 private String procesador = "";
	 
	 public void setPlacaDeVideo(String placadevideo) {
	  this.placaDeVideo = placadevideo;
	 }
	 
	 public void setPlacaDeSonido(String placadesonido) {
	  this.placaDeSonido = placadesonido;
	 }
	 
	 public void setProcesador(String procesador) {
	  this.procesador = procesador;
	}
}
