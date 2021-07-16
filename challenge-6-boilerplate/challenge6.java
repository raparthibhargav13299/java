import java.util.Scanner;
class challenge6
{
public static void main(String []args)
{
    final double USD=74.3,GBP=94.5,JPY=0.67,EURO=85.37,AED=20.25;
    String currency;
    double c;
    float amount;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the currency ");
    currency=scan.next();
    System.out.println("Enter the amount ");
    amount=scan.nextInt();
    switch(currency)
    {
        case "USD":
        {
            c = USD*amount;
            System.out.println("The Exchange rate for "+amount+" " + currency +" " +"is : "+c+" "+"INR");
            break;
        }
        case "GBP":
        {
            c = GBP*amount;
            System.out.println("The Exchange rate for "+amount+" " + currency+" "+ "is : "+c+" "+"INR");
            break;
        }
         case "JPY":
        {
            c = JPY*amount;
            System.out.println("The Exchange rate for "+amount+" " + currency+" "+"is : "+c+" "+"INR");
            break;
        }
        case "EURO":
        {
            c = EURO*amount;
            System.out.println("The Exchange rate for "+amount+" "  + currency+" "+"is :"+c+" "+"INR");
            break;
        } 
         case "AED":
        {
            c= AED*amount;
            System.out.println("The Exchange rate for "+amount+" "+currency+" "+" is : "+c+" "+"INR");
            break;
        }
        default:
        {
            System.out.println("Invalid currency");
        }

    } 
}

}   
