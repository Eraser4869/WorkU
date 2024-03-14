package assignment2;

public class research extends Student
{

    private int proposal;
    private int presentation;
    private int finalScore;
    private double overAll;
    private String finGrade;
    
	public Adult(String StudTitle, String FirstName, String LastName,long studID) {
		super(StudTitle,FirstName,LastName,studID,"RS");
	}
	
	//overAll = proposal*0.3 + presentation*0.2 + finalScore*0.5;
}
