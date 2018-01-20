class search{
public static void main(String[] args){
int n=Integer.parseInt(args[0]),index=-1;
int arr[]={1,2,3,5,6,78,39,23};
boolean k=false;
for(int i=0;i<arr.length;i++){
if(arr[i]==n)
{
index=i;
k=true;
}
}
if(k)
System.out.print("Yes_at_position-"+index);
else
System.out.print("No");
}
}