import java.util.Arrays;

public class SortArrayNumericAndString_16 {

//16. Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {                // main method

        myNumArrays();                                      // calling instance method in main method

        SortArrayNumericAndString_16 obj = new SortArrayNumericAndString_16(); // object creation
        obj.myStringArrays();                                // calling instance method in main method
    }

    public static void myNumArrays() {                     // static method myNumArrays for number arrays

        int[] myIntArray = {3, 5, 1, 9, 6, 7, 8,0,2,4};          /* array integer[] called myIntArray defined with
                                                               various values provided */

        System.out.println("Original Numeric Arrays " + Arrays.toString(myIntArray));   // Print original int array
        Arrays.sort(myIntArray);                              // default java programme to sort arrays
        System.out.println("Sorted Numeric Arrays " + Arrays.toString(myIntArray));   // Print statement for sorted arrays
    }

    public void myStringArrays() {                           // instance method my StringArray for String arrays

        String[] myStrArray = {"victor", "roger", "peter", "alpha", "echo", "juliet", "beta", "gamma","sierra"};
                                                            /* array String[] called myStrArray defined with
                                                               various string values provided */

        System.out.println("Original String Arrays " + Arrays.toString(myStrArray));  // Print original array
        Arrays.sort(myStrArray);                             // default java programme to sort arrays
        System.out.println("Sorted Numeric Arrays " + Arrays.toString(myStrArray));
                                                            // Printing sorted arrays on console
    }
}
