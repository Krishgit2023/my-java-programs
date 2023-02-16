class Banking{
static int amount;

public static void deposit(int a){
	amount = amount+a;
	return deposit;
}
public static void withdraw(int a){
	if(amount<a)
	System.out.println("Insufficient balance");
	else
	amount = amount-a;
	return withdraw;
}
public static void checkbal(){
	return checkbal;
}
	
	public static void main(String args[]){
		System.out.println("Deposit amount : " +deposit(1000));
		System.out.println("Balance is " +checkbal());
		System.out.println("Withdraw amount : " +withdraw(200));
		System.out.println("Balance is " +checkbal());
	}
}