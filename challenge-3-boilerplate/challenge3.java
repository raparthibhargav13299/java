import java.util.Scanner;

public class challenge3
 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a;
        float ct,ft;
        do {
            System.out.println("Enter the temperature in Degree Celsius:");
            ct = scan.nextInt();
            ft = (ct * 9/ 5) + 32;
            System.out.println("Temperature(Celsius)= " +ct+"    "+"Temperature(Fahrenheit)= "+ ft );
            System.out.println("Do you wish to continue(y/n)?");
            a = scan.next();
        } while ((a=="Y"||a=="y"));
    }
}