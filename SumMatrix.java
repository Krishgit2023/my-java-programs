class SumMatrix{
public static void main(String args[]){

int a[][]={{2,3}, {4,5}};
int b[][]={{1,3}, {2,5}};

int sum[][] = new int[2][2];


for(int i=0;i<2;i++){
  for(int j=0;j<2;j++){
	  
sum[i][j]=a[i][j]+b[i][j];

System.out.print(sum[i][j]+ " ");
}
System.out.println();
}

}

}