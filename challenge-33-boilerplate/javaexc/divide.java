import java.util.Scanner;
class divide
{
public static void main (String[]args)
{
int num1,num2,result;
Scanner obj= new Scanner(System.in);
System.out.println("Enter First Number");
num1=obj.nextInt();
System.out.println("Enter second Number");
num2=obj.nextInt();
result=num1/num2;
System.out.println(result);
}
}