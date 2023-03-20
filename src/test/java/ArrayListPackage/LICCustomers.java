package ArrayListPackage;

import java.util.ArrayList;

public class LICCustomers 
{
	private String customername;
	private String licplan;
	
	private ArrayList<Double> premiumpayments =new ArrayList<>(10);

	public LICCustomers(String customername, String plan, double payment)
	{
		this.customername = customername;
		licplan=plan;
		premiumpayments.add(payment);
	}
	
	

	public String getCustomername() {
		return customername;
	}
	
	

	public ArrayList<Double> getPayment() {
		return premiumpayments;
	}

	@Override
	public String toString() {
		return "LICCustomers [customername=" + customername + ", licplan=" + licplan + ", premiumpayments="
				+ premiumpayments + "]";
	}


	
	
	

}
