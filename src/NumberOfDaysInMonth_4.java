public class NumberOfDaysInMonth_4 {
/*
4. Number of Days In Month Write a method isLeapYear with a parameter of type int named year. The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return false. Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false. A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400. Example of input/Output:
• isLeapYear(-1600); -→should return false since the parameter is not in the range(1-9999)
• isLeapYear(1600); →should return true since 1600 is a leap year
• isLeapYear(2017); →should return false since 2017 is not a leap year
• isLeapYear(2000);→ should return true because 2000 is a leap year Write another method getDaysInMonth with two parameter month and year. Both of type int. If parameter month is < 1 or >12 return -1. If parameter year is <1 or >9999 than return -1. This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February). You should check if the year is a leap year using the method isLeapYear describe above. Example of input/Output:
• getDaysInMonth(1, 2020); →should return 31 since January has 31 days.
• getDaysInMonth(2, 2020);→should return 29 since February has 29 days in a year and 2020 is a leap
year.
• getDaysInMonth(2, 2018);→ should return 28 since February has 28 days if it’s not a leap year and
2018 is not a leap year.
• getDaysInMonth(-1, 2020);→should return -1 since the parameter month is invalid.
• getDaysInMonth(1, -2020);→should return -1 since the parameter year is outside the range of 1 to
9999
HINT: Use the switch statement. NOTE: Methods isLeapYear and getDaysInMonth need to be public static
 */


    public static void main(String[] args) {  // main method

        // Change parameters in the main method to run the results.

        isLeapYear(2020);                       // static method called for leap year
        getDaysInMonth(11, 2020);      // static method for days of month
    }

    public static void isLeapYear(int year) {   // static method with parameter int year

        if (year >= 1 && year <= 9999) {        // condition for valid input for year between 1-9999

            switch (year % 4) {                 // switch method used for leap year check
                case 0:                         // case 0 - defines leap year.
                    if (year % 100 == 0) {       // year divisible by 4, and divisible by 100 & 400
                        if (year % 400 == 0) {
                            System.out.println(year + " is a Leap year ," + true);  // true statement for leap year
                        } else
                            System.out.println(year + " is not a Leap year, " + false); // false statement
                    } else
                        System.out.println(year + " is a Leap year, " + true);     // true statement
                    break;
                default:                                                            // default case
                    System.out.println(year + " is not a leap year, " + false);     // default statement false
                    break;
            }
        } else
            System.out.println(false + ", Invalid input");         // invalid statement for year input
    }

    public static void getDaysInMonth(int month, int year) {       // 2nd method static for month of year
                                                                 // two parameters for month and year
        int numDays = 0;                                           // int num days defined for no. of days in a month
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {  // condition for valid for month and year input
            switch (month) {                                    // perform switch for days in a month

                case 1:                     // case 1,3,5,7,8,10,12 - 31 days
                case 3:                     // Jan,Mar,May,Jul,Aug,Oct,Dec
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numDays = 31;       // 31 days in the month
                    break;
                case 4:                 // case 4, 6,9,11 - 30 days
                case 6:                 // Apr, Jun, Sep, Nov
                case 9:
                case 11:
                    numDays = 30;       // 30 days in the month
                    break;
                case 2:                 // case 2 - for Feb
                    if (((year % 4 == 0) &&     // check for leap year
                            !(year % 100 == 0))
                            || (year % 400 == 0))
                        numDays = 29;           // leap year offer 29 fays in Feb
                    else
                        numDays = 28;           // other years 28 days
                    break;
                default:
                    System.out.println("-1, Invalid request");  // default for invalid year and moth request
                    break;
            }
        }else System.out.println("-1, Invalid request" );   // invalid request statement

        System.out.println("Number of days in the month = " + numDays);  // print num of days in the month for each input
    }
}