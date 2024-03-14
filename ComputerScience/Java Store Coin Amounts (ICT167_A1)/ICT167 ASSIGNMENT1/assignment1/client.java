package assignment1;

import java.util.Scanner;

public class client 
{
	
	public static void StudentInfo() 
	{
		System.out.print("NAME: LEE JIHU \r\nSTUDENT NUMBER: CT0335241\r\n"
				+ "ENROLMENT: FTA ICT167\r\n"
				+ "TUTOR NAME: Aaron yeo\r\n"
				+ "Attendance day: Tursday 4:15 P.M.");
		System.out.println("\r\n=================================\r\n");
	}
	
	
	public static change[] changeArray = new change[10];
	
	/*There is a certain problem in the data(object,input). 
	 * it automatically converts every value of the whole array to the last input. 
	 * I coudln't figure out what to do in the data.
	 * The other codes were created assuming that the data was correct and has no error.
	*/
	
	public static void data() 
	{
		//purpose: storing the value changeArray.
	
		//store into array
		 
		
		change change0 = new change("John",5);
		changeArray[0] = change0;
		
		change change1 = new change("A",15);
		changeArray[1] = change1;

		change change2 = new change("B",25);
		changeArray[2] = change2;
		
		change change3 = new change("C",35);
		changeArray[3] = change3;
		
		change change4 = new change("D",45);
		changeArray[4] = change4;
		
		change change5 = new change("E",55);
		changeArray[5] = change5;
		
		change change6 = new change("F",65);
		changeArray[6] = change6;
		
		change change7 = new change("G",75);
		changeArray[7] = change7;

		change change8 = new change("H",85);
		changeArray[8] = change8;
		
		change change9 = new change("I",95);
		changeArray[9] = change9;
		
		
		/*
		 * //getting data from user.
		 
		Scanner kb = new Scanner(System.in);
		
		
		for (int i = 0; i < 10; i++) 
		
        {
            System.out.print("enter 10 records to test the program. Please enter the name of the person: ");
            String name = kb.next();
            System.out.print("Please enter the coin value of the person (range 5 to 95, multiple of 5): ");
            int coin = kb.nextInt();
            if ((coin % 5 == 0) && (coin <= 95) && (coin >= 5)) 
            {
                changeArray[i].name = name;
                changeArray[i].coinChangeAmount = coin;
            }
            else 
            {
                System.out.println("coin value must be in the range 5 to 95, and multiple of 5. ");
                i--;
            }
        }
		
		
		// if same name, add coin.
		for(int count=0; count<10; count++)
		{
			for(int i=0; i<10; i++) 
			{
				if (changeArray[count].name==changeArray[i].name) 
				{
					changeArray[count].coinChangeAmount += changeArray[i].coinChangeAmount;
				}
			}
			count++;
		}
		*/
		
	}
	
	
	public static void menu1() 
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.print("enter a name: ");
		String Customer = kb.nextLine();
		int n=0;
		boolean flag=false;
		
		for (int i=0;i<10;i++) 
		{
			if (Customer.equalsIgnoreCase(changeArray[i].name))
			{
				flag=true;
				n=i;	
			}
		}
		
		if(flag) 
		{
			System.out.println(Customer+" "+changeArray[n].coinChangeAmount+" cents.");
			change.getChange(changeArray[n].coinChangeAmount);
		}
		else
		{
			System.out.println("NAME: "+Customer+"\r\nNOT FOUND\r\n");
		}
		System.out.println("\r\n=================================\r\n");

	}
	
	
	public static void menu2()
	{
		
		int min=0;
		int n=0;
		
		for (int i=0;i<10;i++) 
		{
			if (i==0) 
			{
				min=changeArray[i].coinChangeAmount;
				n=i;
			}
			else 
			{
				if (min>changeArray[i].coinChangeAmount)
				{
					min=changeArray[i].coinChangeAmount;
					n=i;
				}
			}
		}
		System.out.println("THE SMALLEST AMOUNT \r\nNAME:"+changeArray[n].name);
		change.getChange(changeArray[n].coinChangeAmount);
		System.out.println("\r\n=================================\r\n");
		
	}
	
	public static void menu3() 
	{
		
		int max=0;
		int n=0;
		
		for (int i=0;i<10;i++) 
		{
			if (i==0) 
			{
				max=changeArray[i].coinChangeAmount;
				n=i;
			}
			else 
			{
				if (max<changeArray[i].coinChangeAmount) 
				{
					max=changeArray[i].coinChangeAmount;
					n=i;
				}
			}
		}
		System.out.println("THE LARGEST AMOUNT\r\nNAME:"+changeArray[n].name);
		change.getChange(changeArray[n].coinChangeAmount);
		System.out.println("\r\n=================================\r\n");
	}
	
	public static void menu4() 
	{
		
		int[] changeToReturn = new int[4];
		int[] coin = {50, 20, 10, 5};
		int count1=0, count2=0;
		
		for (int i0=0; i0<10; i0++) 
		{	
			for(int i=0; i<coin.length; i++)
			{
				changeToReturn[i]=changeArray[i].coinChangeAmount/coin[i];
				changeArray[i].coinChangeAmount -= coin[i]*changeToReturn[i];
				count1+=changeToReturn[i];
			}
			count2+=count1;
		}
		
		System.out.println("The total number of coins is "+ count2);
		System.out.println("\r\n=================================\r\n");
		
	}
	
	
	public static void main(String[] args)
	{
		StudentInfo();
		data();
		
		//menu
		Scanner kb = new Scanner(System.in);
		
		int menu=0;
		
		while(menu != 5) 
		{
		
			System.out.print(
				"1. Enter a name and display change to be given for each  denomination\r\n" + 
				"2. Find the name with the smallest amount and display change to be given for each denomination\r\n" + 
				"3. Find the name with the largest amount and display change to be\r\n" + 
				"given for each denomination\r\n" + 
				"4. Calculate and display the total number of coins for each\r\n" + 
				"denomination, and the sum of these totals\r\n" + 
				"5. Exit\r\n" +
				"Select a menu: ");
			menu = kb.nextInt();
			
			switch(menu) 
			{
			case 1:
				menu1();
				break;
				
			case 2:
				menu2();
				break;
				
			case 3:
				menu3();
				break;
				
			case 4:
				menu4();
				break;
				
			default:
				if (menu!=5) 
				{
					System.out.println("please enter a number between 1 to 5.");
				}
				System.out.println("\r\n=================================\r\n");
				break;

			}
			
		}
		
		System.out.print("END");
		
	}
}
