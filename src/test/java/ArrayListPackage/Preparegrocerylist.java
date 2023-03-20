package ArrayListPackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Preparegrocerylist {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) 
	
	{
		
		ArrayList<String>groceries = new ArrayList<>();
		
		boolean flag = true;
		while(flag) 
		{
		printActions();
		String items = scanner.nextLine();
		switch(Integer.parseInt(items)) {
		case 1-> addItems(groceries);
		case 2->removeItems(groceries);
		default -> flag=false;
		}
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);
	}
		//getItems();
		//Items();
		//Itemsiteratr();
		//getIntegers(11,12,13,14,15,16);
	}
	private static void addItems(ArrayList<String> groceries) 
	{
		
		System.out.println("Enter the items to add to the list separated by comma");
		String itemslist = scanner.nextLine();
		String[] array = itemslist.split(",");
		//groceries.addAll(List.of(array));
		for(String i:array)
		{
			String i1=i.trim();
			if(groceries.indexOf(i1)<0)
			{
				groceries.add(i1);
			}
		}
		System.out.println("After adding "+groceries);
		
	}

	private static void removeItems(ArrayList<String> groceries) {
		
		System.out.println("Enter the items to remove from the list separated by comma");
		String itemslist = scanner.nextLine();
		String[] array = itemslist.split(",");
		for(String i:array)
		{
			String i1=i.trim();
		  groceries.remove(i1);
			//groceries.remove(List.of(array));
		}
		System.out.println("After removing "+groceries);
		
	}

	private static void printActions()
	{
		String textblock="""
				Please enter a number 0,1,2
				0-to exit the list
				1-to add items to the list
				2-remove items from the list
				""";
		System.out.print(textblock+" ");
	}
	
	private static void getItems()
	{
		LinkedList<String>list = new LinkedList<>(List.of("A","B","C","D"));
		
		for(int i=1;i<list.size();i++)
		{
			System.out.println("Travellinf from "+list.get(i-1)+"to"+list.get(i));
		}
	}
	
	private static void Items()
	{
		LinkedList<String>list = new LinkedList<>(List.of("A","B","C","D"));
		
		Iterator<String>itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
	}
	
	private static void Itemsiteratr()
	{
		LinkedList<String>list = new LinkedList<>(List.of("A","B","C","D"));
		
		Iterator<String>itr = list.iterator();
		
		while(itr.hasNext())
		{
			if(itr.next().equals("C"))
			{
				itr.remove();
				break;
			}
			
		}
		System.out.println(list);
		
	}

	private static void getIntegers(int...a)
	{
		for(int i:a)
		{
			System.out.println("value of i is "+i);
		}
	}
}
