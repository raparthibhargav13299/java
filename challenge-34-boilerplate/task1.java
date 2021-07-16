import java.util.*;
import java.io.*; 
class task1{
    public static void main(String[] args)throws Exception {

        FileReader fr=new FileReader("E:/coding/challenge/challenge-34-boilerplate/data/flipkart_product_sample.csv");    
        BufferedReader br=new BufferedReader(fr);
        details d=new details();
        searching s1=new searching();
        details[] d1=new details[19923];
        details[] d2=new details[19923];
        String[] a=new String[19923];
        int j=0;

        String line;
        br.skip(79);
        while((line=br.readLine())!=null){
            if (!line.isEmpty()) {

                  String[] obj=line.split("[,]");
                  
                  d.setpid(obj[0]);
                  d.setname(obj[1]);
                  d.setbrand(obj[2]);
                  d.seturl(obj[3]);
                  d.setretail(obj[4]);    
                  d.setdiscount(obj[5]);
                  d.setrating(obj[6]);
                  
                d1[j]=new details(d.getpid(),d.getname(),d.getbrand(),d.geturl(),d.getretail(),d.getdiscount(),d.getrating());
                d2[j]=new details(d.getpid(),d.getname(),d.getbrand(),d.geturl(),d.getretail(),d.getdiscount(),d.getrating());
                
            
                j++;

                }
              }
                
            br.close();    
            fr.close();
            Scanner sc = new Scanner(System.in);  
            System.out.println("Enter Item ?");  
            String item = sc.next();
            s1.linearserach(d1,item);
            
                
    }
}