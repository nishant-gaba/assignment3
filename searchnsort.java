package gaba;
import java.util.Scanner;
public class searchnsort {
	public static void main(String[] args) {
		System.out.println("sorting and searching");
        System.out.println("enter size of array");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("enter elements of array");
        int a[]=new int[n],temp;
        int b[]=new int[n];
        for(int i=0;i<n;i++) {
         a[i]=sc.nextInt();
        }//sorting
        for(int i=0;i<n;i++) {
        	for(int j=i+1;j<n;j++) {
        	if(a[i]>a[j]) {
        		temp=a[i];
        		a[i]=a[j];
        		a[j]=temp;
        	}
        	}   
        	System.out.print("Sorted list is-");
        for (int k=0;k<n;k++) {
        		System.out.print(a[k]+" ");
        	}
        System.out.println();
        for(int j=0;j<a.length;j++) {
      
       b[j]=a[j];
        }
      /*searching(binary)*/
     System.out.println("enter element you want to search");
     int item=sc.nextInt(),index=-1;
     int beg=0,end=n;
     int mid=((beg+end)/2);
     boolean check=false;
     while(beg<end) {
    		 if(b[mid]==item) {
    			check=true;
    			index=mid;
    	  break;
    		 }
    		 else if(b[mid]<item) {
    			 beg=mid+1;
    	 }
    		 else if(b[mid]>item) {
    		end=mid-1;
    		 }		
     }
     if(check)
    	 System.out.println("yes_at_position"+ index);
    	 else
    		 System.out.println("not present");
}
}
}
