import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge40
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the 15 Route information");
        Scanner sc = new Scanner(System.in);
        ArrayList <String> routes = new ArrayList<String>();
        for (int i = 0; i < 15; i++) 
        {
            routes.add(sc.nextLine());    
        }     
        System.out.println("SNo\tFrom\tTo\tDistance(kms)\tTravel_Time\tTypical AirFare");
        String []words = new String[5];
        for (int i = 0; i < 15; i++) 
        {
            int k=0;
            words = routes.get(i).split(",");
            System.out.println((i+1)+"\t"+words[k]+"\t"+words[k+1]+"\t"+words[k+2]+"\t"+words[k+3]+"\t"+words[k+4]);
            System.out.println();
        }
        String from , to;
        System.out.println("Enter the Source City");
        from = sc.nextLine();
        showDirectFlights(routes , from);
        System.out.println("Enter Source and Destination for direct/connected flight");
        from=sc.next();
        System.out.println("Enter the Destination City");
        to = sc.next();
        showAllConnections(routes, from, to);
    }

    private static String[] showDirectFlights(ArrayList<String> routes, String from) 
    {
        String []line = new String[routes.size()];
        int temp1=0 , temp2 =0;
        String []city1 = new String[routes.size()];
        String []city2 = new String[routes.size()];

        for (int i = 0; i < 15; i++) 
        {
            int k=0;
            line= routes.get(i).split(","); 
            if(line[k].equals(from))
            { temp1++; }   
        }
        System.out.println("SNo\t\tFrom\t\tTo\t\tDistance(kms)\tTravel_Time\tTypical AirFare");
        System.out.println();

        for (int i = 0; i < 15; i++) 
        {
            int l =0;
            city1 = routes.get(i).split(",");
            if(city1[l].equals(from))
            {
                city2[temp2] = city1[l+1];
                temp2++;
            }    
        }
        Arrays.sort(city2);

        for (int i = 0; i < city2.length; i++) 
        {
            for (int j = 0; j < 15; j++) 
            {
                city1 = routes.get(i).split(","); 
                if(city2[i].equals(city1[1]) && from.equals(city1[0]))
                {
                    System.out.println((i+1)+"\t"+city1[0]+"\t"+city2[i]+"\t"+city1[2]+"\t"+city1[3]+"t"+city1[4]);
                }  
            }    
        }
        return city1;
    }

    private static void showAllConnections(ArrayList<String> routes, String from, String to) 
    {
        String []fly1 = new String[routes.size()];
        String []fly2 = new String[routes.size()];
        String []fly3 = new String[routes.size()];
        String []source = new String[routes.size()];
        String []destination = new String[routes.size()];
        int x=0 , y=0 , z=0;
        System.out.println("SNo\t\tFrom\t\tTo\tDistance(kms)\tTravel_Time\tTypical AirFare");

        for (int i = 0; i < routes.size(); i++) 
        {
            fly1 = routes.get(i).split(",");
            if((fly1[0].equals(from)) && fly1[1].equals(to) )
            {
                System.out.print((z+1)+"\t\t"+fly1[0]+"\t\t"+fly1[1]+"\t\t"+fly1[2]+"\t"+fly1[3]+"\t"+fly1[4]);
                System.out.println();
                z++;
            }
            if(fly1[0].equals(from))
            {
                source[x]=fly1[1];
                x++;
            }
            if(fly1[1].equals(to))
            {
                destination[y] = fly1[0];
                y++;
            }
        }

        for (int i = 0; i < source.length; i++) 
        {
            fly1 = routes.get(i).split(",");
            if(from.equals(fly1[0]))
            {
                for (int j = 0; j < source.length; j++) 
                {
                    if(fly1[1].equals(source[j]))
                    {
                        for (int j2 = 0; j2 < routes.size(); j2++) 
                        {
                            fly2 = routes.get(j2).split(",");
                            for (int k = 0; k < 5; k++) 
                            {
                                fly1[k] = fly1[k].trim();
                                fly2[k] = fly2[k].trim();
                            }    
                            if(fly1[1].equals(fly2[0]) && fly2[1].equals(to))
                            {
                                System.out.print((z+1)+"\t\t"+fly1[0]+"\t\t"+fly1[1]+"\t\t"+fly1[2]+"\t"+fly1[3]+"\t"+fly1[4]);
                                System.out.println();
                                z++;
                                System.out.print(" \t\t"+fly2[0]+"\t\t"+fly2[1]+"\t\t"+fly2[2]+"\t"+fly2[3]+"\t"+fly1[4]);
                                int a=Integer.parseInt(fly1[2]) , b = Integer.parseInt(fly2[2]);
                                int distance = a+b;
                                int flag1 =0, flag2 =0;
                                String var = "IND";
                                final float GBP=94.5f , EUR = 85.37f , USD = 74.3f;
                                String str1 = fly1[4].substring(0, 3) , str2 = fly2[4].substring(0, 3);
                                int cost1 = Integer.parseInt(fly1[4].substring(3, fly1[4].length())) , cost2 = Integer.parseInt(fly2[4].substring(3, fly2[4].length())) ;
                                int s1 = cost1 , s2 = cost2 , s3;

                                if(!(fly1[4].substring(0, 3)).equals(var))
                                {
                                    float r = 0f;
                                    if(str1.equals("GBP"))
                                    {
                                        r = GBP*cost1;
                                    }
                                    else if(str1.equals("EUR"))
                                    {
                                        r=EUR*cost1;
                                    }
                                    else if(str1.equals("USD"))
                                    {
                                        r=USD*cost1;
                                    }
                                    flag1 = (int) r;
                                    s1 = (int) flag1+cost1;
                                }
                                if(!(fly2[4].substring(0, 3).equals(var)))
                                {
                                    float r = 0f;
                                    if(str2.equals("GBP"))
                                    {
                                        r = GBP*cost1;
                                    }
                                    else if(str2.equals("EUR"))
                                    {
                                        r=EUR*cost1;
                                    }
                                    else if(str2.equals("USD"))
                                    {
                                        r=USD*cost1;
                                    }
                                    flag2 = (int) r;
                                    s2 = (int) flag2+cost2;
                                }
                                s3 = s1+s2;
                                String []line1 = new String[2];
                                line1 = fly1[3].split(":");
                                line1[0] = line1[0].trim();
                                line1[1] = line1[1].trim();
                                String []line2 = new String[2];
                                line2 = fly2[3].split(":");
                                line2[0] = line1[0].trim();
                                line2[1] = line1[1].trim();
                                int h , m;
                                int h1 = Integer.parseInt(line1[0]) , m1 = Integer.parseInt(line1[1]) , h2 = Integer.parseInt(line2[0]) , m2 = Integer.parseInt(line2[1]);
                                h=h1+h2;
                                m = m1+m2;
                                if(m>=60)
                                {
                                    if(m==60)
                                    {
                                        m=00;
                                        h++;
                                    }
                                    else
                                    {
                                        int t = m%60;
                                        m=t;
                                        h++;
                                    }
                                }
                                System.out.print(" \t\t\tFinal"+distance+"\t\t"+h+":"+m+"  INR"+s3);
                                System.out.println();
                            }
                        }
                    }
                }
            }    
        }
    }
    
}