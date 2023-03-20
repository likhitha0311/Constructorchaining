package Arrays;

public class VariableArguments {

	public static void main(String[] args)
	{
		addition("Hello",5,19,89,20,34);
		addition("Hello");
	}

	private static void addition(String arg, int...a) 
	{
		int sum=0;
		
		for(int i:a)
		{
			sum+=i;
		}
		
		System.out.println(sum);
		
	}
	
	

}
