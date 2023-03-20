package Constructorsexamples;

public class ConstructorPractice1
{

	double creditlimit;
	String customerName;
	String emailAddress;
	
	public double getCreditlimit() {
		return creditlimit;
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public String getCustomerName() {
		return customerName;
	}

	
	
	
	public ConstructorPractice1(double creditlimit, String customerName, String emailAddress) {
		
		this.creditlimit = creditlimit;
		this.customerName = customerName;
		this.emailAddress = emailAddress;
	}
	
	public ConstructorPractice1()
	{
		this(100.67,"Ashna","daina@mail.com");
	}
	
	public ConstructorPractice1(String customerName, String emailAddress)
	{
		this(100.7878,customerName,emailAddress);
	}
	
	
	
}
