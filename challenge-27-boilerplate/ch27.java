import java.util.Scanner;

class ch27
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of customers: ");
        int n = sc.nextInt();

        person p = new person();
String firstname,lastname,village,mobile;
int age;
        
double inter;
     

Long at;
      


 firstname=null;
 inter=0.0;


        for (int i = 0; i < n; i++) 
        {
   
            System.out.println("Enter customers mobile no");
            p.setMobile();
            mobile=p.getMobile();
            if(mobile.length()==10)
            {



            System.out.println("Enter customers  name");
            p.setFirstname();
            firstname= p.getFirstname();
           
      
            System.out.println("Enter customers age");
            p.setAge();
            age = p.getAge();
            if(age>50){
                inter =0.5;
            }
            else if(age<50)
            {
                inter=0.2;
            }
            System.out.println("Enter customers village");
            p.setVillage();
            village = p.getVillage();
            }
            else if(mobile.length()!=10) {
                System.out.println("Please enter valid mobile no");
               System.exit(0);
            }

        
        savings st=new savings();
        
        at=st.mem();   
System.out.println("your account no is:"+"  "+at);

st.details(firstname,inter,at);
st.show();
System.out.println("Enter your account no to which u want to transfer");
Long hunk=sc.nextLong();
System.out.println("Enter how many days u have not used the account");
int ccc=sc.nextInt();
if(ccc<365){
if (hunk.equals(at)){
 System.out.println("Enter how much amount you want to deposit");
 Long opp=sc.nextLong();

 st.deposit(opp);

 System.out.println("Enter how much amount you want to withdraw");
 Long oppp=sc.nextLong();
 st.withdraw(oppp);
 System.out.println("Your final balance is");
 st.checkbalance();
}
else{
    System.out.println("Enter valid account no");
}

}
else
{
    System.out.println("your account is dormant account and a fresh customer KYC needs to be done");
}
   

        }
        

        
    

}

                            
    
    }


class person {

    private String firstname;
    private String lastname;
    private int age;
    private String village;
    private String mobile;
    
    Scanner scan = new Scanner(System.in);

    public String getFirstname() {
        return firstname;
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


}


















