import java.util.Scanner;
class challenge20
{
    public static void main(String[]args)
    {
      fibonacci(10);
  
    
    }
    public static int fibonacci(int n)
    {
        if(n<1) 
        {
            return 0;
        }
        int sum = 0;
        int a = 1;
        int b = 1;
        for (int i=0;i<n;i++)
        {
            a = sum;
            sum+=b;
            b=a;
            System.out.println(sum);
        }
        return sum;

    }
}
