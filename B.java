class B{  
B getB(){  
return this;  
}  
void msg(){System.out.println("Hello java");
}  
 
public static void main(String args[]){  
new B().getB().msg();  
} 
} 
  