import java.util.Scanner;

class UnaryTest{
	
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number: ");
int x = sc.nextInt();


System.out.println(x++);
System.out.println(++x);
System.out.println(x--);
System.out.println(--x);

}
}