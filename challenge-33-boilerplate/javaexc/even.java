import java.util.Scanner;
class even
{
public static void main(String []args)
{
int num1;
Scanner obj= new Scanner(System.in);
System.out.println("Enter a Number");
num1 = obj.nextInt();
if(num1%2==0)
{
System.out.println("Number is Even");
}
else
{
System.out.println("Number is Odd");
}
}
}