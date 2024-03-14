package assignment2;
import java.util.Scanner;

public class Student 
{
    private String studentTitle;
    private String firName;
    private String lasName;
    private long studID;
    private int day;// in day/month/year format 
    private int month;
    private int year;
    private int scoreAssign1;
    private int scoreAssign2;
    private int scoreAssign3;
    private int pracScore;
    private int finalScore;
    private double overAll;
    private String finGrade;
    public static Scanner read=new Scanner(System.in);
    
    public int validAssignScore(int check)// this method is created for checking whether scores based on 100 is valid or not
    {
        while (check<0 || check>100)
        {
            System.out.println("Invalid Scores has been made");
            System.out.println("Please Enter again");
            check = read.nextInt();
        }
        return check;
        
    }
    
    public Student()
    {
        studentTitle = "Mr";
        firName = "LEE";
        lasName = "Jihu";
        studID = 34061648;
        day = 10;
        month = 9;
        year = 1999;
        scoreAssign1 = 72;
        scoreAssign2 = 75;
        pracScore = 15;
        finalScore = 74;
        overAll = 0;
        finGrade ="";
    }
    
    
    public Student(String newstudentTitle, String newfirName, String newlasName, long newstudID, int newday,int newmonth, int newyear, int newscoreAssign1, int newscoreAssign2, int newscoreAssign3, int newpracScore, int newfinalScore, double newoverAll, String newfinGrade)
    {
        studentTitle = newstudentTitle;
        firName= newfirName;
        lasName= newlasName;
        studID= newstudID;
        day = newday;
        month = newmonth;
        year = newyear;
        scoreAssign1 = newscoreAssign1;
        scoreAssign2 = newscoreAssign2;
        scoreAssign3 = newscoreAssign3;
        pracScore = newpracScore;
        finalScore = newfinalScore;
        overAll = newoverAll;
        finGrade = newfinGrade;  
    }
    
    public void checkFinalGrade()
    {
        if (overAll>=80)
        {
            finGrade = "HD";
        }
        else if (overAll>=70)
        {
            finGrade ="D";
        }
        else if (overAll>=60)
        {
            finGrade = "C";
        }
        else if (overAll>=50)
        {
            finGrade = "P";
        }
        else
        {
            finGrade = "F";
        }
        
    }
    public void setStuTitle (String newstudentTitle)
    {
        studentTitle = newstudentTitle;
    }
    public void setfirName (String newfirName)
    {
        firName = newfirName;
    }
    public void setlasName (String newlasName)
    {
        lasName = newlasName;
    }
    public void setstudID (long newstudID)
    {
        studID= newstudID;
    }
    public void setday(int newday)
    {
        day = newday;
    }
    public void setmonth(int newmonth)
    {
        month = newmonth;
    }
    public void setyear (int newyear)
    {
        year = newyear;
    }
    public void setscoreAssign1(int newscoreAssign1)
    {
        scoreAssign1 = newscoreAssign1;
    }
    public void setscoreAssign2(int newscoreAssign2)
    {
        scoreAssign2 = newscoreAssign2;
    }
    public void setpracScore(int newpracScore)
    {
        pracScore = newpracScore;
    }
    public void setfinalScore (int newfinalScore)
    {
        finalScore = newfinalScore;
    }
    private void setoverAll()
    {
        overAll = scoreAssign1*0.15 + scoreAssign2*0.15 + scoreAssign3*0.15 + pracScore + finalScore*0.35;
    }
    
    /*public void SetupAll(String newstudentTitle, String newfirName, String newlasName, long newstudID, int newday,int newmonth, int newyear, int newscoreAssign1, int newscoreAssign2, int newpracScore, int newfinalScore, double newoverAll, String newfinGrade)
    {
        studentTitle = newstudentTitle;
        firName= newfirName;
        lasName= newlasName;
        studID= newstudID;
        day = newday;
        month = newmonth;
        year = newyear;
        scoreAssign1 = newscoreAssign1;
        scoreAssign2 = newscoreAssign2;
        pracScore = newpracScore;
        finalScore = newfinalScore;
        overAll = newoverAll;
        finGrade = newfinGrade;   
    }
*/

    public void initiateDetailCWS()
    {   
        System.out.println("Enter the student's title (Mr/Mrs)");
        studentTitle = read.next();
        System.out.println("Enter the student's First Name");
        firName = read.next();
        System.out.println("Enter the student's Last Name");
        lasName = read.next();
        System.out.println("Enter the student's ID number");
        studID = read.nextLong();
        System.out.println("Enter the student birthdate (DAY)");
        day =read.nextInt();
        System.out.println("Enter the student bithdate (MONTH)");
        month = read.nextInt();
        System.out.println("Enter the student bithdate (YEAR)");
        year = read.nextInt();
        
        System.out.println("Enter the first assignment score");
        scoreAssign1 = read.nextInt();
        scoreAssign1 = validAssignScore(scoreAssign1);
        System.out.println("Enter the second assignment score");
        scoreAssign2 = read.nextInt();
        scoreAssign2 = validAssignScore(scoreAssign2);
        System.out.println("Enter the third assignment score");
        scoreAssign3 = read.nextInt();
        scoreAssign3 = validAssignScore(scoreAssign3);
        System.out.println("Enter the practical score");
        pracScore = read.nextInt();
        
        while(pracScore >20 || pracScore<0)
        {
            System.out.println("Invalid score has been made");
            System.out.println("Please type again");
            pracScore = read.nextInt();
        }
        
        System.out.println("Enter the final exam score");
        finalScore = read.nextInt();
        finalScore = validAssignScore(finalScore);
        setoverAll();
        checkFinalGrade();
    }
    
    public void printDetail()
    {
        System.out.println(studentTitle+","+lasName+" "+firName);
        System.out.println("Student ID : "+studID);
        System.out.println("BIRTHDATE : "+day+"-"+month+"-"+year);
        System.out.println("Overall Grade : "+overAll);
        System.out.println("Final Grade : "+finGrade);
    }
    
    public String printString()
    {
        return studentTitle+""+lasName+""+firName+""+studID+""+day+""+month+""+year+""+scoreAssign1+""+scoreAssign2+""+pracScore+""+finalScore+""+overAll+""+finGrade;
    }
    
    public boolean equalState(Student var)
    {
        if((var.lasName.equals(lasName))&&(var.firName.equals(firName))&&(var.day == day)&&(var.month == month)&&(var.year == year)&&(var.studID == studID))
        {
            return true;
        }
        else
        {
            return false;
        }

                
    }
    public String readstudentTitle()
    {
        return studentTitle;
    }
    public String readfirName()
    {
        return firName;
        
    }
    public String readlasName()
    {
        return lasName;
    }
    public long readstudID()
    {
        return studID;
    }
    public int readday()
    {
        return day;
    }
    public int readmonth()
    {
        return month;
    }
    public int readyear()
    {
        return year;
    }
    public int readscoreAssign1()
    {
        return scoreAssign1;
    }
    public int readscoreAssign2()
    {
        return scoreAssign2;
    }
    public int readscoreAssign3()
    {
        return scoreAssign3;
    }
    public int readpracScore()
    {
        return pracScore;
        
    }
    public int readfinalScore()
    {
        return finalScore;
    }
    public double readoverAll()
    {
        return overAll;
    }
    public String readfinGrade()
    {
        return finGrade;
    }
    public String nameFull()
    {
        return studentTitle+","+firName+" "+lasName;
    }
    
}