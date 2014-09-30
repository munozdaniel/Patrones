package decorator;
 
public class DecoratorWhip extends CondimentDecorator {
	Bebida beverage;
 
	public DecoratorWhip(Bebida beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
