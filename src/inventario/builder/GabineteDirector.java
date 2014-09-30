package inventario.builder;

public class GabineteDirector {
	/** "Director" */
	 private GabineteBuilder gabineteBuilder;
	  
	 public void setGabineteBuilder(GabineteBuilder pb) {
	  gabineteBuilder = pb;
	 }
	 
	 public Gabinete getPizza() {
	  return gabineteBuilder.getGabinete();
	 }
	 
	 public void constructorGabinete() {
	  gabineteBuilder.createNewGabineteProduct();
	  gabineteBuilder.buildPlacaDeSonido();
	  gabineteBuilder.buildPlacaDeVideo();
	  gabineteBuilder.buildProcesador();
	 }
}
