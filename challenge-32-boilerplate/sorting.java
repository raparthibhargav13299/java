
import java.io.*;
class sorting{



        details[] d1=new details[19923];
        details[] d2=new details[19923];
    public void ratesorting(details d1[],float f[]){
        
            
        try{
            
    for(int i=0;i<19923;i++)  
    {  
        for (int j=i+1;j<19923;j++)  
        {  
            if(f[i]<f[j])  
            {  
                float temp = f[i];  
                f[i]=f[j];
                d1[i]=d1[j];  
                f[j] = temp;  
            }  
        }  
    }
}catch(Exception e){}
System.out.println("based on rating the Sorted List is..."); 
try{
 
FileWriter myWriter = new FileWriter("E:/coding/challenge/challenge-32-boilerplate/sort_basedon_rating.txt");


try{
    for(int i=0;i<19923;i++)  
    {  
        myWriter.write(f[i]+","+d1[i].getpid()+","+d1[i].getname()+","+d1[i].getbrand()+","+d1[i].geturl()+","+d1[i].getretail()+","+d1[i].getdiscount()+"\n"); 
        
    } 
    myWriter.close();
      
}catch(NullPointerException e){}
    }catch(IOException ex){}
    System.out.println("Successfully wrote to the file.");
}

    public void retailsorting(details d2[],int a[]){

            
        try{
            
    for(int i=0;i<19923;i++)  
    { 
        for (int j=i+1;j<19923;j++)  
        {  
            if(a[i]<a[j])  
            {  
                int temp = a[i];  
                a[i]=a[j];  
                d2[i]=d2[j];
                a[j] = temp;  
            }  
        }  
    }
}catch(Exception e){}
try{
 
    FileWriter myWriter = new FileWriter("E:/coding/challenge/challenge-32-boilerplate/sort_basedon_price.txt");
    

System.out.println("based on retail price Sorted List is...");  
try{
    for(int i=0;i<19923;i++)  
    {  
        
        myWriter.write(a[i]+","+d2[i].getpid()+","+d2[i].getname()+","+d2[i].getbrand()+","+d2[i].geturl()+","+d2[i].getdiscount()+","+d2[i].getrating()+"\n"); 
            } 
            myWriter.close();
}catch(NullPointerException e){}
    }catch(IOException e){}

            System.out.println("Successfully wrote to the file.");
      
}

         
    
}
