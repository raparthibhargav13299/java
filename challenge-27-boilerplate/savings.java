import java.util.*;
public class savings  {
Long ac;
String name,type;
float amount=0;
double interest;

    public Long mem(){
    long leftLimit = 1000000000000L;
    long rightLimit = 10000000000000L;
    long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
   
    return generatedLong;
    
}

void details(String nm,double ip,Long at){
    interest=ip;
    ac=at;
    name=nm;
 
   

}

void show(){
    System.out.println("your account no is:"+ "  "+ac+"     "+"your name is :"+ "  "+name+"    "+"your intial amount is :"+"  "+ amount+"   "+"your interest based on age :"+" "+interest);


}
void deposit(float a){
    amount+=a;
    System.out.println("you have successfuly deposited"+"   "+a);
    


}void withdraw(float a)
{
    if(amount<a){
        System.out.println("sorry,insufficient balance in your account");

    }
    else{
        amount-=a;
        System.out.println("you have successfully withdrawn amount"+"   "+a);
    }
}
void checkbalance(){
    System.out.println(amount);
}
}










