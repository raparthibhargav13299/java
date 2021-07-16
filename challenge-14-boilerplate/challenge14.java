import java.util.Scanner;
class challenge14
{
    public static void main(String[]args)
    {
        int number,i,j;
        int[] rollno;
        float[] math,social,english,lan,science,avg,total;
        String[] name;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of students");
        number=scan.nextInt();
        total=new float[number];
        avg=new float[number];
        rollno=new int[number];
        math=new float[number];
        social=new float[number];
        english=new float[number];
        lan=new float[number];
        science=new float[number];
        name=new String[number];
        for(i=0;i<number;i++)
        {
            System.out.println("Enter the name");
            name[i]=scan.next();
            System.out.println("Enter the rolln.o");
            rollno[i]=scan.nextInt();
            System.out.println("Enter the marks scoredin math");
            math[i]=scan.nextFloat();
            System.out.println("Enter the marks scored in social");
            social[i]=scan.nextFloat();
            System.out.println("Enter the marks scored  in english");
            english[i]=scan.nextFloat();
            System.out.println("Enter the marks scored  in language");
            lan[i]=scan.nextFloat();
            System.out.println("Enter the marks scored in science");
            science[i]=scan.nextFloat();
            total[i]=math[i]+social[i]+english[i]+lan[i]+science[i];
            avg[i]=total[i]/5;
            System.out.println(avg[i]);
        }
        System.out.println("Representing the average of student using histogram using asterisk symbol");
        for(i=9;i>=1;i--)
        {
            for(j=0;j<number;j++)
            {
                if(avg[j]>=i*10)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
        for(i=1;i<=number;i++)
        {
            System.out.print(i+"\t");
        }
    }
}

