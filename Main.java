package Abstraction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contractor c = new Contractor(300,8);
		c.calculateSalary();
		System.out.println("Salary of Contractor : " +c.calculateSalary());
		
		FullTimeEmployee f = new FullTimeEmployee(500);
		f.calculateSalary();
		System.out.println("Salary of FullTimeEmployee : " +f.calculateSalary());
	}

}
