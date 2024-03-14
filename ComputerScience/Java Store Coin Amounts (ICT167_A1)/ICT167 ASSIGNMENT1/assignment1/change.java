package assignment1;

public class change
{
	//50, 20, 10 and 5 cents
		public static String name;
		public static int coinChangeAmount;
		
		
		public change(String name, int coinChangeAmount) 
		{
			this.name = name;
			this.coinChangeAmount = coinChangeAmount;
		}
		
		
		public static String getName() {
			return name;
		}


		public static void setName(String name) {
			change.name = name;
		}


		public static int getCoinChangeAmount() {
			return coinChangeAmount;
		}


		public static void setCoinChangeAmount(int coinChangeAmount) {
			change.coinChangeAmount = coinChangeAmount;
		}

		public static void getChange(int CA)
		{
			int[] changeToReturn = new int[4];
			int[] coin = {50, 20, 10, 5};
			
			for(int i=0; i<coin.length; i++)
			{
				changeToReturn[i]=CA/coin[i];
				CA -= coin[i]*changeToReturn[i];
				
				if(changeToReturn[i]!=0) 
				{
					if (i==0)
					{
						System.out.println("50 cents: "+changeToReturn[i]);
					}
					else if (i==1) 
					{
						System.out.println("20 cents: "+changeToReturn[i]);
					}
					else if (i==2) 
					{
						System.out.println("10 cents: "+changeToReturn[i]);
					}
					else if (i==3) 
					{
						System.out.println("5 cents: "+changeToReturn[i]);
					}
				}
			}

		}
		
		
		

}
