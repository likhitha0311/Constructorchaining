package FormattedString;

public class Stringmethods {

	public static void main(String[] args) {
		printInformation();
	}
	
	public static void printInformation()
	{
		String s ="Disney in Hello World is magnificient";
		StringBuilder sb = new StringBuilder("Village is beautiful");
		
		
//		System.out.printf("Length of the string is %d\n", s.length());
//
//		System.out.printf("Char at 5th index of the string is %s\n", s.charAt(5));
//		
//		System.out.printf("Length of the string is %d%n", s.length());
//
//		System.out.printf("Char at 5th index of the string is %c", s.charAt(6));
		
		//System.out.println(s.lastIndexOf("Hello World"));
		//System.out.println(s.lastIndexOf('i',8));
		
		System.out.println(s.concat("NewObject"));
		System.out.println(s);
		System.out.println(sb);
		sb.append("and clean");
		System.out.println(sb);
	}

}
