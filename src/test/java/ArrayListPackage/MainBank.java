package ArrayListPackage;

import java.util.ArrayList;
import java.util.List;

public class MainBank {

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		List<Customer> bankcustomers = new ArrayList<>();
		Customer ananya = new Customer("Ananya",500);
		System.out.println(ananya);
		b.addNewCustomer("Ananya", 500);
		b.addNewCustomer("Raju", 500);
		b.addNewCustomer("Amitha", 500);
		b.addtransaction("Amitha", 1500);
		b.addtransaction("Amitha", 1200);
		b.addtransaction("Amitha", 1300);
		b.printstatement("Amitha");
		b.addtransaction("Raju", 1300);
		b.addtransaction("Amitha", 1200);
		b.addtransaction("Raju", -900);
		b.printstatement("Raju");
	}

}
