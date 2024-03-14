package assignment2;

import java.util.Scanner;
public class Client 
{
    public static Scanner read = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        studentInfo();
        menuSelect();   
    }
    
    public static void menuSelect()
    {
        
        boolean equalState = false;
        boolean key = false;
        while(!key)
        {
            int menu;
            System.out.println("-------MENU------");
            System.out.println("Select Menu You want to use");
            if(!equalState)
            {
                System.out.println("Add the data first");
            }
            System.out.println("1.Quit");
            System.out.println("2.Add all information about a student");
            System.out.println("3.Output from arraylist the details");
            System.out.println("4.Compute and output average overall mark");
            System.out.println("5.Determine and dispay how many students obtained an overall mark above average");
            System.out.println("6.Given a student ID, view student details");
            System.out.println("7.Given student name, view student details");
            System.out.println("8.Sort the array of the students objects into ascending order");
            System.out.println("9.print the sorted results through CSV file.");
            
            System.out.println("Select the menu: ");
            menu = read.nextInt();
            
            if(menu<12)
            {
                if(menu==1)
                {
                    key = true;
                    System.out.println("Thanks for using");
                }
                else if(menu ==2)
                {
                    menu2();
                    equalState = true;
                }
                if((menu==3) &&(equalState))
                {
                    menu3();
                }
                else if((menu==4) &&(equalState))
                {
                    menu4();
                }
                else if((menu==5) &&(equalState))
                {
                    menu5();
                }
                else if((menu==6) &&(equalState))
                {
                    menu6();
                }
                else if((menu==7) &&(equalState))
                {
                    menu7();
                }
                else if((menu==8) &&(equalState))
                {
                    menu8();
                }
                else if((menu==9) &&(equalState))
                {
                    menu9();
                }
            }
            else
            {
            	System.out.println("Invalid keyword");
            }
        }
    }
    
    public static Student [] StudentPortfo = new Student[10];
    public static int statusinfo =0;
    public static int count =10;
    
    
    public static void studentInfo()
    {
        System.out.println("Student Name: Jihu Lee");
        System.out.println("Student Number: 34061648");
        System.out.println("Mode of Enrollment: ICT167");
        System.out.println("Tutor Name: Aaro yeo ");
        System.out.println("Tutorial Attendance: Thursday 16:15PM - 18:15PM");
    }

    
    public static void menu2()
    {
    	StudentPortfo [statusinfo]= new Student();
        StudentPortfo [statusinfo].initiateDetailCWS();
        count--;
        for (int i=0; i<statusinfo; i++)
        {
            if(StudentPortfo[statusinfo].equalState(StudentPortfo[i]))
            {
                while(StudentPortfo[statusinfo].equalState(StudentPortfo[i]))
                {
                    System.out.println("Data has been made already, Please try again");
                    StudentPortfo[statusinfo].initiateDetailCWS();
                }
            }
        }

        
        System.out.println("----------------------Successful-----------------");
        
        if(count==0)
        {
            System.out.println("----------------End of storage-------------");
        }
        else
        {
            System.out.println(count+" more place has left for adding");
        }
        statusinfo++;
    }
    
    public static void menu3()
    {
        for (int i=0; i<statusinfo; i++)
        {
            System.out.println("Current Student data "+(i+1));
            System.out.println("--------------------------");
            StudentPortfo[i].printDetail();
            System.out.println("---------------------------");
        }
    }
    
    public static void menu4()
    {
        double addup =0;
        double aver ;
        for(int i=0; i<statusinfo; i++)
        {
            addup = addup + StudentPortfo[i].readoverAll();
        }
        aver = addup/statusinfo;
        System.out.println("The average of student array is : "+aver);
    }
    
    public static void menu5()
    {
        double addup =0;
        double aver;
        int high=0,low=0;
        for(int i=0; i<statusinfo; i++)
        {
            addup = addup + StudentPortfo[i].readoverAll();
        }
        aver = addup/statusinfo;
        for (int i=0; i<statusinfo; i++)
        {
            if(StudentPortfo[i].readoverAll()>aver)
            {
                high++;
            }
            else if(StudentPortfo[i].readoverAll()<aver)
            {
                low++;
            }
            
        }
        System.out.println("Students that has higher scores than average : "+high);
        System.out.println("Students that has lower scores than average : "+low);  
    }
    
    public static void menu6()
    {
        boolean found = false;
        int id;
        System.out.println("Enter the student ID");
        id = read.nextInt();
        for(int i=0; i<statusinfo; i++)
        {
            if(StudentPortfo[i].readstudID()==id)
            {
                StudentPortfo[i].printDetail();
                found =true;
            }
        }
        if(!found)
        {
            System.out.println("-----------No Data-----------");
        }
        
    }
    public static void menu7()
    {
        boolean found = false;
        String LASTNAME,FIRSTNAME;
        System.out.println("Enter First name of Student");
        FIRSTNAME = read.next();
        System.out.println("Enter Last name of Student");
        LASTNAME = read.next();
        for(int i=0; i<statusinfo; i++)
        {
            if((StudentPortfo[i].readfirName().equalsIgnoreCase(FIRSTNAME)) &&(StudentPortfo[i].readlasName().equalsIgnoreCase(LASTNAME)))
            {
                StudentPortfo[i].printDetail();
                found = true;
            }
            
        }
        if(!found)
        {
            System.out.println("------------No Data ------------");
        }
        
    }
    
    public static void menu8()
    {
        Student TEMPORARY = new Student();
        for (int i=1; i<statusinfo; i++)
        {
            for (int j=0; j<statusinfo-1; j++)
            {
                if(StudentPortfo[j].readstudID() > StudentPortfo[j+1].readstudID())
                {
                TEMPORARY = StudentPortfo[j];
                StudentPortfo [j]= StudentPortfo[j+1];
                StudentPortfo [j+1] = TEMPORARY;
                }
            }
        }
        for (int i=0; i<statusinfo; i++)
        {
            StudentPortfo[i].printDetail();
            System.out.println("-------------------");
        }
    }
    
    public static void menu9()
    {
    	System.out.println("create CSV");
    }
  
}
