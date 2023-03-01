package multipleinterface;

public class C implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = new C();            //interface objname = new classname();
		obj.display();
	}

	@Override
	public void display() {
		
		System.out.println("Display");
		// TODO Auto-generated method stub
		
	}

}
