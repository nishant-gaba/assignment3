package gaba;
import java.util.Scanner;
class linsort{
	public static void main(String[] args) {
  int n,temp;
  System.out.println("Enter size of array");
  Scanner sc =new Scanner(System.in);
  n=sc.nextInt();
  int a[]=new int[n];
  System.out.println("enter elements of array");
  for(int i=0;i<n;i++) {
	  a[i]=sc.nextInt();
  }
  for(int i=0;i<a.length;i++) {
	
  for(int j=i+1;j<a.length;j++) {
	  if(a[i]>a[j]) {
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	  }
   }
  }
  for(int k=0;k<a.length;k++) {
		 System.out.print(a[k]+" ");
	 }

}
}