package inventario.builder;

public class TestBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/** A given type of pizza being constructed. */
		  GabineteDirector gabinetedirector = new GabineteDirector();
		  
		  PlacaDeSonido placadesonido = new PlacaDeSonido();
		  PlacaDeVideo placadevideo = new PlacaDeVideo();
		  
		  gabinetedirector.setGabineteBuilder(placadesonido);
		  gabinetedirector.setGabineteBuilder(placadevideo);
		  gabinetedirector.constructorGabinete();
		 
		  Gabinete gabinete	 = gabinetedirector.getPizza();
		 }

}
