import java.util.Scanner;

class ch26 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();

        person p = new person();

        String firstname[] = new String[n];
        String lastname[] = new String[n];
        int age[] = new int[n];
        String village[] = new String[n];
       String mobile[] = new String[n];
   
      int  cust=person.getCustomerid();







  

        for (int i = 0; i < n; i++) 
        {
   
            System.out.println("Enter customers mobile no");
            p.setMobile();
            mobile[i]=p.getMobile();
            if(mobile[i].length()==10)
            {



            System.out.println("Enter customers first name");
            p.setFirstname();
            firstname[i] = p.getFirstname();
            System.out.println("Enter customers last name");
            p.setLastname();
            lastname[i] = p.getLastname();
      
            System.out.println("Enter customers age");
            p.setAge();
            age[i] = p.getAge();
            System.out.println("Enter customers village");
            p.setVillage();
            village[i] = p.getVillage();
            }

        }
        person.display(cust,n, firstname, lastname, village, age, mobile);
        person.village(cust,n, firstname, lastname, village, age, mobile);
    

}

                            
    
    }


class person {

    private String firstname;
    private String lastname;
    private int age;
    private String village;
    private String mobile;
    private static int customerid = 1;
    Scanner scan = new Scanner(System.in);

    public String getFirstname() {
        return firstname;
    }

    public static int getCustomerid() {
        return customerid;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile() {
        this.mobile = scan.next();
    }

    public String getVillage() {
        return village;
    }

    public void setVillage() {
        this.village = scan.next();
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        this.age = scan.nextInt();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname() {
        this.lastname = scan.next();
    }

    public void setFirstname() {
        this.firstname = scan.next();
    }






    public static void display(int cust,int n,String firstname[],String lastname[],String village[],int age[],String mobile[]) 
    {   
        String lastnamee;
        
        Scanner scan=new Scanner(System.in);
      
        System.out.println("enter the last name to display particular person details : ");
            lastnamee=scan.next();
            for(int i=0;i<n;i++)
            {   
               
                if(lastnamee.equals(lastname[i]))
                {
                    System.out.println("customer id: "+cust+" \nfirst name : "+firstname[i]+"\nlast name : "+lastname[i]+"\nphone number : "+mobile[i]+"\nvillage or taluk : "+village[i]);
                }
            }
    }












    public static void village(int cust,int n,String firstname[],String lastname[],String village[],int age[],String mobile[]) 
    {
       
        
        String villagee;
    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the village or taluk name to display a list of customers belonging to a particular taluk or village : ");
        villagee=scan.next();
        System.out.println("--------------------------------------------------");
        System.out.println("s.no\tvillage or taluk\tname of customer");
        System.out.println("--------------------------------------------------");
        for(int i=0;i<n;i++)
        {

            if(villagee.equals(village[i]))
            {
                
                System.out.println((i+1)+"\t"+village[i]+"\t\t\t"+firstname[i]+" "+lastname[i]);
            }
        }
    }
}


