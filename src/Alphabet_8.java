import java.util.Scanner;

public class Alphabet_8 {
        /*
        8. Input any alphabet from a to f and print their city name accordingly (use if else) any other
Alphabet should be invalid entry
         */

    public static void main(String[] args) {
        alphabetA_F();
    }

    public static void alphabetA_F() {
        Scanner scan = new Scanner(System.in); // scanner introduced
        System.out.println("Enter an alphabet between a & f : "); // print input
        char ch = scan.next().charAt(0);  // character defined

        if (ch == 'a' || ch == 'A') { // condition for lower and uppercase for 'a' or(||) 'A'
            System.out.println(ch + " : Ahmedabad");  // print value of a or A

        } else if (ch == 'b' || ch == 'B') {          // condition for 'b' or 'B' - lower/upper case
            System.out.println(ch + " : Bangalore"); // print value of b or B

        } else if (ch == 'c' || ch == 'C') {        // condition for 'c' or 'C' - lower or upper case
            System.out.println(ch + " : Chennai");   // print value of c or C

        } else if (ch == 'd' || ch == 'D') {         // condition for 'd' or 'D' - lower/upper case
            System.out.println(ch + " : Delhi");     // // print value for d or D

        } else if (ch == 'e' || ch == 'E') {           // condition for 'e' or 'E' - lower/upper case
            System.out.println(ch + " : Ellora");   // print value for e or E

        } else if (ch == 'f' || ch == 'F') {        // // condition for 'f' or 'F' - lower/upper case
            System.out.println(ch + " : Faridabad");  // print value for f or F

        } else {
            System.out.println("This is not a valid entry");    // else print invalid statement
        }

    }
}
