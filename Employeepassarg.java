class Employeepassarg{
int id;
String name;
static String department = "Testing";
static void changedept(){
department = "Finance";
}

public void getdata(int id1, String name1){
id = id1;
name = name1;
}

public void display(){
System.out.println("Employee id is " +id);
System.out.println("Employee name is " +name);
System.out.println("Employee department before change is " +department);
}

public static void main(String args[]){
Employeepassarg obj = new Employeepassarg();
obj.getdata(1, "Krishna");
obj.display();
changedept();
System.out.println("Employee department after change is " +department);

}
}