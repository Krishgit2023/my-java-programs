class Student{
int id1 = 1;//declared instance variable
String name1 = "Arya";//declared instance variable
int id2 = 2;
String name2 = "Krishna";
static String college = "ABC";//declared static variable

public static void main(String args[]){

Student obj1 = new Student();//created object to call instance
Student obj2 = new Student();

System.out.println("Student Id is "+obj1.id1);
System.out.println("Student name is "+obj1.name1);
System.out.println("Student Id is "+obj2.id2);
System.out.println("Student name is "+obj2.name2);
System.out.println("Students college is "+college);

}
}