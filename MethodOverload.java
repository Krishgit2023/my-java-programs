class MethodOverload{
public static void main(String args[]){

/*MethodOverload obj = new MethodOverload();
obj.sub(15,4);
obj.sub(10,5,2);
obj.sub(0.2f,0.1f);*/

MethodOverload obj = new MethodOverload();
int result = obj.sub(10,5);
int result1 = obj.sub(20,10,5);
float result2 = obj.sub(0.02f,0.01f);

System.out.println(result);
System.out.println(result1);
System.out.println(result2);

}

/*public void sub(int a, int b){
System.out.println(a-b);
}

public void sub(int a, int b, int c ){

System.out.println(a-b-c);
}

public void sub(float a, float b){

System.out.println(a-b);
}*/

public int sub(int a, int b){
return a-b;
}

public int sub (int a, int b, int c){
	return a-b-c;
}

public float sub(float a, float b){
	return a-b;
}
}