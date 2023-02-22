package assignments;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banks b1 = new SBI();
		System.out.println("Rate of interest for SBI : " +b1.rateofinterest());
		Banks b2 = new PNB();
		System.out.println("Rate of interest for PNB : " +b2.rateofinterest());
	}

}
