class rev{
public static void main(String[] args){
int sum=0;
for(int n=Integer.parseInt(args[0]);n>0;n=n/10){
int r=n%10;
sum=sum*10+r;
}
System.out.print(sum);
}
}