package Constructorsexamples;

public class MainWorker {

	public static void main(String[] args) 
	{
	
		//SalariedEmployee se = new SalariedEmployee("Joy","21/09/1990","23/01/2023",100000, false,218762900,"21/07/2020");
		Employee e = new Employee("Manish", "04/04/1987", "25/09/2022",  "03/02/2020");
		Employee e1 = new Employee("Manish", "04/04/1987", "25/09/2022",  "03/02/2020");
		Employee e2 = new Employee("Manish", "04/04/1987", "25/09/2022",  "03/02/2020");
		System.out.println(e);
		System.out.println(e1);
		System.out.println(e2);
		//captureData(se);
	}
	
	public static void captureData(Worker worker)
	{
		System.out.println(worker.getAge());;
		System.out.println(worker.collectPay());
		worker.terminate("25/01/2023");

}
}
class Worker{
	protected String  name;
	
	protected String birthDate;
	protected String endDate;
	
	public Worker(String name, String birthDate, String endDate) {
	
		this.name = name;
		this.birthDate = birthDate;
		this.endDate = endDate;
	}
	
	public int getAge()
	{
		return 20;
		
	}
	
	public double collectPay()
	{
		return 22.33;
	}
	
	public void terminate(String endDate)
	{
		this.endDate = endDate;
	}
	
	
}

class Employee extends Worker{

   protected long  employeeID;
	
	protected String hireDate;
	
	private static int employeeNo = 1;
	
	public Employee(String name, String birthDate, String endDate, String hireDate) {
		super(name, birthDate, endDate);
		//this.employeeID = employeeID;
		this.hireDate = hireDate;
		System.out.println("employeeNo is "+employeeNo);
		this.employeeID = employeeNo++;//assign the value and then increment the value
		System.out.println("Employee Id  is "+this.employeeID);
	}

	@Override
	public void terminate(String endDate) {
		
		System.out.println("Employee is terminated on "+endDate);
	}

	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", hireDate=" + hireDate + ", name=" + name + ", birthDate="
				+ birthDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
	

	
}

//class SalariedEmployee extends Employee{
//	
//	
//	private double annualSalary;
//	private boolean isRetired;
//	
//	public SalariedEmployee(String name, String birthDate, String endDate, double annualSalary, boolean isRetired, long employeeID, String hireDate) {
//		//super(name, birthDate, endDate, employeeID, hireDate);
//		this.annualSalary = annualSalary;
//		this.isRetired = isRetired;
//	}
//
//
//	private void retire() 
//	{
//		if(isRetired)
//		{
//			System.out.println("Salaried Employee is retired");
//		}
//		else
//		{
//			System.out.println("Salaried Employee is still working");
//		}
//		}
//	}

