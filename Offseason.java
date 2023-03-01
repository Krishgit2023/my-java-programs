package assignments;

public class Offseason {

	double mrp,discountprice,disrate, p;
	
	public void discount() {
		
		mrp = 1000;
		disrate = 15;
		p = 100-disrate;
		discountprice = (p*mrp)/100;
		
		System.out.println("Discount amount for clothe on Offseason : " +discountprice);
		
	}
}
