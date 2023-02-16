class A_Construct{ 
 
A_Construct(){
	System.out.println("hello a");
	}  
	
A_Construct(int x){  
this();  
System.out.println(x);  
}     
public static void main(String args[]){  
A_Construct a=new A_Construct(10);  
}}  