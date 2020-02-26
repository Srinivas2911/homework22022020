import java.util.Scanner;

public class DaysOfTheWeek13 {

    /*13. Write a Java program which input any number between 1 to 7 and it print
     *The Days name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
     * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
     */

    public static void main(String[] args) {          // main method

        DaysOfTheWeek13 obj = new DaysOfTheWeek13();            // object creation for Class
        obj.myWeekDays();                                       // instance metod calling in main method
    }

    public void myWeekDays() {                                  // instance method
        Scanner scan = new Scanner(System.in);                  // scanner introduced
        System.out.println("Input a number (1-7)for the day of the Week : ");  // Input value field
        int day = scan.nextInt();                               // user input for int  day

        switch (day) {                                          // switch introduced
            case 1:                                             // if replaces with case; case 1
                System.out.println(day + " = This is Monday");  // print Monday for case 1 as defined
                break;                                          // end of case 1, as break
            case 2:                                             // case 2 ; for an if else statement
                System.out.println(day + " = This is Tuesday"); // print Tuesday for case 2 defined
                break;                                          // end of case 2 with a break
            case 3:                                             // case 3 ; for if else
                System.out.println(day + " = This is Wednesday"); // print Wednesday for case 2 defined
                break;                                          // end of case 3 with a break
            case 4:                                             // case 4 ; replaces if else
                System.out.println(day + " = This is Thursday"); // print Thursday for case 2 defined
                break;                                          // end of case 4 with a break
            case 5:                                             // case 5; for if else
                System.out.println(day + " = This is Friday");  // print Friday for case 2 defined
                break;                                          // end of case 5 with a break
            case 6:                                             // case 6 ; replaces if else
                System.out.println(day + " = This is Saturday"); // print Saturday for case 2 defined
                break;                                          // end of case 6 with a break
            case 7:                                             // case 7 for if else
                System.out.println(day + " = This is Sunday");   // print Sunday for case 2 defined
                break;                                          // end of case 7 with a break
            default:                                            // default set for final else statement
                System.out.println(" There are only 7 days in a week"); // printing statement for default or anything else
                System.out.println(" Choose a day between 1 & 7");      // notifying to choose between 1 & 7 only
        }
    }
}
