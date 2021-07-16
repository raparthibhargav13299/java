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
    public void setretail(String retail) 
    {
        try{
            this.retail_price = Integer.parseInt(retail);
            
          }catch(NumberFormatException ex){
                      }  
    }
    public void setdiscount(String discount) 
    {
        try{
            this.discounted_price = Integer.parseInt(discount);
            
          }catch(NumberFormatException ex){
                      }  
    }
    public void setrating(String rating) 
    {
         try{   
            if(rating.equals("No rating available"))
            this.product_rating = 0;
            else        
            {    
            this.product_rating =  Float.parseFloat(rating);;
            }
        }catch(NumberFormatException ex){}
            
    
    }


}