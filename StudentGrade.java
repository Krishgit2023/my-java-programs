class StudentGrade{
int sub1;
int sub2;
int sub3;
int avg;
int total;

void total(){
	total = sub1+sub2+sub3;
	System.out.println("The total mark of student : " +total );
}

StudentGrade(int a, int b, int c){
sub1= a;
sub2 = b;
sub3 = c;

avg = (a+b+c)/3;

if(avg>=80){
System.out.println("The Grade of student is A");
}
else if(avg>=40 && avg<80){
System.out.println("The Grade of student is B");
}
else if(avg>=40 && avg<60){
System.out.println("The Grade of student is C");
}
else{
System.out.println("The Grade of student is D");
}
}
public static void main(String args[]){

StudentGrade s1 = new StudentGrade(50,40,60);
s1.total();
StudentGrade s2 = new StudentGrade(70,80,90);
s2.total();
}
}