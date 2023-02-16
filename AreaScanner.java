 import java.util.Scanner;
class AreaScanner{
	 int l;
	 int b;
	 int a;
	 
	AreaScanner(int x, int y){
		l=x;
		b=y;
	}
	
	public void get(){
		a = l*b;
	}
	
	public void display(){
		System.out.println("Area of rectangle  :" +a);
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int length;
		int breadth;
		System.out.println("Enter length:");
	    length = sc.nextInt();
		System.out.println("Enter breadth:");
	    breadth = sc.nextInt();
		AreaScanner obj = new AreaScanner(length,breadth);
		obj.get();
		obj.display();
			
	}
}

