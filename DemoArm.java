import java.util.Scanner;
class Demo{
public static void main(String []args){
System.out.println("Enter the number");
int n=new Scanner(System.in).nextInt();
int number,sum=0,rem;
number=n;
while(n>0){
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(number==sum)
System.out.println("Number is Armstrong");
else
System.out.println("Number is not Armstrong");
}
}