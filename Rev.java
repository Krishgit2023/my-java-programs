class Rev {
	
	Rev(){
		this(123);
		System.out.println("Finding reverse......");
	}
	
	Rev(int n){
		
		int r,s=0;
		while(n!=0){
		r=n%10;
		n=n/10;
		s=(s*10)+r;
		System.out.println("reversed number is "+s);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rev obj1 = new Rev();

	}
	
}
