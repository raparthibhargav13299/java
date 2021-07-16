import java.util.Scanner;
class speed
{
public static void main(String []args)
{
float distance, speed, time;
Scanner obj= new Scanner(System.in);
System.out.println("Enter distance");
distance=obj.nextInt();
System.out.println("Enter speed");
speed=obj.nextInt();
time=distance/speed;
System.out.println(time);
}
}

