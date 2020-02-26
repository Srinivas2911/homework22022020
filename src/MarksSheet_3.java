import java.util.Scanner;

public class MarksSheet_3 {

 /* 3. Write a java program to input student Name, roll No, and three subjects Math, Science
  and English marks (marks is between 0 to 100 and if it is out of range print error message
   “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
* If he is pass or fail on basis of percentage (pass>=35) and also give them grade >= 80 A+,
   >= 60 A, >= 50 B, >= 35 C And print Mark Sheet in following format
*/

    public static void main(String[] args) {  // main method

        MarksSheet_3 obj = new MarksSheet_3();
        obj.myMarks();
    }

    public void myMarks() {


        Scanner scan = new Scanner(System.in);     // scanner introduced
        System.out.println("Enter the student name     : ");   //  name String
        String name = scan.next();                             // user input for name

        System.out.println("Enter the roll number      : ");   // Roll number field
        String roll = scan.next();                             // user input for String "roll"
        // string used for characters or number

        System.out.println("Marks achieved in Maths    : ");   // Marks in Maths field
        int Maths = scan.nextInt();                            // user input | "int" used for numbers for marks
        if (Maths < 0 || Maths > 100) {                       // if statements for Maths
            System.out.println("Invalid input for Maths Marks   ");//if marks less than 10 or(||) more than 100
            System.out.println(" Marks should be between 0-100");
            // and print invalid for maths marks
        }

        System.out.println("Marks achieved in Science  : ");  // Marks in Science field
        int Science = scan.nextInt();                         // user input | int used for numbers for marks
        if (Science < 0 || Science > 100) {             // if statement for marks outside of 0 or 100
            System.out.println("Invalid input for Science Marks  "); // print invalid for Science marks
            System.out.println(" Marks should be between 0-100");
        }

        System.out.println("Marks achieved in English  : ");  // Marks for English field
        int Eng = scan.nextInt();                             // user input | int used for marks
        if (Eng < 0 || Eng > 100) {                       // if statement for English (<0 or (||) >100
            System.out.println("Invalid input for English Marks "); // print invalid for english marks
            System.out.println(" Marks should be between 0-100");
        }

        double full_Marks = 300;                              // double for full marks for 300, defined
        int total = Maths + Science + Eng;                    // int for total of the marks in subjects.
        double Percent;                                       // Percent used for percentage (double)
        Percent = (total / full_Marks * 100);                 // calc for Percent defined foe values.
        String grade;
        String result;

        if (Percent >= 80) {                              // if Percentage is 80 or more
            result = "Pass";                              // result string defined
            grade = "A+";                                 // grade string defined

        } else if (Percent >= 60 && Percent <= 79) {      // if Percentage is =60 to =79
            result = "Pass";                              // result defined
            grade = "A";                                  // grade defined

        } else if (Percent >= 50 && Percent <= 59) {      // if  else Percentage is =50 to =59
            result = "Pass";                              // result defined
            grade = "B";

        } else if (Percent >= 35 && Percent <= 49) {      // if Percentage is valued between =35 to =49
            result = "Pass";                              // result defined
            grade = "C";                                  // grade defined

        } else {                                         // for Percent less than 35
            result = "Fail";                             // result defined as fail
            grade = " ";                                 // no value for grade
        }

        System.out.println(" Printing the Marks Sheet "); // Print statement to Print Marks

        System.out.println(" ______________________________");    // Marks Sheet format println for
        System.out.println("|         Mark Sheet           |");   // Marks sheet string name format
        System.out.println("|______________________________|");   // line for Marks sheet format
        System.out.println("|    Name           : " + name + "      | "); // String "name" is called here.
        System.out.println("|    Roll No        : " + roll + "       |"); // String "roll" is called here.
        System.out.println("|______________________________|");   // line  in println
        System.out.println("|    Subjects       : Marks    |");   // println for Marks sheet format
        System.out.println("|______________________________|");   // line in println
        System.out.println("|    Maths          : " + Maths + "       | "); // calling Maths marks here
        System.out.println("|    Science        : " + Science + "       |"); // Calling Science marks here
        System.out.println("|    English        : " + Eng + "       |");  // calling English marks here
        System.out.println("|______________________________|");     // line in println
        System.out.println("|    Total          : " + total + "      | ");  // calling total calculation here
        System.out.println("|______________________________|");     // line in println
        System.out.println("|    Percentage     : " + Percent + "     |"); // calling Percentage calculations here
        System.out.println("|    Result         : " + result + "     |");  // Call result to print
        System.out.println("|    Grade          : " + grade + "        |");  // calling grade to print
        System.out.println("|______________________________|");  // Closing line for Mark Sheet format

    }

}
