package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOfObjects {

	public static void main(String[] args)
	{
	List<Object> myList = new ArrayList<>();
	
	Object myObject = new Object(); // myObject reference points to object
	myList.add(myObject); // list contains object
	System.out.println("myObject address is "+myObject);
	 
	myObject = new String("John"); // myObject reference points to string object.
	myList.add(myObject); // list contains object and string
	System.out.println("myObject address second time  is "+myObject);
	myObject = new ArrayList<String>(); // myObject reference points to ArrayList object.
	((List<Object>) myObject).add("Hello");
	((List<Object>) myObject).add("World");
	
	myList.add(myObject);
	System.out.println(myList);
	
	

	}

}
