//import java.util.*;
class Marks{
public static void main(String args[]){

//int mark;
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter mark : ");
//mark = sc.nextInt();

int mark = 90;
if(40<=mark&&mark<=60){
    System.out.println("Grade D");
}else if(61<=mark&&mark<=70){
	System.out.println("Grade C");
}else if(71<=mark&&mark<=80){
	System.out.println("Grade B");
}else if(81<=mark&&mark<=100){
	System.out.println("Grade A");
}else
    System.out.println("Failed");
}

}
