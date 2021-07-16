import java.io.FileReader;
import java.io.BufferedReader;

class a {

    public static void main(String[] args)  {
     try{   
            FileReader f = new FileReader("data/");
            BufferedReader b=new BufferedReader(f);
     }
    





    
    catch(Exception e){
System.out.println("oppp");
    }
    finally{
        System.out.println("oppppp");
    }
}
}