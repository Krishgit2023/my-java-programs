class Prime{              // numbers>1 and have two divisors, i.e, 1 and number itself.
public static void main(String args[]){

int num=10;
int count = 0;

for(int i=1;i<=num;i++){
	if(num%i==0){
		count++;
	}	
}
if(count>1){
	System.out.println("It is not a prime number");
}else{
	System.out.println("It is a prime number");
}

}}