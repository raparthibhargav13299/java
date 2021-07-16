import java.util.Scanner;
class challenge24
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of students in class: ");
    int n=sc.nextInt();
    String name[]=new String[n];
    int roll[]=new int[n];
    float math[]=new float[n];
    float english[]=new float[n];
    float science[]=new float[n];
    float lan[]=new float[n];
    float social[]=new float[n];
    float total[]=new float[n];
    char grade[]=new char[n];
    float avg[]=new float[n];
    
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter name of the student: ");
        name[i]=sc.next();
        System.out.println("Enter roll no of student: ");
        roll[i]=sc.nextInt();
        System.out.println("Enter marks of maths :");
        math[i]=sc.nextFloat();
        System.out.println("Enter marks of english :");
        english[i]=sc.nextFloat();
        System.out.println("Enter marks of science :");
        science[i]=sc.nextFloat();
        System.out.println("Enter marks of language :");
        lan[i]=sc.nextFloat();
        System.out.println("Enter marks of social studies :");
        social[i]=sc.nextFloat();
        Calculator.totalmarks(n,name,roll,math,english,science,lan,social,total); 



    } 
    Calculator.totalmarks(n,name,roll,math,english,science,lan,social,total); 
    Calculator.topscorer(n,name,roll,total);
    Calculator.average(n,roll,name,total,avg);
    Calculator.passstudentlist(n,name,roll,math,english,science,lan,social);
    Calculator.failstudentlist(n,name,roll,math,english,science,lan,social);
    Calculator.scorecard(n,name,roll,grade,total,avg,math,english,science,lan,social);
    Calculator.his(n,avg);
    
    }
}
     class Calculator
    {
       

        public static float totalmarks(int n,String name[],int roll[],float math[],float english[],float science[],float lan[],float social[],float total[] )
        {
            System.out.println("\n\t\t\t\t***************TOTAL MARKS****************\n");
            for(int i=0;i<n;i++)
            {
                total[i]=math[i]+english[i]+science[i]+lan[i]+social[i];
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("Name of the student : "+name[i]+"\tRoll_no : "+roll[i]+"\tTotal Marks obtained: "+total[i]);
            }
            return 0.f;
        }
        public static float topscorer(int n,String name[],int roll[],float total[])
    {
        System.out.println("\n\t\t\t\t***************TOP SCORER****************\n");
        float topper=0.f;
        for(int i=0;i<n;i++)
        {
            if(total[i]>topper)
            {
                topper=total[i];
            }
        }
       for(int i=0;i<n;i++)
        if(topper==total[i]){
            System.out.println("\nTopper of class is "+name[i]+"  whose roll number is "+roll[i]);
        }
        return 0.f;
    }
    public static float average(int n,int roll[],String name[],float total[],float avg[])
    {
        System.out.println("\n\t\t\t\t***************AVERAGE MARKS****************\n");
        for(int i=0;i<n;i++)
        {
            avg[i]=total[i]/5.0f;    
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("Name: "+name[i]+"\troll number : "+roll[i]+"\t Average marks : "+avg[i]);
        }
        return 0;
    }
   
    public static void passstudentlist(int n,String name[],int roll[],float math[],float english[],float science[],float lan[],float social[])
    {
        int p=0,f=0;
        System.out.println("\n\t\t\t\t*************** NUMBER OF STUDENTS WHO PASSED THE EXAM ****************\n");
        for(int i=0;i<n;i++)
        {
            if((math[i]>=35)&&(english[i]>=35)&&(science[i]>=35)&&(lan[i]>=35)&&(social[i]>=35))
            {
                System.out.println("Name: "+name[i]+"\t ROLL NO : "+roll[i]+"\t Status: PASS");
                p++;
            }
        }
        System.out.println("Number of students who have cleared the examination  :"+p);
    }
            public static void failstudentlist(int n,String name[],int roll[],float math[],float english[],float science[],float lan[],float social[])
            {
                int p=0,f=0;
                System.out.println("\n\t\t\t\t*************** NUMBER OF STUDENTS WHO FAILED THE EXAM ****************\n");
                for(int i=0;i<n;i++)
              {
            if((math[i]<35)||(english[i]<35)||(science[i]<35)||(lan[i]<35)||(social[i]<35))
            {
                System.out.println("Name of student: "+name[i]+"\t ROLL NO : "+roll[i]+"\t status : FAIL");
            f++;
            }
        }
        
       
        System.out.println("Number of students who needs to mandatorily repeat the examination "+f);
        
    }
    public static void scorecard(int n,String name[],int roll[],char grade[],float total[],float avg[],float math[],float english[],float science[],float lan[],float social[])
    {
        System.out.println("\n\t\t\t\t************** SCORE CARD ****************\n");
        for(int i=0;i<n;i++)
    {
        if((avg[i]>=90) && (avg[i]<95))
        {
            grade[i]='A';
           
       
        }
        else if((avg[i]>=80) && (avg[i]<90))
        {
            grade[i]='B';
        }
        else if((avg[i]>=70) && (avg[i]<80))
        {
            grade[i]='C';
        }
        else if((avg[i]>=60) && (avg[i]<70))
        {
            grade[i]='D';
        }
        else if((avg[i]>=50) && (avg[i]<60))
        {
            grade[i]='E';
        }
        else 
        {
            grade[i]='F';
        }
    }
    for(int i=0;i<n;i++)
    {
        
        System.out.println("_____________________________________________________________________________________________________________");
        System.out.println("\nName of student: "+name[i]+"\nROLL NO : "+roll[i]+"\nGrade : "+grade[i]+"\n Maths: "+math[i]+"\tEnglish:"+english[i]+"\tScience: "+science[i]+"\tLanguage: "+lan[i]+"\tSocial studies :"+social[i]+"\nTOTAL_MARKS: "+total[i]+"\nAVERAGE: "+avg[i]);
        System.out.println("_____________________________________________________________________________________________________________");
    }
   }
   public static void his(int n,float avg[])
   {
    for(int i=9;i>=1;i--)
    {
        for(int j=0;j<n;j++)
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
    for(int i=1;i<=n;i++)
    {
        System.out.print(i+"\t");
    }
   }
}


    