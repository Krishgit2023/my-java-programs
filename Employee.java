package assignments;

import java.util.Scanner;

public class Employee {
	
	double basicpay;
	double deduction;
	double bonus;
	
	Scanner get = new Scanner(System.in);
	Employee(){
		System.out.println("Employee basic pay : ");
		basicpay = get.nextDouble();
		System.out.println("Employee deductions : ");
		deduction = get.nextDouble();
		System.out.println("Employee bonus : ");
		bonus = get.nextDouble();
	}
}