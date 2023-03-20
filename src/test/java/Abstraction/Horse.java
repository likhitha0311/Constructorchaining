package Abstraction;

public class Horse extends Mammal {

	public Horse(String type, String size, double weight) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void shedhair() {
		System.out.println("Horse sheds hair during summer");
		
	}

	@Override
	public void move(String speed) {
		System.out.println("Horse runs during summer");
		
	}

	@Override
	public void makeNoise() {
		System.out.println("Horse make ahhh sound");
		
	}

}
