import java.util.Scanner;
class binsearch1 {
  public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	System.out.println("enter size of array");
	int n=sc.nextInt();
        int index=-1;
	int a[]=new int[n];
	boolean check=false;
	System.out.println("enter elements of array");
	for(int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("enter element you want to search");
   int item=sc.nextInt();
	int beg=0,end=n-1;
       int mid=(beg+end)/2;
       while(beg<end) {
	if(a[mid]==item) {
	 index=mid;
        check=true;
     break;
	}	
        else if(item<a[mid]) {
	end=mid-1;
	}
				else if(a[mid]>item) {
		           beg=mid+1;
		        
				}
	}
	if(check)
	System.out.println("yes_at_position"+index);
	else
		System.out.println("not present");
		}
  
}
