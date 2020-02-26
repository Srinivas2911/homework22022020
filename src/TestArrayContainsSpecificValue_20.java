import java.util.Scanner;

public class TestArrayContainsSpecificValue_20 {

    //20. Write a Java program to test if an array contains a specific value.
    // Scanner used.

    public static void main(String[] args) {  // main method
//         declaration of array variable


        int n, x, i;            // defined  integers for it
        // n - no of items, i= array of the index / x - actual items

        Scanner scan = new Scanner(System.in);  // Scanner declaration
        System.out.println("Please Enter the no. of Elements you want in array :"); // Enter total no of elements
        n = scan.nextInt();                     // user input
        int[] a = new int[n];                   // defining array "a" as a object - new array for n no of items

        System.out.println("Enter all the Elements");  // Entering the values one after the other

        for (i = 0; i < n; i++) {                   // for condition
            a[i] = scan.nextInt();                  // user input for the items
        }

        System.out.println("Enter the Elements you want to find : ");
        x = scan.nextInt();                        // find ? which item  of x

        for (i = 0; i < n; i++) {               // for condition for array
            if (a[i] == x) {                    // location of x at index of array
                System.out.println("Elements found at position :" + (i + 1)); // print the index for the item x
            }else
                System.out.println("Element not found");  // if item not found, print statement for not found.
            break;

        }

    }
}
