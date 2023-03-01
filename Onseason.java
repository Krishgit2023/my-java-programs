package assignments;

public class Onseason {
	
double mrp,discountprice,disrate, p;
	
	public void discount() {
		
		mrp = 1000;
		disrate = 40;
		p = 100-disrate;
		discountprice = (p*mrp)/100;
		
		System.out.println("Discount amount for clothe on Onseason : " +discountprice);
		
	}
}
