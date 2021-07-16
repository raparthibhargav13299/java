public class ch28
{


    public static void main(String[] args)
     {
petrol p = new petrol();
p.showSpec("P1000");
p.showSpec("P1500");
p.showSpec("P2000");
p.showSpec("P2400");

diesel d= new diesel();
d.showSpec("D1300");
d.showSpec("D1800");
d.showSpec("D2400");
cng c=new cng();
c.showSpec("C1000");
c.showSpec("C1500");
elect e= new elect();
e.showSpec("88");




    }
}
class engine
{

    
        public int Power1,Rpm1,Torque1,weight1,Power2,Rpm2,Torque2,weight2,Power3,Rpm3,Torque3,weight3,Power4,Rpm4,Torque4,weight4,Power5,Rpm5,Torque5,weight5,Power6,Rpm6,Torque6,weight6,Power7,Rpm7,Torque7,weight7,Power9,Rpm9,Torque9,weight9,Power10,Rpm10,Torque10,weight10;
        public String Num1="P1000",Num2="P1500",Num3="P2000",Num4="P2400",Num5="D1300",Num6="D1800",Num7="D2400",Num8="C1000",Num9="C1500",Num10="88";
        
         public int Power8,Rpm8,Torque8,weight8;
            public engine()
             {
                
                if(Num1=="P1000")
              {
                this.Num1="P1000";
                this.Power1 = 50;        
                this.Rpm1 = 6000;
                this.Torque1 = 90;
                this.weight1 = 75;
                
            }
            if(Num2=="P1500")
            {
              this.Num2="P1500";
                this.Power2 = 88;        
                this.Rpm2 = 6500;
                this.Torque2 = 155;
                this.weight2 = 93;
                
            }
            
            if(Num3=="P2000")
            {
              Num3="P2000";
                this.Power3 = 118;        
                this.Rpm3 = 6500;
                this.Torque3 = 220;
                this.weight3 =125 ;
                
            }
            
            if(Num4=="2400")
            {
                this.Num4="P2400";
                this.Power4 = 138 ;        
                this.Rpm4= 6900;
                this.Torque4 = 340;
                this.weight4 = 140;
            }
            if(Num5=="D1300")
            {
                this.Num5="D1300";
                this.Power5 = 67;        
                this.Rpm5 = 6000;
                this.Torque5 = 170;
                this.weight5 =141 ;
            }
        
        
            if(Num6=="D1800")
            {
            this.Num6="D1800";
                this.Power6 = 103;        
                this.Rpm6 = 6300;
                this.Torque6 = 170;
                this.weight6 = 141;
            }
            if(Num7=="D2400")
            {
                this.Num7="D2400";
                this.Power7 = 136;        
                this.Rpm7 = 7000;
                this.Torque7 = 233;
                this.weight7 = 152;
                
            }
                     
            if(Num8=="C1000")
            {
                this.Num8="C1000";
                this.Power8 = 43;        
                this.Rpm8 = 6000;
                this.Torque8 = 78;
                this.weight8 = 75;
        
            }
            
            if(Num9=="C1500")
            {
                this.Num9="C1500";
                this.Power9 = 69;        
                this.Rpm9 = 6500;
                this.Torque9 = 122;
                this.weight9 = 93;
                
            }
            if(Num10=="88")
            {
                this.Num10="88";
                this.Power10 = 88;        
                this.Rpm10 = 15000;
                this.Torque10 = 220;
                weight10 = 45;
            }
        }   
            
}       
          
    




class ic extends engine
{
    public String Num1="P1000",Num2="P1500",Num3="P2000",Num4="P2400",Num5="D1300",Num6="D1800",Num7="D2400"
    ,Num8="C1000",Num9="C1500",Num10="88";
    public int dis1,cy1,dis2,cy2,dis3,cy3,dis4,cy4,dis5,cy5,dis6,cy6,dis7,cy7,dis8,cy8,dis9,cy9;
    public String cr1,cr2,cr3,cr4,cr5,cr6,cr7,cr9,cr8;
    

    public void icengine()
    {
        if(this.Num1=="P1000")
          {
            this.dis1 = 996;
            this.cy1 = 3;
            this.cr1 = "11.0:1";
        }
        if(this.Num2=="P1500")
        {
          
            this.dis2 = 1498;
            this.cy2 = 4;
            this.cr2 = "10.3:1";
        }
        

        if(this.Num3=="P2000")
        {
            this.dis3 = 1992;
            this.cy3 = 4;
            this.cr3 ="12.0:1" ;
        }
        
        if(this.Num4=="P2400")
        {
            
            this.dis4 = 2396;
            this.cy4 = 6;
            this.cr4 = "10.5:1" ;
        }
        if(Num5=="D1300")
        {
            
            this.dis5 = 1248;
            this.cy5 = 4;
            this.cr5 = "17.6:1";
        }
    
    
        if(Num6=="D1800")
        {
        
            this.dis6 = 1796;
            this.cy6 = 4;
            this.cr6 = "10.5:1";
        }

        if(Num7=="D2400")
        {
            
            this.dis7 = 2384;
            this.cy7 = 4;
            this.cr7 = "11.2:1";
        }
                 
        if(Num8=="C1000")
        {
            
            this.dis8 = 998;
            this.cy8 = 3;
            this.cr8 = "11.0:1";
        }
        
        if(Num9=="C1500")
        {
            this.dis9 = 14998;
            this.cy9 = 4;
            this.cr9 = "10.5:1";
        }
    }
}
class petrol extends ic
{

