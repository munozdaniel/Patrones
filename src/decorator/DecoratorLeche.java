package decorator;

public class DecoratorLeche extends CondimentDecorator {
	Bebida beverage;

	public DecoratorLeche(Bebida beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
