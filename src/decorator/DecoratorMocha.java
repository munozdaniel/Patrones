package decorator;

public class DecoratorMocha extends CondimentDecorator {
	Bebida beverage;
 
	public DecoratorMocha(Bebida beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
