package ArrayListPackage;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class MainClassforplacestovisit {

	public static void main(String[] args) 
	{
		 LinkedList<Placestovisit> placesToVisit = new LinkedList<>();

		 Placestovisit adelaide = new Placestovisit("Adelaide", 1374);
        addPlace(placesToVisit, adelaide);
        addPlace(placesToVisit, new Placestovisit("adelaide", 1374));
        addPlace(placesToVisit, new Placestovisit("Brisbane", 917));
        addPlace(placesToVisit, new Placestovisit("Perth", 3923));
        addPlace(placesToVisit, new Placestovisit("Alice Springs", 2771));
        addPlace(placesToVisit, new Placestovisit("Darwin", 3972));
        addPlace(placesToVisit, new Placestovisit("Melbourne", 877));
		
		System.out.println(placesToVisit);
		ListIterator<Placestovisit>iterator = placesToVisit.listIterator();
		Scanner scanner = new Scanner(System.in);
		boolean quitLoop=false;
		boolean forward=true;
		printmenu();
		while (!quitLoop) {
            if (!iterator.hasPrevious()) {
                System.out.println("Originating : " + iterator.next());
                forward = true;
            }
            if (!iterator.hasNext()) {
                System.out.println("Final : " + iterator.previous());
                forward = false;
            }
            System.out.print("Enter Value: ");
            String menuItem = scanner.nextLine().toUpperCase().substring(0, 1);

            switch (menuItem) {
                case "F":
                    System.out.println("User wants to go forward");
                    if (!forward) {           // Reversing Direction
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();  // Adjust position forward
                        }
                    }

                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }

                    break;

                case "B":
                    System.out.println("User wants to go backwards");
                    if (forward) {           // Reversing Direction
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();  // Adjust position backwards
                        }
                    }
                    
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                    break;

                case "M":
                    printmenu();
                    break;

                case "L":
                    System.out.println(placesToVisit);
                    break;

                default:
                    quitLoop = true;
                    break;
            }
        }

    }

	
	private static void addPlace(LinkedList<Placestovisit> list, Placestovisit place)
	{
//		if(list.contains(place))
//		{
//			System.out.println("Found duplicate");
//			return;
//		}
//		list.add(place);
		
		//Alternative to this is since contains will not recognise difference between adelade and Adelade.
//		
		for(Placestovisit p:list)
		{
			if(p.getPlace().equalsIgnoreCase(place.getPlace()))
			{
				System.out.println("Found duplicate");
				return;
			}
			
		}
		  
	
	int matchedindex=0;
	for(Placestovisit p:list)
	{
		if(place.getDistance()<(p.getDistance()))
		{
			list.add(matchedindex,place);
			return;
		}
		matchedindex++;
	}
	list.add(place);
}
	
	private static void printmenu()
	{
		System.out.println("""
				Press F for forward
				Press B for backward
				Press q for quit	
				""");
	}
}
