package Composition;

public class SmartKitchen {

	private Refrigerator r;
	private DishWasher d; 
	private CoffeeMaker cm;
	
	public SmartKitchen(Refrigerator r, DishWasher d, CoffeeMaker cm) {
		
		this.r = r;
		this.d = d;
		this.cm = cm;
	}
	
	public void addWater()
	{
		cm.hasworktodo = true;
	}
	
	public void pourMilk()
	{
		r.hasworktodo = true;
	}
	
	public void loadDishwasher()
	{
		d.hasworktodo = true;
	}

}
