import java.util.Scanner;
class area
{
public static void main(String []args)
{
int num1, num2, square,rectangle;
Scanner obj= new Scanner(System.in);
System.out.println("Enter First Number");
num1=obj.nextInt();
System.out.println("Enter Second Number");
num2=obj.nextInt();
rectangle=num1*num2;
System.out.println(rectangle);
square=num1*num1;
System.out.println(square);
}
}
