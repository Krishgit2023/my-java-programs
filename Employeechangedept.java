class Employeechangedept{
int id = 1;
String name = "Krishna";
static String department = "Testing";
static void changedepartment(){
department = "Finance";
}

public void display(){
System.out.println("Employee id is " +id);
System.out.println("Employee name is " +name);
System.out.println("Employee department before change is " +department);
}

public static void main(String args[]){
Employeechangedept obj = new Employeechangedept();
obj.display();
changedepartment();
System.out.println("Employee department after change is " +department);

}
}