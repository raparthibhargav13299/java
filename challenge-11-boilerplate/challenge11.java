import java.util.Scanner;
class challenge11
{
    public static void main(String[]args)
    {
        int i,no,j=0 ,highest=0;
        float amaths=0,ascience=0,aenglish=0,alanguage=0,asocial=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no of students");
        no=scan.nextInt();
        int[] rollno = new int[no];
        String[] studentname = new String[no];
        int[] maths = new int[no];
        int[] science = new int[no];
        int[] eng = new int[no];
        int[] lang = new int[no]; 
        int[] social = new int[no];
        int[] total = new int[no];
        float[] avg = new float[no];

        for(i=0;i<no;i++)  {
        System.out.println("enter roll number ");
        rollno[i] = scan.nextInt();
        System.out.println("enter name");
        studentname[i] = scan.next();
        System.out.println("enter maths marks");
        maths[i] = scan.nextInt();
        System.out.println("enter science marks");
        science[i]=scan.nextInt();
        System.out.println("enter english marks");
        eng[i] = scan.nextInt();
        System.out.println("enter language marks");
        lang[i] = scan.nextInt();
        System.out.println("enter social marks");
        social[i] = scan.nextInt();     
        total[i] = maths[i]+science[i]+eng[i]+lang[i]+social[i];
        avg[i] = total[i]/5;
        System.out.println("total marks is"+"  "+total[i]);
        System.out.println("avg marks is"+"  "+avg[i]);
        amaths=amaths+maths[i];
        ascience=ascience+science[i];
        aenglish=aenglish+eng[i];
        alanguage=alanguage+lang[i];
        asocial=asocial+social[i];
          if(highest < total[i])
            {
                highest = total[i];
                i=j;
           
            }
        }
        System.out.println("the top scorer is"+"  "+studentname[j]+ "roll no. is"+"  "+rollno[j]);
        amaths = amaths/no;
         asocial = asocial/no;
         aenglish = aenglish/no;
         alanguage = alanguage/no;
         ascience  =ascience/no;
    } 
}