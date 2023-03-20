package ArrayListPackage;

public class MainLIC {

	public static void main(String[] args) {
		LIC lic = new LIC();
		lic.addCustomers("Likhitha", "Jeevan Bhima");
		lic.addCustomers("Sisi", "Aroghya");
		lic.addCustomers("Rahul", "Bhima Jyothi");
		lic.addCustomers("Likhitha", "Jeevan Bhima");
		System.out.println(lic);
		lic.addPremiumPayment("Likhitha", "Jeevan Bhima", 2000);
		lic.premiumStatemnts("Likhitha", "Jeevan Bhima");
		lic.premiumStatemnts("Nikhitha", "Jeevan Bhima");
	}

}
