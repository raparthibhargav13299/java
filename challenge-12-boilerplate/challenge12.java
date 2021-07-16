import java.util.Scanner;
class challenge12
{
    public static void main(String[]args)
    {
        int number,i,j=0,a=0;
        int[] roll;
        float[] math,social,english,lan,science;
        String[] names;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of students");
        number=scan.nextInt();
        roll=new int[number];
        math=new float[number];
        social=new float[number];
        english=new float[number];
        lan=new float[number];
        science=new float[number];
        names=new String[number];
        for(i=0;i<number;i++)
        {
            System.out.println("Enter the name");
            names[i]=scan.next();
            System.out.println("Enter the rolln.o");
            roll[i]=scan.nextInt();
            System.out.println("Enter the marks scored  in math");
            math[i]=scan.nextFloat();
            System.out.println("Enter the marks scored   in social");
            social[i]=scan.nextFloat();
            System.out.println("Enter the marks scored   in english");
            english[i]=scan.nextFloat();
            System.out.println("Enter the marks scored  in language");
            lan[i]=scan.nextFloat();
            System.out.println("Enter the marks scored  in science");
            science[i]=scan.nextFloat();
        }
        for(i=0;i<number;i++)
        {
            if(math[i]>=35)
            {
                if(social[i]>=35)
                {
                    if(english[i]>=35)
                    {
                        if(lan[i]>=35)
                        {
                            if(science[i]>35)
                            {
                                j++;
                                System.out.println(j+" students have cleared all the exams");
                                System.out.println("Name of the student\tRollno.");
                                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
                            }
                        }
                    }
                }
            }
        }
    
        a=number-j;
        System.out.println(a+"students need to mandatorily repeat the examination");
        for(i=0;i<number;i++)
        {
            if(math[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(social[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(english[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(lan[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
            else if(science[i]<35)
            {
                System.out.println("Name of the student\tRollno.");
                System.out.println("\t"+names[i]+"\t\t"+roll[i]);
            }
        }
    }
}