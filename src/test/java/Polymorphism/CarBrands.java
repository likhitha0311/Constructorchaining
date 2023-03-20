package Polymorphism;

public class CarBrands 

{
	private boolean engine; 

	private int cylinders ;

	private String name ;

	private int wheels ;

	public CarBrands(int cylinders, String name) {
		
		this.cylinders = cylinders;
		this.name = name;
		this.wheels=4;
		this.engine =true;
	}
	
	public String startEngine()
	{
		return "Engine is starting->"+getClass().getSimpleName();
	}
	
	public String accelerate()
	{
		return "Car is accelerating->"+getClass().getSimpleName();
	}
		public String brake()
		{
			return "Car is breaking->"+getClass().getSimpleName();
		}

		public int getCylinders() {
			return cylinders;
		}

		

		public String getName() {
			return name;
		}

		

} 

class Mitsubishi extends CarBrands{

	public Mitsubishi(int cylinders, String name) {
		super(cylinders, name);
		
	}

	@Override
	public String startEngine() {
		
		return "Mitsibishi Engine is starting->"+getClass().getSimpleName();
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Mitsibishi is accelerating->"+getClass().getSimpleName();
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Mitsibishiis breaking->"+getClass().getSimpleName();
	}
	

}

class Holden extends CarBrands{

	public Holden(int cylinders, String name) {
		super(cylinders, name);
		
	}
	
	@Override
	public String startEngine() {
		
		return "HoldenEngine is starting->"+getClass().getSimpleName();
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Holden is accelerating->"+getClass().getSimpleName();
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Holden is breaking->"+getClass().getSimpleName();
	}


} 

class Ford extends CarBrands{

	public Ford(int cylinders, String name) {
		super(cylinders, name);
		
	}
	
	@Override
	public String startEngine() {
		
		return "Ford Engine is starting->"+getClass().getSimpleName();
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Ford is accelerating->"+getClass().getSimpleName();
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Ford is breaking->"+getClass().getSimpleName();
	}
}

