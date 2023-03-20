package Abstraction;

public class Dog extends Animal {

	public Dog(String type, String size, double weight) {
		super(type, size, weight);
		
	}

	@Override
	public void move(String speed) {
		if(speed =="slow")
		{
			System.out.println("Dog is walking");
			}
		
		else
		{
			System.out.println("Dog is running");
		}
		
	}

	@Override
	public void makeNoise() {
		if(type == "Wolf")
		{
			System.out.println("Wolf wuuur");
		}
		else
		{
			System.out.println("Ufffff");
		}
		
	}

}
