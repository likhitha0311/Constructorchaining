package ArrayListPackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GroceryList2 {

	public static void main(String[] args) {
		List<String> grocerylist = new ArrayList<>();
		Scanner scaneer= new Scanner(System.in);
		System.out.println("Please enter the items");
		int j=0;
		while(j<5)
		{
			String[] items = scaneer.nextLine().split(",");
			for(String i:items)
			{
				grocerylist.add(i);
			}
			j++;
		}

		Set<String> groceryset = new HashSet<>(grocerylist);
		System.out.println(groceryset);
	}

}
