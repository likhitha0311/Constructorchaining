package FormattedString;

public class FormatString {

	public static void main(String[] args) 
	{
		String text = "Your name is "+21
				+"todays news is "+67.89+
				"weather is bright";
		System.out.println(text);
		
		int age=45;
		
		String foramttedText = """
				Your name is 21 todays 
				\nnews is 67.89
				weather is bright
				""";
		System.out.println(foramttedText);

	
	System.out.printf("Your age is %d %n ",age);
	
	String checking = "Amazon";
	
	checking = "Neutral";
	
	System.out.println(checking);
	
	String value = "uio";
	System.out.println(value.contains("uig"));
	}

	@Override
	public String toString() {
		return "FormatString [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}
