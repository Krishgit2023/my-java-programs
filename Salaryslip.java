package assignments;

public class Salaryslip{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HraAndPf emp = new HraAndPf();
		
		double totalsalary = emp.basicpay+emp.hra+emp.pf+emp.bonus+emp.deduction;
		
		
		System.out.println("Employee basicpay :" +emp.basicpay);
		System.out.println("Employee deduction :" +emp.deduction);
		emp.display();
		System.out.println("Employee bonus :" +emp.bonus);
		System.out.println("Total Salary :" +totalsalary);
		
}
}