package EnumTypes;

public enum Toppins {
	MUSTARD,CHEDDAR,CHEESE,PICKLES;
	
	public double getPrice()
	{
		return switch(this) {
		case MUSTARD ->1.2;
		case CHEDDAR ->1.12;
		case CHEESE ->1.222;
		case PICKLES ->1.3;
		default->0.0;
		
		};
	}
	
	public static void main(String[] args) 
		
	{
	
		for(Toppins topp:Toppins.values())
		{
			System.out.println(topp.name()+":"+topp.getPrice());
		}

	}

}
