class StudentNew{
int id = 1;//declared instance variable
String name = "Arya";//declared instance variable
static String college = "ABC";//declared static variable
static void changecollege(){
college = "XYZ";        
}

public void display(){
	System.out.println("Student Id is "+id);
	System.out.println("Student Name is "+name);
	System.out.println("Student College is "+college);
}

public static void main(String args[]){

StudentNew obj1 = new StudentNew();//created object to call instance
obj1.display();

changecollege();
//System.out.println("Students college after change is "+college);

obj1.display();


}
}