class Bank{
static int amount;

public static void deposit(int a){
	amount= amount+a;
	System.out.println("Deposit amount : " +a);
}
public static void withdraw(int a){
	if(amount<a)
	System.out.println("Insufficient balance");
	else
	amount= amount-a;
	System.out.println("Withdraw amount : " +a);
}
public static void checkbal(){
	System.out.println("Balance is " +amount);
}
	
	public static void main(String args[]){
		deposit(1000);
		withdraw(2000);
		checkbal();
	}
}