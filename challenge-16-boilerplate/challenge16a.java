import java.util.Scanner;

class challenge16a
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
        String smallest = name[0];
        for ( i = 1; i < name.length; i++) 
        {
        if (name[i].length() < smallest.length()) 
        {
            smallest = name[i];
        }
        }
        System.out.println("the shortest word is: "+smallest); 
    }
}
   
