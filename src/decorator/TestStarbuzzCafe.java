package decorator;

public class TestStarbuzzCafe {
 
	public static void main(String args[]) {
		Bebida beverage = new EspressoComponent();
		System.out.println(beverage.getDescription() 
				+ " $" + beverage.cost());
 
		Bebida beverage2 = new TostadoOscuroComponent();
		beverage2 = new DecoratorMocha(beverage2);
		beverage2 = new DecoratorMocha(beverage2);
		beverage2 = new DecoratorWhip(beverage2);
		System.out.println(beverage2.getDescription() 
				+ " $" + beverage2.cost());
 
		Bebida beverage3 = new MezclaDeLaCasaComponent();
		beverage3 = new DecoratorSoja(beverage3);
		beverage3 = new DecoratorMocha(beverage3);
		beverage3 = new DecoratorWhip(beverage3);
		System.out.println(beverage3.getDescription() 
				+ " $" + beverage3.cost());
	}
}