    public String Num1="P1000",Num2="P1500",Num3="P2000",Num4="P2400";
    
    public int dis1,cy1,dis2,cy2,dis3,cy3,dis4,cy4,dis5,cy5,dis6,cy6,dis7,cy7,dis8,cy8,dis9,cy9;
    public String cr1,cr2,cr3,cr4;
    public int Power1,Rpm1,Torque1,weight1,Power2,Rpm2,Torque2,weight2,Power3,Rpm3,Torque3,weight3,Power4,Rpm4,Torque4,weight4,Power5,Rpm5,Torque5,weight5,Power6,Rpm6,Torque6,weight6,Power7,Rpm7,Torque7,weight7,Power8,Rpm8,Torque8,weight8,Power9,Rpm9,Torque9,weight9,Power10,Rpm10,Torque10,weight10;

    public petrol()
    {
    if(Num1=="P1000")
    {
      this.Num1="P1000";
      this.Power1 = 50;        
      this.Rpm1 = 6000;
      this.Torque1 = 90;
      this.weight1 = 75;
      this.dis1 = 996;
      this.cy1 = 3;
      this.cr1 = "11.0:1";
  }
  if(Num2=="P1500")
  {
    this.Num2="P1500";
      this.Power2 = 88;        
      this.Rpm2 = 6500;
      this.Torque2 = 155;
      this.weight2 = 93;
      
      this.dis2 = 1498;
      this.cy2 = 4;
      this.cr2 = "10.3:1";
  }

  if(Num3=="P2000")
  {
    Num3="P2000";
      this.Power3 = 118;        
      this.Rpm3 = 6500;
      this.Torque3 = 220;
      this.weight3 =125 ;
      this.dis3 = 1992;
    this.cy3 = 4;
     this.cr3 ="12.0:1";
  }

  if(Num4=="P2400")
  {
      this.Num4="P2400";
      this.Power4 = 138 ;        
      this.Rpm4= 6900;
      this.Torque4 = 340;
      this.weight4 = 140;
      this.dis4 = 2396;
      this.cy4 = 6;
      this.cr4 = "10.5:1" ;
  }

}


  

 


   
    public void showSpec(String Num)
     {

        switch(Num)
        {
        case "P1000":
        System.out.println( "engine type  : IC ENGINE"+"\npower source : petrol "+"\nmodel num    : "+Num1+"\ndisplacement : " +dis1 +
        "\nmax power    : "+Power1+ "\nmax rpm      : " + Rpm1 + "\nmax torque   : " + Torque1 +
        "\nweight       : "+weight1+"\ncylinders    : "+cy1+"\ncompression ratio : "+cr1+"\n\n-----------------------------------------------------\n\n");
    
    break;
    case "P1500":
        System.out.println( "engine type  : IC ENGINE"+"\npower source : petrol "+"\nmodel num    : "+Num2+"\ndisplacement : " +dis2+
        "\nmax power    : "+Power2+ "\nmax rpm      : " + Rpm2 + "\nmax torque   : " + Torque2 +
        "\nweight       : "+weight2+"\ncylinders    : "+cy2+"\ncompression ratio : "+cr2+"\n\n-----------------------------------------------------\n\n");
    
    break;
    case "P2000":
    System.out.println( "engine type  : IC ENGINE"+"\npower source : petrol "+"\nmodel num    : "+Num3+"\ndisplacement : " +dis3 +
        "\nmax power    : "+Power3+ "\nmax rpm      : " + Rpm3 + "\nmax torque   : " + Torque3 +
        "\nweight       : "+weight3+"\ncylinders    : "+cy3+"\ncompression ratio : "+cr3+"\n\n-----------------------------------------------------\n\n");
    
    break;
    case "P2400":
    System.out.println( "engine type  : IC ENGINE"+"\npower source : petrol "+"\nmodel num    : "+Num4+"\ndisplacement : " +dis4 +
        "\nmax power    : "+Power4+ "\nmax rpm      : " + Rpm4 + "\nmax torque   : " + Torque4 +
        "\nweight       : "+weight4+"\ncylinders    : "+cy4+"\ncompression ratio : "+cr4+"\n\n-----------------------------------------------------\n\n");
    
    break;
    
  }
}
        
       

      
  
}
class diesel  extends ic 
{


public diesel()
{


  if(Num5=="D1300")
            {
                this.Num5="D1300";
                this.Power5 = 67;        
                this.Rpm5 = 6000;
                this.Torque5 = 170;
                this.weight5 =141 ;
                this.dis5 = 1248;
                this.cy5 = 4;
                this.cr5 = "17.6:1";
            }
        
        
            if(Num6=="D1800")
            {
            this.Num6="D1800";
                this.Power6 = 103;        
                this.Rpm6 = 6300;
                this.Torque6 = 170;
                this.weight6 = 141;
                this.dis6 = 1796;
            this.cy6 = 4;
            this.cr6 = "10.5:1";
            }
            if(Num7=="D2400")
            {
                this.Num7="D2400";
                this.Power7 = 136;        
                this.Rpm7 = 7000;
                this.Torque7 = 233;
                this.weight7 = 152;
                this.dis7 = 2384;
                this.cy7 = 4;
                this.cr7 = "11.2:1";
        
            }



}
public void showSpec(String Num)
     {
         

        switch(Num)
        {
        case "D1300":
        System.out.println( "engine type  : IC ENGINE"+"\npower source : Diesel "+"\nmodel num    : "+Num5+"\ndisplacement : " +dis5 +
        "\nmax power    : "+Power5+ "\nmax rpm      : " + Rpm5 + "\nmax torque   : " + Torque5 +
        "\nweight       : "+weight5+"\ncylinders    : "+cy5+"\ncompression ratio : "+cr5+"\n\n-----------------------------------------------------\n\n");
    
    break;
    case "D1800":
        System.out.println( "engine type  : IC ENGINE"+"\npower source : Diesel "+"\nmodel num    : "+Num6+"\ndisplacement : " +dis6+
        "\nmax power    : "+Power6+ "\nmax rpm      : " + Rpm6 + "\nmax torque   : " + Torque6 +
        "\nweight       : "+weight6+"\ncylinders    : "+cy6+"\ncompression ratio : "+cr6+"\n\n-----------------------------------------------------\n\n");
    
    break;
    case "D2400":
    System.out.println( "engine type  : IC ENGINE"+"\npower source : Diesel "+"\nmodel num    : "+Num7+"\ndisplacement : " +dis7 +
        "\nmax power    : "+Power7+ "\nmax rpm      : " + Rpm7 + "\nmax torque   : " + Torque7 +
        "\nweight       : "+weight7+"\ncylinders    : "+cy7+"\ncompression ratio : "+cr7+"\n\n-----------------------------------------------------\n\n");
    
    break;


  
  }
     }
    }



    class cng extends ic 
    {
       
        public cng()
        {

            if(Num8=="C1000")
            {
                
                this.dis8 = 998;
                this.cy8 = 3;
                this.cr8 = "11.0:1";
            }

           
            
            if(Num9=="C1500")
            {
                this.Num9="C1500";
                this.Power9 = 69;        
                this.Rpm9 = 6500;
                this.Torque9 = 122;
                this.weight9 = 93;
                this.dis9 = 14998;
            this.cy9 = 4;
            this.cr9 = "10.5:1";
                
            }





        }
public void showSpec(String Num)
     {

        switch(Num)
        {
            case "C1000":
        System.out.println( "engine type  : IC ENGINE"+"\npower source : CNG  "+"\nmodel num    : "+Num8+"\ndisplacement : " +dis8+
        "\nmax power    : "+Power8+ "\nmax rpm      : " + Rpm8 + "\nmax torque   : " + Torque8 +
        "\nweight       : "+weight8+"\ncylinders    : "+cy8+"\ncompression ratio : "+cr8+"\n\n-----------------------------------------------------\n\n");
       
    break;
    case "C1500":
    System.out.println( "engine type  : IC ENGINE"+"\npower source : CNG  "+"\nmodel num    : "+Num9+"\ndisplacement : " +dis9+
    "\nmax power    : "+Power9+ "\nmax rpm      : " + Rpm9 + "\nmax torque   : " + Torque9 +
    "\nweight       : "+weight9+"\ncylinders    : "+cy9+"\ncompression ratio : "+cr9+"\n\n-----------------------------------------------------\n\n");
   
break;

   



}




    }
}




    class elect  extends engine 
    {
        public int Power1,Rpm1,Torque1,weight1,Power2,Rpm2,Torque2,weight2,Power3,Rpm3,Torque3,weight3,Power4,Rpm4,Torque4,weight4,Power5,Rpm5,Torque5,weight5,Power6,Rpm6,Torque6,weight6,Power7,Rpm7,Torque7,weight7,Power8,Rpm8,Torque8,weight8,Power9,Rpm9,Torque9,weight9,Power10,Rpm10,Torque10,weight10,voltage;

public String Num10="88",currType;
public elect(){



    if(Num10=="88")
    {
        this.Num10="88";
        this.Power10 = 88;        
        this.Rpm10 = 15000;
        this.Torque10 = 220;
        weight10 = 45;

        this.currType = "AC";
        this.voltage = 45;
    }

}
public void showSpec(String Num)
 {
    System.out.println( "engine type  : Electric Engines"+"\npower source : Electric "+"\nmodel num    : "+Num10+
    "\nmax power    : "+Power10+ "\nmax rpm      : " + Rpm10 + "\nmax torque   : " + Torque10 +
    "\nweight       : "+weight10+"\ncurrent type : "+currType+"\nvolatge      : "+voltage+"\n\n-----------------------------------------------------\n\n");
}
    }
