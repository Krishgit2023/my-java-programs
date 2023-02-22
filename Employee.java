package Abstraction;

abstract public class Employee {
	
	private int paymentperhour;
	
	public int getPaymentperhour() {
		return paymentperhour;
	}

	public void setPaymentperhour(int paymentperhour) {
		this.paymentperhour = paymentperhour;
	}

	public Employee(int paymentperhour ) {
		this.paymentperhour = paymentperhour;
	}

	public abstract int calculateSalary();
}
