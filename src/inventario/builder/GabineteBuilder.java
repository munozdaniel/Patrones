package inventario.builder;

public abstract class GabineteBuilder {
	/** "Abstract Builder" */
	protected Gabinete gabinete;

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void createNewGabineteProduct() {
		gabinete = new Gabinete();
	}

	public abstract void buildPlacaDeVideo();

	public abstract void buildPlacaDeSonido();

	public abstract void buildProcesador();

}
