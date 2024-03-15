### Requirements/Specification

- Change class
  > In this class, the program will get the coin change amount and name of the owner of the coin.
  > - getChange
  >   In this method, the program will calculate and print the number of coins following the denominations (50, 20, 10, 5) of it.


- Client class
data
In this method, the program will store the values of the names and coins which are prompt by user to array.
menu1
In this method, the program will ask the user to enter a name of the coin owner. Then search the name in the data and print the coin change amounts using the getChange method. If there is no name in the data, it will print an error message.
menu2
In this method, the program will print the name who has the largest amount of coins and the coin change amounts using the getChange method.
menu3
In this method, the program will print the name who has the smallest amount of coins and the coin change amounts using the getChange method.
menu4
In this method, the program will count the number of coins of all people in the data. And print the total number of coins.
main
In this method, the program will print the list of menus and prompt the menu number which user entered. The program will repeat this until user enters 5 (Exit).

User Guide
Enter 10 names and coin amounts.
The program will ask the user to select a menu. Enter an integer only.
Except menu1, the program dose not need anything from user.
In menu1, enter a name which is in the data. If not, it will print ‘NOT FOUND’.
The program will automatically repeat until user enters 5. Enter 5 to stop the program.
 

Structure/Design/Algorithm
Structure
I add an instance variable ‘changeArray’ to store the values in it and can be accessed from methods when those needs data.
Class diagram








Description
Change class only has two instance variables and get change method which is the main functional part of the program. All extra programs like storing data or selecting menu is in the client class.




Limitations
There is a certain problem in the data (object, input). It automatically converts every value of the whole array to the last input. I could not figure out what to do in the data. The other codes were created assuming that the data was correct and has no error.
The program does not accept the input which has different type from the requiring.
