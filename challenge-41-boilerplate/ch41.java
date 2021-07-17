import java.io.*; 
import java.util.*;
import java.util.Comparator;
class ch41{
    public static void main(String[] args)throws Exception {
    List<details> books = readdataFromCSV("flipkart-product-sample.csv");
    Collections.sort(books,new pricesort());{
    FileWriter fw = null;
    BufferedWriter bw = null;
    try { 
        fw = new FileWriter("sort_basedon_price.txt"); 
        bw = new BufferedWriter(fw);
        for(details d:books){
        bw.write(d.toString());
        //bw.write("\n");
        }
        fw.close();
            System.out.println("Succesfully written to the file: " );           
        }catch(Exception e){
            e.printStackTrace();}}
         Collections.sort(books,new ratingsort());{
            FileWriter fw = null;
            BufferedWriter bw = null;
            try { 
                fw = new FileWriter("sort_basedon_rating.txt"); 
                bw = new BufferedWriter(fw);
                for(details d:books){
                bw.write(d.toString());
                // bw.write("\n");
                }
                fw.close();
                    System.out.println("Succesfully written to the file: " );           
                }catch(Exception e){
                    e.printStackTrace();}
            }
    }
            private static List<details> readdataFromCSV(String fileName)throws Exception {
                 List<details> books = new ArrayList<>();
        FileReader fr=new FileReader(fileName);    
        BufferedReader br=new BufferedReader(fr);
        String line;
        try{
                 while((line=br.readLine())!=null){
                    if (!line.isEmpty()) {
                          String[] attributes=line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                    details book = createdata(attributes);
                     books.add(book);
                     line = br.readLine(); 
                    }
                }
                 } catch (IOException ioe) { ioe.printStackTrace();
             } 
            br.close();    
            fr.close();
                 return books;
         }
            private static details createdata(String[] metadata) {
                 String pid = metadata[0]; 
                 String product_name = metadata[1];
                 String brand = null;
                 if(metadata[2]=="")
                 brand=null;
                 else
                 brand=metadata[2];  
                 String product_url = metadata[3];
                 int retail_price=0;
                 int discounted_price=0;
                 try{
                  retail_price = Integer.parseInt(metadata[4]); 
                  discounted_price = Integer.parseInt(metadata[5]); 
                 }catch(NumberFormatException e){}
                 float rating =0;
         try{   
            if(metadata[6].equals("No rating available"))
             rating  = 0;
            else        
            {    
                rating  =  Float.parseFloat(metadata[6]);;
            }
        }catch(NumberFormatException ex){}
         return new details(pid,product_name,brand,product_url,retail_price,discounted_price,rating);
    }
}
 class details{
    private String pid,product_name,brand,product_url;
    private int retail_price,discounted_price;
    private float product_rating;
    public details(){}
    public details(String pid,String name,String brand,String url,int retail,int discount,float rating){
        this.pid=pid;
        this.product_name=name;
        this.brand=brand;
        this.product_url=url;
        this.retail_price=retail;
        this.discounted_price=discount;
        this.product_rating=rating;
    }
    public void setpid(String pid)throws Exception
    {    this.pid=pid;  
    }  
    public String getpid()
    {
        return pid;
    }
    public String getname()
    {
        return product_name;
    }    
    public String getbrand()
    {
        return brand;
    }
    public String geturl()
    {
        return product_url;
    }
    public int getretail()
    {
        return retail_price;
    }
    public int getdiscount()
    {
        return discounted_price;
    }
    public float getrating()
    {
        return product_rating;
    }
    public void setname(String name)throws Exception
    {    this.product_name=name;  
    }
    public void setbrand(String brand)throws Exception
    {   if(brand=="")
        this.brand=null;
        else
        this.brand=brand;  
    }
    public void seturl(String url)throws Exception
    {    this.product_url=url;  
    }
    public void setretail(int retail) 
    {
        this.retail_price=retail;
    }
    public void setdiscount(int discount) 
    {
        this.discounted_price=discount;
    }
    public void setrating(float rating) 
    {
        this.product_rating=rating;
    }
    @Override 
    public String toString() {
         return "[ "+ pid + ", " + product_name + ", " + brand +","+ product_url + "," + retail_price + "," + discounted_price +","+product_rating+" ]\n"; 
        }
}
 class pricesort implements Comparator<details> {
    @Override
    public int compare(details o1, details o2) {
        return o1.getretail() - o2.getretail();
    }
}
 class ratingsort implements Comparator<details> {
    @Override
    public int compare(details p1, details p2) {
        float dif = p1.getrating() - p2.getrating();
        if (dif > 0) return 1;
        if (dif < 0) return -1;
        return 0; 
    }
}