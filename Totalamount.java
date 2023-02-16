class Totalamount{
int a,b;
int totalamount;

Totalamount(int a, int b){
this.a = a;
this.b = b;
totalamount = a+b;
System.out.println("Total amount is " +totalamount);
}
public static void main(String args[]){
Totalamount a1 = new Totalamount(100,50);
}
}