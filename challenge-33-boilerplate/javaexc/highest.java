import java.util.Scanner;
class highest
{
public static void main(String []args)
{
int num1,num2;
Scanner obj= new Scanner(System.in);
System.out.println("Enter first Number");
num1=obj.nextInt();
System.out.println("Enter second Number");
num2=obj.nextInt();
if(num1>num2)
{
System.out.println("first number is greater");
}
else if(num1>num2)
{
System.out.println("second number is greater");
}
}
}