class Bubblesort{
public static void main(String args[]){

int a[] = {7,32,0,13,15};
int temp=0;

for(int i=0;i<5;i++){

for(int j=0;j<4;j++){
if(a[j]>a[j+1]){
temp = a[j];
a[j] = a[j+1];
a[j+1] = temp;

}
}
}
for(int i=0;i<5;i++){

System.out.println(a[i]);
}
}
}

7 32 0 13 15