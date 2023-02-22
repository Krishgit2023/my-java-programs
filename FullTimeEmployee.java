package Abstraction;

public class FullTimeEmployee extends Employee{

	public FullTimeEmployee(int paymentPerHour) {
        super(paymentPerHour);
    }
	
	@Override
    public int calculateSalary() {
        return getPaymentperhour() * 8;
    }
}
