import java.util.Scanner;
import java.util.Arrays;
class challenge16c
{
    public static void main(String[]args)
    {
        int i, no;
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        no=scan.nextInt();
        String[] name = new String[no];
        for (i = 0; i < no; i++)
        {
            System.out.println("Enter the words");
            name[i] = scan.next();
        }  
        System.out.println("Sorted array in Asending order");
        for(i=0;i<no;i++)
        {
        Arrays.sort(name);
        System.out.println(name[i]);
        }
    }
}