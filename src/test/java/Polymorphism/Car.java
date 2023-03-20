package Polymorphism;

public class Car
{
private String description;
public Car(String description) {
	
	this.description = description;
}

public void startEngine() 
{
	System.out.println("Main car engine");
}

public void drive() {
	System.out.println("Generic drive");
}
public static Car getCar(String cartype)
{
	return switch(cartype) {
	case "Gas" -> new Gaspoweredcar("hello gas",100.78,3);
	case "ElectricCar" -> new ElectricCar("hello gelectric",100.78,7);
	case "hybidCar" -> new hybidCar("hello hybrid",120.78,6,4);
	default->new Car("generic car");
	};
}
protected void runEngine()
{
	System.out.println("Ru engine of Main car");
}
}


class Gaspoweredcar extends Car
{
	private double avgkmperlitre;
	private int cylinders;
	public Gaspoweredcar(String description,double avgkmperlitre,int  cylinders) 
	{
		super(description);
		this.avgkmperlitre = avgkmperlitre;
		this.cylinders =  cylinders;
	}
	@Override
	protected void runEngine() {
		
		System.out.println("Run "+this.getClass().getSimpleName()+"engine");
	}
	
	
}
	class ElectricCar extends Car
	{
		private double avgkmperlitre;
		private int batterysize;
		public ElectricCar(String description,double avgkmperlitre,int  batterysize) {
			super(description);
			this.avgkmperlitre = avgkmperlitre;
			this.batterysize =  batterysize;
		}
		
		@Override
		protected void runEngine() {
			
			System.out.println("Run "+this.getClass().getSimpleName()+"engine");
		}
}
	
	class hybidCar extends Car
	{
		private double avgkmperlitre;
		private int batterysize;
		private int cylinders;
		public hybidCar(String description,double avgkmperlitre,int cylinders,int  batterysize) {
			super(description);
			this.avgkmperlitre = avgkmperlitre;
			this.batterysize =  batterysize;
			this.cylinders =  cylinders;
		}
		
		@Override
		protected void runEngine() {
			
			System.out.println("Run "+this.getClass().getSimpleName()+"engine");
		}
}
