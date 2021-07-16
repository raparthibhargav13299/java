import java.util.Scanner;
class challenge9 
{
    public static void main(String[]args)
    {
        int today,afterday,num1,num2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the current day of week");
        today=scan.nextInt();
        System.out.println("Enter the no. of days from today:");
        afterday=scan.nextInt();
        num1=today+afterday;
        num2=num1%7;
        if(num2==0)
        {
            num2=7;
        }
        else if(num2<=7)
        {
        switch(num2)
        {
            case 7:
            {
                System.out.println("It is Sunday");
                break;
            }
            case 1:
            {
                System.out.println("It is Monday");
                break;
            }
            case 2:
            {
                System.out.println("It is Tuesday");
                break;
            }
            case 3:
            {
                System.out.println("It is Wednesday");
                break;
            }
            case 4:
            {
                System.out.println("It is Thusday");
                break;
            }
            case 5:
            {
                System.out.println("It is Friday");
                break;
            }
            case 6:
            {
                System.out.println("It is Saturday");
                break;
            }
            case -1:
            {
                System.out.println("It is Saturday");
                break;
            }
            case -2:
            {
                System.out.println("It is Friday");
                break;
            }
            case -3:
            {
                System.out.println("It is Thusday");
                break;
            }
            case -4:
            {
                System.out.println("It is Wednessday");
                break;
            }
            case -5:
            {
                System.out.println("It is Tuesday");
                break;
            }
            case -6:
            {
                System.out.println("It is Monday");
                break;
            }
            default:
            {
                System.out.println("Invalid day");
                break;
            }
        }
        }
        else
        {
            System.out.println("Invalid day");
        }
    }
}