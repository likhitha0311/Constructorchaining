package ArrayListPackage;

import java.util.ArrayList;

public class Customer 
{
private ArrayList<Double> transactions = new ArrayList<>(100);
private String name;


public Customer( String name, double initialdeposit) 
{
	this.name = name;
	transactions.add(initialdeposit);
	
}


public String getName() {
	return name;
}

@Override
public String toString() {
	return "Customer [transactions=" + transactions + ", name=" + name + "]";
}


public ArrayList<Double> getTransactions() {
	return transactions;
}
}

