class Pal
{
	public static void main(String arg[])	
	{
	    int n=11,t,s;
	    t=n;
	    s=palindromeOrNot(n);
	    if(s==t)
		System.out.println(t+" is a palindrome number ");
                   else
		System.out.println(t+" is not a palindrome number ");                  
	}
	static int  palindromeOrNot(int n )
	{
	  
		int sum=0,r;
	    while(n!=0)
	    {
	    r=n%10;
	    sum=(sum*10)+r;
	    n/=10;	
	    }
	return sum;
	}
}