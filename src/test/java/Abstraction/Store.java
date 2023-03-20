package Abstraction;

import java.util.ArrayList;

record OrderItem(int qty, ProductForSale product) {}

public class Store {
	
	private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

	public static void main(String[] args) 
	{
		
		storeProducts.add(new ArtObject("Sculpture",100,"this is a sculpture"));
		storeProducts.add(new ArtObject("Painting",200,"this is a painting"));
		storeProducts.add(new ArtObject("Decor",300,"this is a decor"));
		storeProducts.add(new Furniture("Sofar",300,"this is a Sofar"));
		storeProducts.add(new Furniture("Chair",300,"this is a chair"));
		listProducts(storeProducts);
		System.out.println("$".repeat(30));;
		ArrayList<OrderItem> order1 = new ArrayList<>();
		addItemToOrder(order1,0,3);
		addItemToOrder(order1,4,4);
		addItemToOrder(order1,2,4);
		printOrder(order1);

	}
	private static void listProducts(ArrayList<ProductForSale> items)
	{
		for(ProductForSale p : items)
		{
			p.showDetails();
		}
	}
	
	 public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex,
             int qty) {
       order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
}
	 
	 public static void printOrder(ArrayList<OrderItem> order) {

	        double salesTotal = 0;
	        for (var item : order) {
	            item.product().printPricedItem(item.qty());
	            salesTotal += item.product().getSalesPrice(item.qty());
	        }
	        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
	    }

}
