package Constructorsexamples;

public class Animal 
{
private String size;
private String type;
private int weight;

public Animal(String size, String type,int weight) 
{
	this.size = (weight>60) ?"big":(weight>40)?"medium":"small";
	this.type = type;
	this.weight = weight;
}
public void move()
{
	System.out.println(this.type + "moves");
}

public void makesNoise()
{
	System.out.println(this.type + "makes noise");
}
@Override
public String toString() {
	return "Animal [size=" + size + ", type=" + type + ", weight=" + weight + "]";
}




}
