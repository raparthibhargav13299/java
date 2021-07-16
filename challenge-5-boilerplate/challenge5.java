import java.util.Scanner;
class challenge5
{
    float celsiusToFahrenheit(float temp)   
    {
        float result;
        result= ((temp * 9) / 5) + 32;
        return result;
    }
    float fahrenheitToCelsius(float temp)
    {
        float result;
       result=(temp-32)*5/9;
        return result;
    }
    public static void main(String[] args)
    {
            Scanner scan = new Scanner(System.in);
            char a,d;
            float temp;
            challenge5 data = new challenge5();
            do
            {
                System.out.println("Enter the temperature:");
                temp= scan.nextInt();
                System.out.println("Enter the source scale(celcius(c)/fahrenheit(f))?");
                a= scan.next().charAt(0);
                if(a =='c')
                {
                 float temp1;
                 temp1=data.celsiusToFahrenheit(temp);          
                 System.out.println("Temperature(Celsius)= " + temp +"      Temperature(Fahrenheit)= " +  temp1 );
                }
                else if(a =='f')
                {
                 float temp1;
                 temp1=data.fahrenheitToCelsius(temp);         
                 System.out.println("Temperature(fahrenheit)= " + temp +"      Temperature(celsius)= " +  temp1 );
                }
             System.out.println("Do you wish to continue(y/n)?");
             d = scan.next().charAt(0);
            }
            while(d =='y' || d =='Y');
    }
}