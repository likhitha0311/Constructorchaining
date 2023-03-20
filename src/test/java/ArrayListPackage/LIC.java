package ArrayListPackage;

import java.util.ArrayList;

public class LIC 
{
private ArrayList<LICCustomers> liccustomerlist = new ArrayList<>(10);

public LICCustomers getCustomer(String customername)
{
	for(LICCustomers liccustomers:liccustomerlist)
	{
		if(liccustomers.getCustomername().equalsIgnoreCase(customername))
		{
			
			return liccustomers;
		}
	}
	System.out.println("Customer not found");
	return null;
}

public void addCustomers(String customername, String licplan)
{
	if(getCustomer(customername) == null)
	{
		LICCustomers lic = new LICCustomers(customername,licplan,1000);
		liccustomerlist.add(lic);
	}
}

public void addPremiumPayment(String customername, String plan, double payment)
{
	LICCustomers customer = getCustomer(customername);
	if(getCustomer(customername) != null)
	{
		customer.getPayment().add(payment);
	}
}

public void premiumStatemnts(String customername, String plan)
{
	LICCustomers customer = getCustomer(customername);
	if(getCustomer(customername) != null)
	{
		for(double d:customer.getPayment())
		{
			System.out.printf("%s %f %s",customer.getCustomername(), d, d<0?"not paid":"paid");
		}
	}
}



public void addCustomersBasedOnaadhar(String customername, String licplan)
{
	if(getCustomer(customername) == null)
	{
		LICCustomers lic = new LICCustomers(customername,licplan,1000);
		liccustomerlist.add(lic);
	}
}


@Override
public String toString() {
	return "LIC [liccustomerlist=" + liccustomerlist + "]";
}
}
