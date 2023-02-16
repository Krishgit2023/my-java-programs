class Average{
public static void main(String args[]){

Average obj = new Average();
int result = obj.avg(12,5,3);
float result1 = obj.avg(0.01f,0.02f,0.03f);

System.out.println("Average of integer number is  : " +result);
System.out.println("Average of float number is  : " +result1);

}

public int avg(int a, int b, int c){
return (a+b+c)/3;
}
public float avg(float a, float b, float c){
return (a+b+c)/3;
}
}


