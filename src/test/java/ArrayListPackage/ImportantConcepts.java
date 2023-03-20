package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImportantConcepts {

	public static void main(String[] args) 
	{
		
		List<String> array1 = Arrays.asList("s","a","k");//This will return a list that is not resizable but mutable.
		
		array1.set(0,"check");
		System.out.println(array1);
		
		List<Integer> array2 = List.of(1,2,3,4,5);//This will return a arraylist that is not  mutable.
		array2.add(35);
		//array2.set(0, 56);
		System.out.println(array2);
		
		ArrayList<Integer>a1=new ArrayList<>(array2);
		a1.add(34);
		System.out.println(a1);
		
		String[] s1 = {"shark","tank","episode"};
		ArrayList<String> arrstring = new ArrayList<>(List.of(s1));
		arrstring.remove("episode");
		System.out.println(arrstring);
				
		
		
		
		ArrayList<String> d =  new ArrayList<>(List.of("A","B","C"));
		
		String[] stringarray = d.toArray(new String[5]);
		System.out.println(Arrays.toString(stringarray));
		
		System.out.println(d);
		System.out.println(d.remove(1));
		d.add("v");
		System.out.println(d);
		
		

	}

}
