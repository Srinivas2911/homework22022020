import java.util.Scanner;

public class LeapYear_2 {

    /*  2. WAP to input any year like (ex.2007) and
           find out if it is leap year or not?
     */

    public static void main(String[] args) {   // main method

        LeapYear_2 obj = new LeapYear_2();    // object creation
        obj.myLeapYear();                     // calling instance method myLeapYear
    }

    public void myLeapYear() {               // instance method

        Scanner scan = new Scanner(System.in); // scanner called
        System.out.println("Enter the year :"); // print statement
        int year = scan.nextInt();              // int year defined for user input.

        if ((year % 400 == 0) && (year %100!=0) || (year %4==0)) {  // leap year condition in if condition
            System.out.println(year + " is a leap year"); // print statement
        } else
            System.out.println(year + " is not a leap year");  // else print statement
    }
}
