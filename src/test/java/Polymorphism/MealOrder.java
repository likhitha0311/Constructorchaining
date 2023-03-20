package Polymorphism;

public class MealOrder
{
	Burger burger;
	Drink drink;
	SideItem sideitem;
	
	
	




 class Burger
{
private String type;
private int price;
private int toppings;

public Burger(String type, int price) {
	super();
	this.type = type;
	this.price = price;
}


}

class Drink
{
	
	private String size;
	private String type;
	private int price;
	public Drink(String type, String size) {
		
		this.type = type;
		this.size = size;
		
		if (size == "Small")
		{
			this.price =10;
		}
		else if (size == "Medium")
		{
			this.price =15;
		}
		else if (size == "Large")
		{
			this.price =20;
		}
	}
	}
class SideItem{
	private String type;
	private int price;
	
	public SideItem(String type, int price) 
	{
		
		this.type = type;
		this.price = price;
	}
	
	
	
}
	
}
