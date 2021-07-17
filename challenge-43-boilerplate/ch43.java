import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Comparator;
import java.util.TreeSet;
public class ch43 {
    static int nooffilewords = 0;

    static int noofwords = 0;
    static TreeSet<Word> set = new TreeSet<Word>(new SortWordsasc());
    static TreeSet<String> tree = new TreeSet<String>();
    public static void main(String[] args) throws Exception {
        ch43.readFromFile("data/daffodils.txt");
        for (Word s : set) {
            System.out.println(s.getWord());
        }
        System.out.println("----------Reverse order------------");
        TreeSet<Word> descset = (TreeSet<Word>) set.descendingSet();
        for (Word s : descset) {
            System.out.println(s.getWord());
        }
    }
    public static void readFromFile(String fileName) throws Exception {
        File file = new File(fileName);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = "";
            String[] words = null;
            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[,':;.?]", "");
                words = line.split(" ");
                for (String word1 : words) {
                    ch43.nooffilewords++;
                    Word w = new Word(word1);
                    if(set.contains(w)){
                        w.setWordsRepeated();
                    }else{
                    set.add(w);
                    tree.add(w.getWord());
                    ch43.nooffilewords++;
                    }
                
                }
            }
        }
    }
}
class Word {
    private String word;
    private int wordsRepeated = 0;;
    Word(String word) {
        this.setWord(word);
        this.setWordsRepeated();
    }
    public String getWord() {
        return word;
    }
    public void setWord(String word) {
        this.word = word;
    }
    public int getWordsRepeated() {
        return wordsRepeated;
    }
    public void setWordsRepeated() {
        wordsRepeated++;
    }
}
class SortWordsasc implements Comparator<Word> {
    @Override
    public int compare(Word o1, Word o2) {
        if (o1.getWord().compareTo(o2.getWord()) > 0) {
            return 1;
        }
        if (o1.getWord().compareTo(o2.getWord()) == 0) {
            return 0;
        } else
            return -1;
    }
}
