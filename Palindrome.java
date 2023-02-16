class Palindrome{
public static void main(String args[]){
	
	int n=23341,r,s=0;
	int temp=n;
	
while(n>0){
	
	r=n%10;
	s=(s*10)+r;
	n=n/10;
	
}if(temp==s){
	System.out.println("Number is palindrome");
}else{
	System.out.println("Number is not palindrome");
}

}
}
