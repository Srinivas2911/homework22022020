import java.util.Scanner;

public class SumofArray_17_Opt2 {

    //19. Write a Java program to calculate the average value of array elements.

    public static void main(String[] args) {
        myArraySum();
    }

    public static void myArraySum() {

        int sum = 0;                        // int sum defined
        Scanner scan = new Scanner(System.in);  // scanner introduced/
        System.out.print("Size of the array /No. of items :");  // print statement for no. of items
        int x = scan.nextInt();               // int 'x' defined. for user input for no. of items.

        int[] array = new int[x];      // another int arrays defined
                                       // for new int with array parameter 'x' for no of items

        System.out.println("Enter the elements one by one:"); // print statement for the elements to be input
        for (int i = 0; i < array.length; i++) {      // for loop condition. with index at 0
            array[i] = scan.nextInt();    // User input for all the array items
            sum = sum + array[i];      // results in the sum of all the array items
        }

        System.out.println("Sum of the Arrays :" + sum); // printing the sum.
    }
}