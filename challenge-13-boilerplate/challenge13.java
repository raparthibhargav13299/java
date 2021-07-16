import java.util.Arrays;
import java.util.Scanner;
class challenge13
{
   

    public static void main(String[] args)
    {
        int i,no;
       
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
        char[]grade=new char[no];
       

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
        if(avg[i]>=95)
        {
            grade[i]='A';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is A "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
        if(avg[i]>=80 &&avg[i]<90)
        {
            grade[i]='B';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is B "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
        if(avg[i]>=70 &&avg[i]<80)
        { 
            grade[i]='C';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is C "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
        if(avg[i]>=60 &&avg[i]<70)
        {
            grade[i]='D';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is D "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
        if(avg[i]>=50 &&avg[i]<60)
        {
            grade[i]='E';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is E "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
        if(avg[i]<50)
        {
            grade[i]='F';
            System.out.println("grade achieved by"+"  "+studentname[i]+"  "+"of roll no"+" "+rollno[i]+" "+"is F "+"total is"+" "+total[i]+" "+"average is "+" "+avg[i]);
        }
    } System.out.println("\n*****Score card in Asending Grade****");
    for( i=0; i<no; i++)
    {
     Arrays.sort(grade);
        System.out.println("Name: "+studentname[i]+"\t"+"Roll NO: "+rollno[i]+"\t"+"Grade: "+grade[i]);
    }
}
}



