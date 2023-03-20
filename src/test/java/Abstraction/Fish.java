package Abstraction;

public class Fish extends Animal {

	public Fish(String type, String size, double weight) {
		super(type, size, weight);
		
	}

	@Override
	public void move(String speed) {
		if(speed =="slow")
		{
			System.out.println("Fish is walking");
			}
		
		else
		{
			System.out.println("Fish is running");
		}
		
	}

	@Override
	public void makeNoise() {
		if(type == "Gold Fish")
		{
			System.out.println("swish");
		}
		else
		{
			System.out.println("splash");
		}
		
	}

}
