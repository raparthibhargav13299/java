
import java.util.Scanner;



class challenge16b
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
        System.out.println("Enter a word to search");
        String word=scan.next();
        for(i=0;i<no;i++)
        {
          if(word.equals(name[i]))
         {
           System.out.println("The word is present");
           System.out.println(name[i]);
        } 
       }
      }
    }
 