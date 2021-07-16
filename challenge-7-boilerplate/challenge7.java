import java.util.Scanner;
class challenge7
{
	public static void main(String[] args) 
	{
	   double USD=74.3;
	   double GBP=94.5;
	   double JPY=1.5;
	   double EUR=85.37;
	   double AED=20.25;

	   int currency[]={1,10,20,50,100};
	   double amount;
	   String input;
	   String output;
	   System.out.format("Demonitions(INR)\t\tUSD\t\tGBP\t\tJPY\t\tEUR\t\tAED\n");
	   for(int i=0;i<currency.length;i++)
	   {
		   System.out.format("%15d %18.2f %15.2f  %15.2f  %15.2f  %15.2f\n",(currency[i]),(currency[i])*USD,(currency[i])*GBP,(currency[i])*JPY,(currency[i])*EUR,(currency[i])*AED);
	   }
	   Scanner scan=new Scanner(System.in);
       System.out.println("Enter currency");
	   input=scan.nextLine();
	   System.out.println("Enter currency to  which you want to convert ");
	   output=scan.nextLine();
	   System.out.println("Enter amount:");
	   amount=scan.nextDouble();
	   switch(input)
	   {
		    case "USD":
				    switch(output)
				    {
						case "GBP":
                     {             
						System.out.println("The converted amount is:"+" "+((amount*USD)/GBP));
						 break;
					 }
						case "JPY":
						{
						System.out.println("The converted amount is:"+" "+((amount*USD)/JPY));
						break;
						}
						case "EUR":
						{
						System.out.println("The converted amount is:"+" "+((amount*USD)/EUR));
						 break;
						}
						case "AED":
						{
						System.out.println("The converted amount is:"+" "+((amount*USD)/AED));
						 break;
						}
						default:
						{
						System.out.println("Enter valid currency");
						}
				   }    
			break;
		    case "JPY":
			        switch(output)
			        {
					   case "GBP":
					 {  
					   System.out.println("The converted amount is:"+" "+((amount*JPY)/GBP));
						break;
					 }
					   case "USD":
					 {  
					   System.out.println("The converted amount is:"+" "+((amount*JPY)/USD));
						break;
					 }
					   case "EUR":
					 {  
					   System.out.println("The converted amount is:"+" "+((amount*JPY)/EUR));
						break;
					 }
					   case "AED":
					 {  
					   System.out.println("The converted amount is:"+" "+((amount*JPY)/AED));
						break;
					 }
					   default:
					   {
					   System.out.println("Enter valid currency");
					   }
				  }
			break;
			case "GBP":
					switch(output)
					{
					   case "JPY":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*GBP)/JPY));
						break;
					   }
					   case "USD":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*GBP)/USD));
						break;
					   }
					   case "EUR":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*GBP)/EUR));
						break;
					   }
					   case "AED":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*GBP)/AED));
						break;
					   }
					   default:
					   {
					   System.out.println("Enter valid currency");
					   }
					}  
            break;
			case "EUR":
					switch(output)
					{
					   case "JPY":
					 {  
					   System.out.println("The converted amount is:"+" "+((amount*EUR)/JPY));
						break;
					 }
					   case "USD":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*EUR)/USD));
						break;
					   }
					   case "GBP":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*EUR)/GBP));
						break;
					   }
					   case "AED":
					   {
					   System.out.println("The converted amount is:"+" "+((amount*EUR)/AED));
						break;
					   }
					   default:
					   {
					   System.out.println("Enter valid currency");
					}  }
            break;	  
				}
			}
		}