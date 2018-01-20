class even{
public static void main(String[] args){
int a[]={10,9,8,7,5,4,3,2},index=0;
int v=Integer.parseInt(args[0]);
for(int j=0;j<a.length;j++){	
if(a[j]==v)
index=j;
}
for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
}
System.out.println("");
for(int k=0;k<=index;k++){
if(a[k]%2==0)
System.out.println(a[k]+ " ");
}
}
}