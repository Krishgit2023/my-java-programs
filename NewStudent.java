class NewStudent{
int id;
String name;
static String college = "ABC";
static void changecollege(){
college = "XYZ";        
}

public void getdata(int id1, String name1){
id = id1;
name = name1;

}

public void display(){
	System.out.println("Student Id is "+id);
	System.out.println("Student Name is "+name);
	System.out.println("Student College is "+college);
}

public static void main(String args[]){

NewStudent obj1 = new NewStudent();
obj1.getdata(1,"krishna");
obj1.display();
NewStudent obj2 = new NewStudent();
obj2.getdata(2,"Veena");
obj2.display();

changecollege();
//System.out.println("Students college after change is "+college);

obj1.display();


}
}