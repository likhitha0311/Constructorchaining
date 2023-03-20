package Composition;

public class MainKitchen {

	public static void main(String[] args) {
		
		Refrigerator r =  new Refrigerator(true);
		DishWasher d =new DishWasher(true);
		CoffeeMaker cm = new CoffeeMaker(true);
		
		SmartKitchen s = new SmartKitchen(r,d,cm);
	}

}

class Refrigerator{
	
	public boolean hasworktodo;

	public Refrigerator(boolean hasworktodo) {
	
		this.hasworktodo = hasworktodo;
	}
	
	public void orderFood()
	{
		System.out.println("Referigerator is ordering food");
	}
	
	
}

class DishWasher{
	
	public boolean hasworktodo;

	public DishWasher(boolean hasworktodo) {
	
		this.hasworktodo = hasworktodo;
	}
	
	public void doDishes()
	{
		System.out.println("DishWasherr is cleaning dishes");
	}
	
	
}

class CoffeeMaker{
	
	public boolean hasworktodo;

	public CoffeeMaker(boolean hasworktodo) {
	
		this.hasworktodo = hasworktodo;
	}
	
	public void brewCoffee()
	{
		System.out.println("CoffeeMaker is making coffee");
	}
	
	
}
