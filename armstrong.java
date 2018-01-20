class power{
public static void main(String[] args){
int count=0;
int n=Integer.parseInt(args[0]),r,sum=0;
int number=n;
while(n>0){
n=n/10;
count=count+1;
}
System.out.println(count);
int real=number;
while(number>0){
r=number%10;
sum=sum+r^3;
number=number/10;
}

System.out.println(sum);
if(real==sum)
System.out.print("no.is armstrong");
else
System.out.print("not an armstrong no.");
}
}
