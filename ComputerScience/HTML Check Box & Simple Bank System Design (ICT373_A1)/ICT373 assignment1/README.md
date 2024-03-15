## Question1


#### A brief description of a program
The program creates forms that use HTML and JavaScript to obtain user input, including usernames, phone numbers, birth dates, and favorite hobbies (web surfing, sports, games, community services, naps, reading, or meditation). When a user clicks the Submit button on a form, the field value of the form is sent to the Web server.

<br><br><br>

#### a description of your solution approach including structured design/pseudo-code for the JavaScript-specific code
The Html form is used to import user details and connection servers using the "Get" method. In this program, validation constraints are important to prevent empty data from being sent to the server. This is done with the JavaScript feature. Validation has two parts: batch validation and real-time validation. Real-time validation runs as soon as the user leaves the text box. Verify that the selected text box is null. If null, you are prompted for details. The cursor focuses on the text box so that the user can enter data. The isNotEmpty JavaScript function calls the function when the user leaves the text box by displaying the keyword in blue in each text box.



## Question2


#### Title

Title: ICT373 Assignment1 Question2

Author: Lee Jihu

Files names: AssociateCustomer, BankAccount, Client, CreditCard, Customer, Magazine, MagazineService, Main, PayingCustomer, PaymentMethod, Supplement

Project name: ICT373 Assignment1

Purpose: Design, and implement in Java, a set of classes for use in a program to manage an online weekly personalized magazine service.


<br><br><br>
#### Requirements/Specification
The system has a list of names, email addresses and supplemental materials of interest to the customer. Payment customers have a list of payment methods and related customers they also pay for. Affiliate customers are customers who are paid subscription fees by specific paid customers. The payment method may be a designated credit card or a debit from a designated bank account. Supplements have names and weekly costs. The magazine also has weekly costs for major parts. Every week, each customer sees a magazine and receives an email saying they are ready to list the supplements they are currently subscribed to. Each month, each paying customer receives an email telling them how much is charged to the card or account, and the cost is itemized as a supplement for them and their affiliated customers.


#### User Guide 
Eclipse was used to set the program. At the start of Eclipse, the user selects a folder to launch, which enters the location of the downloaded ICT373 Assignment1 file, clicks the Q2 file inside the file, clicks select folder, and presses launch, and the q2 file appears in Eclipse's workspace. Compile and execute the file using the Run button at the top of the Eclipse.


#### Structure/Design
The program consists of Associate Customer, BankAccount, CreditCard, Customer, Magazine, MagazineServoce, PaymentCustomer, PaymentMethod, Supplement, Client, and Main.
The AssociateCustomer class and the PayingCustomer class are the child classes of the Customer class, and the AssociateCustomer class and PayingCustomer class use the 'extends' command to use attributes and methods of the parent class, Customer class.
Similarly, the BankAccount class and the CreditCard class are the child classes of the PaymentMethod class, and the BankAccount class and the CreditCard class use the 'extends' command to use attributes and methods of the parent class, PaymentMethod class.
The reason why I use this inheritance method is that some classes share the same attributes. Inheritance was used to avoid using the same methods and attributes across classes.
