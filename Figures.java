class Figures{
public static void main(String args[]){

Figures obj = new Figures();
double circle = obj.area(5d);
int rectangle = obj.area(4,2);
int square = obj.area(5);

System.out.println("Area of circle is " +circle);
System.out.println("Area of rectangle is " +rectangle);
System.out.println("Area of square is " +square);

}

public double area(double a){
return 3.14*a*a;
}
public int area(int a,int b){
return a*b;
}
public int area(int a){
return a*a;
}
}