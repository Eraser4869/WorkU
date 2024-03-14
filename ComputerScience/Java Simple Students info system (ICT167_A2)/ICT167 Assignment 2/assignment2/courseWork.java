package assignment2;

public class courseWork extends Student
{
	private int scoreAssign1;
    private int scoreAssign2;
    private int scoreAssign3;
    private int pracScore;
    private int finalScore;
    private double overAll;
    private String finGrade;
	
	public Child(String StudTitle, String FirstName, String LastName,long studID) 
	{
		super(StudTitle,FirstName,LastName,studID,"CW");
	}
	
	 //overAll = scoreAssign1*0.15 + scoreAssign2*0.15 + scoreAssign3*0.15 + pracScore + finalScore*0.35;
	 
}
