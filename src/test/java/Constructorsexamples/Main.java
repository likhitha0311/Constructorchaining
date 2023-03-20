package Constructorsexamples;

public class Main {

	public static void main(String[] args) {
		ConstructorPractice1 c1 = new ConstructorPractice1();
		
		System.out.println(c1.getCustomerName());
		System.out.println(c1.getemailAddress());
		System.out.println(c1.getCreditlimit());
		
		ConstructorPractice1 c2 = new ConstructorPractice1(2000,"Swayam","shreshta@mail.com");
		
		System.out.println(c2.getCustomerName());
		System.out.println(c2.getemailAddress());
		System.out.println(c2.getCreditlimit());
		
		ConstructorPractice1 c3 = new ConstructorPractice1("Swayam22","shre222shta@mail.com");
		System.out.println(c3.getCustomerName());
		System.out.println(c3.getemailAddress());
		System.out.println(c3.getCreditlimit());

	}

}
