import java.util.Scanner;
class vowel
{
public static void main(String []args)
{
char ch;
Scanner obj= new Scanner(System.in);
System.out.println("Enter string");
ch=obj.next().charAt(2);
if ( ch== 'a' || ch== 'e' ||  ch == 'i' ||  ch== 'o' ||  ch == 'u' ||  ch == 'A' ||  ch == 'E' ||  ch== 'I' ||  ch == 'O' ||  ch == 'U')
{
System.out.println("it is vowel");
}
else
{
System.out.println("it is consonant");
}
}
}	             

