import java.util.Scanner;
class FindArea{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.println("1) area of circle");
System.out.println("2) area of rectangle");
System.out.println("3) area of square");
System.out.println("Enter any of the above option");
int num = sc.nextInt();

switch(num){
	case 1 : 
	System.out.println("Enter radius of circle");
	double r = sc.nextDouble();
	double areaofcircle = 3.14*r*r;
	System.out.println("Area of circle is " +areaofcircle);
	break;
	
	case 2 : 
	System.out.println("Enter length and breadth of rectangle");
	int l = sc.nextInt();
	int b = sc.nextInt();
	int areaofrectangle = l*b;
	System.out.println("Area of rectangle is " +areaofrectangle);
	break;
	
	case 3 : 
	System.out.println("Enter side of square");
	int a = sc.nextInt();
	int areaofsquare = a*a;
	System.out.println("Area of square is " +areaofsquare);
	break;
	
	default:
	System.out.println();

}
}
}