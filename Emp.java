class Emp{
int id;
String name;
String dept;

//Default constructor
Emp(){
System.out.println("Default constructor");
}

//parametrized constructor
Emp(int id1, String name1, String dept1){

id=id1;
name = name1;
dept = dept1;
//System.out.println("Employee id is " +id);
//System.out.println("Employee name is " +name);
//System.out.println("Employee department is " +dept);

}

// to display print values
void display(){
System.out.println("Employee id is " +id);
System.out.println("Employee name is " +name);
System.out.println("Employee department is " +dept);
}


public static void main(String args[]){


Emp e1 = new Emp();
Emp e2 = new Emp(101, "Krishna", "Testing");
e2.display();
Emp e3 = new Emp(102, "Veena", "Finance");
e3.display();
}

}