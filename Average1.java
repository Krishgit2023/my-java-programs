class Average1{
int a,b,c;
int avg;
float x,y,z;
float avg1;

Average1(int a1,int b1,int c1 ){
	 a=a1;
	 b=b1;
	 c=c1;
	avg=(a+b+c)/3;	
	System.out.println("Average of integer numbers: " +avg);
}
Average1(float x1,float y1,float z1){
	 x= x1;
     y= y1;
     z = z1;
	avg1=(x+y+z)/3;	
	System.out.println("Average of float numbers: " +avg1);
}

public static void main(String args[]){
	Average1 result = new Average1(5,20,5);
	Average1 result1 = new Average1(0.1f,0.2f,0.3f);
	
}}