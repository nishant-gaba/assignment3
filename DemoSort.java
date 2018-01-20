import java.util.Scanner;
class sort{
public static void main(String[] args){
System.out.println("Enter the size of array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int temp;
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if(a[i]>=a[j]){
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Sorted Array");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}