package ArrayListPackage;

import java.util.ArrayList;

public class Bank 
{
	private ArrayList<Customer> customerlist = new ArrayList<>(500);
	
	public Customer getCustomer(String customername)
	{
		for(Customer c:customerlist)
		{
			if(c.getName().equalsIgnoreCase(customername))
					{
				return c;
					}
		}
		
		System.out.println("Customer not found");
		return null;
	}
	
	public void addNewCustomer(String customername, double deposit)
	{
		if(getCustomer(customername) == null)
		{
			Customer c = new Customer(customername,deposit);
			
			customerlist.add(c);
			System.out.println(customerlist);
		}
		 
		
	}
	
	public void addtransaction(String customername, double transactionamout) 
	{
		Customer customer = getCustomer(customername);
		
		if(customer!=null)
		{
			customer.getTransactions().add(transactionamout);
		}
	}
	
	public void printstatement(String customername)
	{
		Customer customer = getCustomer(customername);
		if(customer==null)
		{
			return;
		}
		System.out.println("Transactions:");
		System.out.println(customer.getTransactions());
		for(double d:customer.getTransactions())
		{
			System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
		}
	}

	@Override
	public String toString() {
		return "Bank [customerlist=" + customerlist + "]";
	}

}
