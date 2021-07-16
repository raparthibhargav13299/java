import java.io.BufferedReader;
import java.io.FileReader;
public class main
{
    public static void main(String[] args) 
    {
        SinglyLinkedList Sll = new SinglyLinkedList();
        try 
        {
            String words;
            FileReader file = new FileReader("daffodils.txt");



            BufferedReader buff = new BufferedReader(file);
            while((words=buff.readLine())!=null)
            {
                String []arr = words.split("[, :;/-/.]");
                System.out.println(arr.length);
                for (String word : arr) 
                {
                    Sll.insertAt(new Word(word));    
                }
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
        Sll.showWordList();
        Sll.sortNode();
        System.out.println("Sorted List");
        Sll.showWordList();
        System.out.println("Reverse order");
        Sll.reverseNode(Sll.head);
        System.out.println("the words in descending order of frequency");
        Sll.showFreqWords();
        Sll.showWordList();
    }    
}