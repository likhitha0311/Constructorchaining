package Constructorsexamples;

public class MainAnimal {

	public static void main(String[] args) 
	{
		Animal animal = new Animal("big", "Generic animal ",70);
		doAnimalStuff(animal);
		Dog dog = new Dog(null, null, 0, null, null);
		doAnimalStuff(dog);
	}
	
	public static void doAnimalStuff(Animal animal) 
	{
		animal.makesNoise();
		animal.move();
		System.out.println(animal);
		
	}

}
