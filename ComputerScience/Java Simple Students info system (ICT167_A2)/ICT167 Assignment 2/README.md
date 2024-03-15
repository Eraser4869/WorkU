### Requirement:

<br>

Write a Java class called Student which can be used to represent the details of a Student together with some associated operations. The Student class will have the following information:

 (a) Title of the student (eg, Mr, Miss, Ms, Mrs etc)
 
 (b) A first name (given name)
 
 (c) A last name (family name/surname)
 
 
 (d) Student number (ID) – an integer number (of type long)
 
 (e) A date of birth (in day/month/year format – three integers) - (Do NOT use the Date class from JAVA)
 
 (f) There are three assignments, each marked out of a maximum of 100 marks and equally weighted. The marks for each assignment are recorded separately.
 
 (g) There is weekly practical work. The marks for this component are recorded as a total mark obtained (out of a maximum of 20 marks) for all practical work demonstrated during the semester.
 
 (h) There is one final examination that is marked out of a maximum of 100 marks and recorded separately.
 
 (i) An overall mark (to be calculated within the program)
 
 (j) A final grade, which is a string (to be calculated within the program)
- The student class will have at least the following constructors and methods:
- (i) two constructors - one without any parameters (the default constructor), and one with parameters to give initial values to instance variables.
- (ii) a reasonable number of set and get methods.
- (iii) input and output methods.
- (iv) methods to compute the final overall mark and the final grade. These two methods will be void methods that set the appropriate instance variables. Remember one method can call another method. If you prefer, you can define a single method that sets both the overall mark and the final string grade, but if you do this, use a helper method.
- (v) an equals method which compares two student objects and returns true if they have the same student names, the same date of birth and the same student number, otherwise it returns false.

<br>

### User Guide:

Open zip file named Assignment2ICT167 -> Open with netbeans named Client and Student-> Click Client and run the program.

<br>

### Structure:

The program is supposed to execute the requirements in the questionnaire, depending on the menu entered. All of the menu's execution programs are covered by the client class, and the data required to run this program is covered by the Student class. Also, the Student class requires different applications for each student type, which is treated as a separate class using the Super class. The menu is repeated until the user enters 1 (quit).
