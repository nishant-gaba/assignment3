import java.util.Scanner;
class Demo{
public static void main(String [] args){
int n;
System.out.println("Enter the size of array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter the elements of array");
for(int i=0;i<n;i++){
a[i]=sc.nextInt();
}
System.out.println("Enter the element you want to search");
int element=sc.nextInt();
int index=-1;
int b[]=new int[n];
int j=0;
for(int i=0;i<n;i++){
if(a[i]==element)
index=i;
}
for(int i=0;i<=index;i++){
if(a[i]%2==0){
b[j]=a[i];
j++;
}
}
System.out.println("Result : ");
for(int k=0;k<j;k++){
System.out.print(b[k]+" ");
}
}
}