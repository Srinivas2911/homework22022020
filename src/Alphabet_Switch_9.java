import java.util.Scanner;

public class Alphabet_Switch_9 {
    /* 9. Same as above program-8 using switch statement.
       8. Input any alphabet from a to f and print their city name accordingly (use if else) any other
       Alphabet should be invalid entry */

    public static void main(String[] args) { // main method

        Alphabet_Switch_9 obj = new Alphabet_Switch_9();  // creating object for instance method
        obj.myAlphabet();                                 // calling instance method
    }

    public void myAlphabet() {                         //  instance method
        Scanner scan = new Scanner(System.in); // scanner  // scanner
        System.out.println("Enter an alphabet between a to f : "); // print input

        String ch = scan.next();
        ch = ch.toUpperCase();
        ch = ch.toLowerCase();

        switch (ch) {      // use of switch / ch - variable

            case "a":       // defining case for a
                System.out.println("Ahmedabad");  // print value for 'a'
                break;      // break defined for next switch

            case "b":       // defining case for b
                System.out.println("Bangalore"); // print value for b
                break;    // break defined for next switch

            case "c":     //// defining case for c
                System.out.println("Chennai"); // print value for c
                break;   // break defined for next switch

            case "d":    // defining case for lowercase d
                System.out.println("Delhi"); // print value for d
                break;   // break defined for next switch

            case "e":    // defining case for City with e
                System.out.println("Ellora"); // print value for e
                break;   // break defined for next switch

            case "f":     // // defining case  for f
                System.out.println("Faridabad"); // print value for f
                break;    // break defined for next switch

            default:     // default switch is any of the above switches are false.
                System.out.println("This is an invalid entry"); // print value for default
        }

    }
}
