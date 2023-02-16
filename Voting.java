class Voting{

public static void main(String args[]){

//int n=20;

if(Eligibility(15))
{
System.out.println("Candidate is eligible for voting");
}else{
System.out.println("Candidate is not eligible for voting");
}
}

static boolean Eligibility(int age){

if(age>=18)
return true;
else 
return false;
}
}




