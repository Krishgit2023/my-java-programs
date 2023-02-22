package Abstraction;

public class Contractor extends Employee {

	private int workinghours;

	public Contractor(int paymentperhour, int workinghours) {
		super(paymentperhour);
		this.workinghours = workinghours;
	}
	
	@Override
    public int calculateSalary() {
        return getPaymentperhour() * workinghours;
	}
	

}
