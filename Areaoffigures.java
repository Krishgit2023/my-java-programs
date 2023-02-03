class Areaoffigures{
double a,b;
double circle;
double rectangle;
int square;

Areaoffigures(double a){
this.a = a;
circle = 3.14*a*a;
System.out.println("Area of circle is " +circle);
}
Areaoffigures(double a, double b){
this.a = a;
this.b = b;
rectangle = a*b;
System.out.println("Area of rectangle is " +rectangle);
}
Areaoffigures(int a){
this.a = a;
square = a*a;
System.out.println("Area of square is " +square);
}

public static void main(String args[]){
Areaoffigures a1 = new Areaoffigures(5d);
Areaoffigures a2 = new Areaoffigures(4,2);
Areaoffigures a3 = new Areaoffigures(5);
}
}
