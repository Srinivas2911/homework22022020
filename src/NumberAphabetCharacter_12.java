import java.util.Scanner;

public class NumberAphabetCharacter_12 {

    // 12. Write a program that tells us input value is number or an alphabet or symbol.

    public static void main(String[] args) {            // main method

        myCharacter();
    }
        public static void myCharacter (){
        Scanner scan = new Scanner(System.in);          //Scanner introduced
        System.out.println("Input a Value to check : ");   // character field defined
        char ch = scan.next().charAt(0);                 // user input

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {    // if character check for a-z/lower & uppercase
            System.out.println("Character " + ch + " is a alphabet");  // print statement if alphabet

        } else if (ch >= '0' && ch <= '9') {                           // else check for digits between 0-9
            System.out.println("Character " + ch + " is a number");    // print statement for digit

        } else {                                                      // all other characters
            System.out.println("Character " + ch + " is a Special Character"); // print as Special character

        }
    }
}