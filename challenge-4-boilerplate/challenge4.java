import java.util.Scanner;
class challenge4 
{
   public static float celciusTofahrenheit(float celcius)
   {
       float fahrenheit=(celcius*9/5)+32;
       return fahrenheit;
   }
   
        public static void main(String[]args)
        {
            Scanner scan = new Scanner(System.in);
             char a;
             float celcius;
             challenge4 call =new challenge4();



             do{
                 System.out.println("Enter the temperature in Degree celcius");
                 celcius=scan.nextInt();
                 float fahrenheit;
                 fahrenheit=call.celciusTofahrenheit(celcius);
                System.out.println("Temperature(Celsius)= " + celcius +"       Temperature(Fahrenheit)= " +  fahrenheit);
                System.out.println("Do you wish to continue(y/n)?");
                a = scan.next().charAt(0);
      
                }
             while(a=='y'||a=='Y');
        }
}