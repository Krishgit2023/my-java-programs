class Vehicleconstruct{
int no;
String name;
String color;

Vehicleconstruct(int no1, String name1, String color1){
no=no1;
name=name1;
color=color1;
}
void display(){
System.out.println("Vehicle number is " +no);
System.out.println("Vehicle name is " +name);
System.out.println("Vehicle color is " +color);
}

public static void main(String args[]){

Vehicleconstruct v1 = new Vehicleconstruct(1,"BMW","Blue");
v1.display();
Vehicleconstruct v2 = new Vehicleconstruct(2,"Audi","White");
v2.display();

}
}