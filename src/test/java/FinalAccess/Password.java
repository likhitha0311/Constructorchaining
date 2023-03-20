package FinalAccess;

import java.util.Locale;
import java.util.Scanner;

public class Password {

	public static void main(String[] argv)
	        throws Exception
	    {
	        try {
	  
	            String s = """
how are you today
""";

	  
	            // new scanner with the
	            // specified String Object
	            Scanner scanner = new Scanner(s);
	  
	            // use US locale to interpret Lines in a string
	            //scanner.useLocale(Locale.US);
	  
	           // scanner.close();
	  
	            // iterate till end
	            int count=0;
	            while (scanner.hasNextLine()) {
	            	 count++;
	                // print what is scanned
	                System.out.println(scanner.nextLine());
	               
	                //System.out.println(count);
	            }
	  System.out.println(count);
	            // close the scanner
	            scanner.close();
	        }
	        catch (IllegalStateException e) {
	            System.out.println("Exception is: " + e);
	        }
	    }
}
