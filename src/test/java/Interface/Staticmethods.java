package Interface;
class Prent
{
	public static void display()
	{
		System.out.println("Parent class methods");
	}
}
public class Staticmethods extends Prent
{
	public static void display2()
	{
		System.out.println("Child class methods");
	}
	
	public static void display()
	{
		System.out.println("Child class methods");
	}
	
	public static void main(String[] args) {
		
		Staticmethods s= new Staticmethods();
		Prent.display();
		Staticmethods.display();
	}

}
