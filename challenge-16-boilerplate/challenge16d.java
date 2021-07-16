import java.util.Scanner;

class challenge16d
{
    public static void main(String[]args)
    {
        int i, no,ct=0;
       
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of words: ");
        no=scan.nextInt();
        String[] name = new String[no];
        for (i = 0; i < no; i++)
        {
            System.out.println("Enter the words");
            name[i] = scan.next();
        } 
        for(i=0;i<no;i++)
        {
            StringBuilder str =new StringBuilder(name[i]).reverse();
            if(name[i].equals(str.toString()))
            {
                ct++;
                System.out.println("The palindrome is");
                System.out.println(name[i]);
            }
        }
        System.out.println("The number of palindromes in the list :"+ct);
    }
}