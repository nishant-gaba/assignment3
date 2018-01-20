class prime1 {
public static void main(String[] args) {
int n= Integer.parseInt(args[0]); 
	for(int i=2;i<n;i++){
boolean v=true;
	for (int j=2;j<i;j++) {
	if (i%j==0) 
         v=false;       
	}
 if(v)
System.out.println(i+" ");
	}

}
}
