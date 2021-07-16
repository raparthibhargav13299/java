class searching {
    
    int temp=0;
    
    public void linearserach(details d1[],String item){
    try{
    for(int i = 0; i<19923; i++)  
    {  
        if(d1[i].getpid().equals(item))  
        {  
            temp= i+1;  
            break;  
        }  
        
        else   
            temp = 0;   
    }  
}catch(Exception e){}
    if(temp != 0)  
    {  
        System.out.println("Item found ,details are : ");
        System.out.println(d1[temp-1].getpid()+", "+d1[temp-1].getname()+", "+d1[temp-1].getbrand()+", "+d1[temp-1].geturl()+", "+d1[temp-1].getretail()+", "+d1[temp-1].getdiscount()+", "+d1[temp-1].getrating());  
    }  

    else   
        System.out.println("Item not found");  
        
    
}
}
