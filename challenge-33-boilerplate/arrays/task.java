import java.util.Scanner;
import java.util.Collections;
import java.util.Arrays;
public class task {
    public static void main(String[] args)
    {
        int number,j=0,i,a=0,d=0,e=0;
        int[] roll;
        float b=0,avgmath=0,avgsocial=0,avgenglish=0,avglan=0,avgscience=0;
        float[] avg,math,social,english,lan,science,total;
        String[] names;
        char[] avggrade;
        Character[] grade;
        Scanner o=new Scanner(System.in);
        task t=new task();
        System.out.println("Enter the number of students");
        number=o.nextInt();
        total=new float[number];
        avg=new float[number];
        avggrade=new char[number];
        grade=new Character[number];
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
            names[i]=o.next();
            System.out.println("Enter the rolln.o");
            roll[i]=o.nextInt();
            System.out.println("Enter the marks scored by "+names[i]+" in math");
            math[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in social");
            social[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in english");
            english[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in language");
            lan[i]=o.nextFloat();
            System.out.println("Enter the marks scored by "+names[i]+" in science");
            science[i]=o.nextFloat();
            total[i]=t.findtotal(math[i],social[i],english[i],lan[i],science[i]);
            avg[i]=total[i]/5;
            j=t.findtopper(total[i],i);
            avgmath+=math[i];
            avgsocial+=social[i];
            avgenglish+=english[i];
            avglan+=lan[i];
            avgscience+=science[i];
        }
        avgmath=t.avg(avgmath,number);
        avgsocial=t.avg(avgsocial,number);
        avgenglish=t.avg(avgenglish,number);
        avglan=t.avg(avglan,number);
        avgscience=t.avg(avgscience,number);
        System.out.println("The top scorer of the class is "+names[j]+" and rollno. is "+roll[j]);
        System.out.println("Names of students who cleared the exams");
        for(i=0;i<number;i++)
        {
            a=t.numbercleared(math[i],social[i],english[i],lan[i],science[i],i,names[i],roll[i]);
        }
        System.out.println(a+" students have cleared all the exams");
        d=number-a;
        System.out.println(d+" students need to mandatorily repeat the examination");
        for(i=0;i<number;i++)
        {
            t.numbernotcleared(math[i],social[i],english[i],lan[i],science[i],i,names[i],roll[i]);
        }
        for(i=0;i<number;i++)
        {
            avggrade[i]=t.gradefinder(avg[i],5,total[i],names[i]);
            grade[i]=avggrade[i];
        }
        t.gradesoter(grade);
        System.out.println("Enter the rolln.o to find");
        e=o.nextInt();
        t.rollno(names,roll,math,social,english,lan,science,total,avggrade,e,number);
        System.out.println("Representing the average of student using histogram using asterisk('*') symbol");
        t.graph(avg,number);
    }
        public Float findtotal(float a,float b,float c,float d,float e)
        {
            return a+b+c+d+e;
        }
        public int findtopper(float a,int c)
        {
            float b=0;
            int d=0;
            if(b<a)
            {
                b=a;
                d=c;
            }
            return d;
        }
        public float avg(float avg,int a)
        {
            return avg/a;
        }
        int k=0;
        public int numbercleared(float a,float b,float c,float d,float e,int i,String names,int roll)
        {
            if(a>=35)
            {
                if(b>=35)
                {
                    if(c>=35)
                    {
                        if(d>=35)
                        {
                            if(e>35)
                            {
                                k++;
                            }
                        }
                    }
                }
            }
            if(a>=35)
            {
                if(b>=35)
                {
                    if(c>=35)
                    {
                        if(d>=35)
                        {
                            if(e>35)
                            {
                                System.out.println("Name of the student "+names+",Rollno "+roll);
                            }
                        }
                    }
                }
            }
            return k;
        }
        public void numbernotcleared(float a,float b,float c,float d,float e,int i,String names,int roll)
        {
            if(a<35)
            {
                System.out.println("Name of the student "+names+",Rollno "+roll);
            }
            else if(b<35)
            {
                System.out.println("Name of the student "+names+",Rollno "+roll);
            }
            else if(c<35)
            {
                System.out.println("Name of the student "+names+",Rollno "+roll);
            }
            else if(d<35)
            {
                System.out.println("Name of the student "+names+",Rollno "+roll);
            }
            else if(e<35)
            {
                System.out.println("Name of the student "+names+",Rollno "+roll);
            }
        }
        public char gradefinder(float a,int b,float c,String d)
        {
            if(a>=90)
            {
                System.out.println("The grade obtained by "+d+" is A for total marks of "+c+" and average marks is "+a);
                return 'A';
            }
            else if(a>=80&&a<90)
            {
                System.out.println("The grade obtained by "+d+" is B for total marks of "+c+" and average marks is "+a);
                return 'B';
            }
            else if(a>=70&&a<80)
            {
                System.out.println("The grade obtained by "+d+" is C for total marks of "+c+" and average marks is "+a);
                return 'C';
            }
            else if(a>=60&&a<70)
            {
                System.out.println("The grade obtained by "+d+" is D for total marks of "+c+" and average marks is "+a);
                return 'D';
            }
            else if(a>=50&&a<60)
            {
                System.out.println("The grade obtained by "+d+" is E for total marks of "+c+" and average marks is "+a);
                return 'E';
            }
            else
            {
                System.out.println("The grade obtained by "+d+" is F for total marks of "+c+" and average marks is "+a);
                return 'F';
            }
        }
        public void gradesoter(Character[] a)
        {
            Arrays.sort(a,Collections.reverseOrder());
        }
        public void rollno(String[] names,int[] roll,float[] math,float[] social,float[] english,float[] lan,float[] science,float[] total,char[] avggrade,int a,int number)
        {
            int i;
            for(i=0;i<number;i++)
            {
            if(a==roll[i])
            {
            System.out.println("Name : "+names[i]);
            System.out.println("Rollno. : "+roll[i]);
            System.out.println("Marks obtained in math : "+math[i]);
            System.out.println("Marks obtained in social : "+social[i]);
            System.out.println("Marks obtained in english : "+english[i]);
            System.out.println("Marks obtained in language : "+lan[i]);
            System.out.println("Marks obtained in science : "+science[i]);
            System.out.println("Total marks obtained : "+total[i]);
            System.out.println("Grade obtained : "+avggrade[i]);
            }
            }
        }
        public void graph(float[] avg,int number)
        {
            int i,j;
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