class Vehicle{
int no;
String model;

Vehicle(int no, String model){
this.no = no;
this.model = model;

System.out.println("Vehicle no :" +no);
System.out.println("Vehicle model :" +model);
}

public static void main(String args[]){
Vehicle v1 = new Vehicle(1, "BMW");
}

}