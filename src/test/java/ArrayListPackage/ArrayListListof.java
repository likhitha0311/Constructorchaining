package ArrayListPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListListof {

	public static void main(String[] args)
	{
		String[] array1 = {"Manish","Sahil","rOOP"};
		List<String> arg = List.of(array1);
		//arg.add("Stringy");
		//System.out.println(arg);//This will throw UnsupportedOperationException
		
		
		String[] array2 = {"apple","yogurt","mango","grape","chikku"};
		ArrayList<String> arraylist = new ArrayList<>(List.of(array2));
		System.out.println(arraylist);
		arraylist.removeAll(List.of("yogurt","mango"));
		System.out.println(arraylist);
		arraylist.retainAll(List.of("apple","grape"));
		System.out.println(arraylist);
		arraylist.clear();
		System.out.println(arraylist);
		
		arraylist.addAll(Arrays.asList("Hamburger","sandwches"));
		System.out.println(arraylist);
		arraylist.addAll(List.of("yogurt","mango"));
		System.out.println(arraylist);
	}

}
