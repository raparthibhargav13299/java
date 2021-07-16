import java.util.Scanner;
class avg
{
public static void main(String []args)
{
int num1, num2,num3,num4,num5,sum,result;
Scanner obj= new Scanner(System.in);
System.out.println("Enter First Number");
num1=obj.nextInt();
System.out.println("Enter second Number");
num2=obj.nextInt();
System.out.println("Enter third Number");
num3=obj.nextInt();
System.out.println("Enter fourth Number");
num4=obj.nextInt();
System.out.println("Enter fifth Number");
num5=obj.nextInt();
sum = num1 + num2 + num3 +  num4 + num5;
System.out.println(sum);
result=sum/5;
System.out.println(result);
}
}