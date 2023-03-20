package Constructorsexamples;

public class Dog extends Animal
{
private int weight;
private String height;
private String shape;

	public Dog(String size, String type, int weight) {
		super(size, type, weight);
	
	}

	public Dog(String size, String type, int weight, String shape,String height) {
		this(size, type, weight);
		this.shape = shape;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Dog [weight=" + weight + ", height=" + height + ", shape=" + shape + "]";
	}

	
	
	
	

}
