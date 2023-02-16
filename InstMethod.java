class InstMethod{
 public static void main(String args[]){
 
 InstMethod obj = new InstMethod();
 obj.sum();
 
 int result = obj.sum(10,12);
 System.out.println(result);
 
 }

public void sum(){
int a = 5;
int b = 7;
System.out.println(a+b);
}

public int sum(int a, int b){
return a+b;
}
}