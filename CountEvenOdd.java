import java.util.Scanner;
class CountEvenOdd{
	public static void main(String args[]){
		int i,n,even=0, odd=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 numbers");
		
		for(i=10;i<=20;i++)
		{
			 n=sc.nextInt();
			if(n%2==0)
			{
				even++;
			}else {
				odd++;
			}
	}
	System.out.println("No of even number is :" +even);
	System.out.println("No of odd number is :" +odd);
}
}


