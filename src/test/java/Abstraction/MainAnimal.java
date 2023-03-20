package Abstraction;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<>(10);
		list.add(new Dog("Golden","Large",10));
		list.add(new Dog("Wolf","Large",10));
		list.add(new Fish("Golden fish","Small",50));
		list.add(new Horse("Cladesale","Medium",60));
		list.add(new Dog("Wolfeverine","Large",40));
		
		for(Animal animal:list)
		{
			doAnimalStuff(animal);
		}

	}
	
	private static void doAnimalStuff(Animal animal)
	{
		animal.makeNoise();
		animal.move("fast");
		if(animal instanceof Mammal v)
		{
			v.shedhair();
		}
	}

}
