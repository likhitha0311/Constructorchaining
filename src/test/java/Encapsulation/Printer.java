package Encapsulation;

public class Printer 
{
	private int tonerLevel;
	private int pagesPrinted;
	private boolean duplex;
	
	
	public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
		
		this.tonerLevel = tonerLevel;
		this.pagesPrinted = pagesPrinted;
		this.duplex = duplex;
	}


	public int addToner(int tonerAmount)
	
	{  tonerLevel = tonerLevel+tonerAmount;
	
	   if(tonerLevel>100 || tonerLevel<0) return -1;
	
		return tonerLevel;
	}
	

	public void printPages(int pages)
	{
		if(duplex)
		{
			System.out.println("Its a duplex printer");
			
		}
		
		int sheetnumber=pagesPrinted+pages;
	}
	
}
