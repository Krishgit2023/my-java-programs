class SwapWithTemp{

public static void main(String args[]){

int x = 10;
int y = 20;

System.out.println("Before Swapping");
System.out.println("Value of X is " +x);
System.out.println("Value of Y is "+y);

int z=x;
x=y;
y=x;

System.out.println("After Swapping");
System.out.println("Value of X is " +x);
System.out.println("Value of Y is "+y);


}
}