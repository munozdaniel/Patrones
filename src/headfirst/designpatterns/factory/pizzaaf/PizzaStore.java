package headfirst.designpatterns.factory.pizzaaf;

public abstract class PizzaStore {
 
	protected abstract Gabinete createPizza(String item);
 
	public Gabinete orderPizza(String type) {
		Gabinete pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
