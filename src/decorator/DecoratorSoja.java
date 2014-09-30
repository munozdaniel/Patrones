package decorator;

public class DecoratorSoja extends CondimentDecorator {
	Bebida beverage;

	public DecoratorSoja(Bebida beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soja";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
