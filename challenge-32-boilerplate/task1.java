
import java.io.*; 
class task1{
    public static void main(String[] args)throws Exception {

        FileReader fr=new FileReader("E:/coding/challenge/challenge-32-boilerplate/data/flipkart_product_sample.csv");    
        BufferedReader br=new BufferedReader(fr);
        details d=new details();
        sorting s1=new sorting();
        details[] d1=new details[19923];
        details[] d2=new details[19923];
        float[] f=new float[19923];
        int[] a=new int[19923];
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
                f[j]=d.getrating();
                a[j]=d.getretail();
                j++;

                }
              }
                
            br.close();    
            fr.close();
          
            s1.ratesorting(d1,f);
            s1.retailsorting(d2,a);

            
                
    }
}