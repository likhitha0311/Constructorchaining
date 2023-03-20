package Encapsulation;

public class MainPrinter {

	public static void main(String[] args) {
		Printer printer = new Printer(5,10,true);
		
		System.out.println(printer.addToner(1000));;
		printer.printPages(60);

	}

}
