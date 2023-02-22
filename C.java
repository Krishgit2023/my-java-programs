package assignments;

public class C implements A, B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C obj = new C();
		obj.display();
		
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("multi interface");
	}

}
