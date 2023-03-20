package Interface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface FlightEnabled
{
	void flight();
	void track();
	default void privateMethod()
	{
		System.out.println("Hello I am the private method of interface");
	}
}

record Birdrecord(String type,String distance)implements  FlightEnabled{

	@Override
	public void flight() {
	System.out.println("Flight method in record type");
	
	}

	@Override
	public void track() {
		// TODO Auto-generated method stub
		
	}
	
	public  void privateMethod()
	{
		System.out.println("Hello I am the private method of interface");
	}

}

 enum Birdenum implements FlightEnabled{GROUNDED,TAKEOFF,LAND
	;

	@Override
	public void flight() {
		System.out.println("Flight method in enum type");
		
	}

	@Override
	public void track() {
		// TODO Auto-generated method stub
		
	}}
class Bird implements FlightEnabled
{

	@Override
	public void flight() {
		System.out.println("Bird class implementation of flight method");
		
	}

	@Override
	public void track() {
		System.out.println("Bird class implementation of move method");
		
	}
	
}
public class MainBird {

	public static void main(String[] args) 
	{
		List<FlightEnabled> fliers = new LinkedList<>();//If I have to change to arraylist i can only make the changes here, i dont have to go to every method parameter that uses this and change there.
		
		fliers.add(new Bird());
		getFlight(fliers);
		trackRecord(fliers);
	}
	private static void getFlight(List<FlightEnabled> listfliers)
	{
		for(FlightEnabled f:listfliers)
		{
			f.flight();
		}
	}
	private static void trackRecord(List<FlightEnabled> listfliers)//tomorrow if i decide to change arraylist to LInkedlist, then all the methods should cange their parameter type to
	//linkedlist. So it is always better to upcast to List type, then I have to change in the declaration type only.
	{
		for(FlightEnabled f:listfliers)
		{
			f.track();
		}
	}
	
}


