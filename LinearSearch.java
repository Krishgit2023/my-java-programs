class LinearSearch{
public static void main(String args[]){
	
	int a[] = {10,20,30,40,50};
	int search_element = 30;
	
	boolean flag=false;
	
	for(int i=0;i<a.length;i++){
		if(search_element==a[i]){
			System.out.println("Element found at " +i);
			flag=true;
		}
		
	}
if(flag==false){
	System.out.println("Element not found");
}

}
}