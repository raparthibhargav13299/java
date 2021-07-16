import java.util.Scanner;

class challenge25
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students in class: ");
        int n=sc.nextInt();
      
    
   person p=new person();
            
        
        String name[] = new String[n];
        float social[]=new float[n];
        float math[]=new float[n];
        float english[]=new float[n];
        float science[]=new float[n];
        float lan[]=new float[n];
        int roll[]=new int[n];
        float total[]=new float[n];
        float avg[]=new float[n];
        char grade[]=new char[n];

        for (int i = 0; i <n; i++) 
        {
         

   
        
            System.out.println("Enter name of the student: ");
          p.setName();
          name[i]=p.getName();
          System.out.println("Enter roll no of student: ");
          p.setRoll();
          roll[i]=p.getRoll();
          System.out.println("Enter marks of social studies :");
          p.setSocial();
          social[i]=p.getSocial();
          System.out.println("Enter marks of english :");
          p.setEnglish();
          english[i]=p.getEnglish();
          System.out.println("Enter marks of maths :");
          p.setMath();
          math[i]=p.getMath();
          System.out.println("Enter marks of language :");
          p.setLan();
          lan[i]=p.getLan();
          System.out.println("Enter marks of science :");
          p.setScience();
          science[i]=p.getScience();
        



          
          
         
        }
   
        Calculator.totalmarks(n,name,roll,math,english,science,lan,social,total); 
        Calculator.average(n,roll,name,total,avg);
        Calculator.passstudentlist(n,name,roll,math,english,science,lan,social);
        Calculator.failstudentlist(n,name,roll,math,english,science,lan,social);
        Calculator.scorecard(n,name,roll,grade,total,avg,math,english,science,lan,social);


    }
   
       
    }
    



             class person{
                private String name;
                private int roll;
                private float math, english, science, lan, social;
                Scanner scan=new Scanner(System.in);
                public String getName() {
                    return name;
                }

                public float getSocial() {
                    return social;
                }

                public void setSocial() {
                    this.social = scan.nextInt();
                }

                public float getLan() {
                    return lan;
                }

                public void setLan() {
                    this.lan = scan.nextInt();
                }

                public float getScience() {
                    return science;
                }

                public void setScience() {
                    this.science = scan.nextInt();
                }

                public float getEnglish() {
                    return english;
                }

                public void setEnglish() {
                    this.english = scan.nextInt();
                }

                public float getMath() {
                    return math;
                }

                public void setMath() {
                    this.math =scan.nextInt();
                }

            

              
                public int getRoll() {
                    return roll;
                }

                public void setRoll() {
                    this.roll = scan.nextInt();
                }

                public void setName() {
                    this.name = scan.next();
                    
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
    }




