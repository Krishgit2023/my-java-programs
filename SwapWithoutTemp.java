class SwapWithoutTemp{

public static void main(String args[]){

int a = 20;
int b = 25;

System.out.println("Before Swapping");
System.out.println("Value of A is " +a);
System.out.println("Value of B is "+b);

a=a+b;
b=a-b;
a=a-b;

System.out.println("After Swapping");
System.out.println("Value of A is " +a);
System.out.println("Value of B is "+b);

}
}