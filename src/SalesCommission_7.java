import java.util.Scanner;

public class SalesCommission_7 {

    /* 7. WAP input sales id, seller's name, sales amount, and salary basic and then fined this sales Commission
Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
*/

    public static void main(String[] args) {  // main method

        SalesCommission_7 obj = new SalesCommission_7();  // can use call method as well
        obj.myCommission();   // object method
    }

    public void myCommission() {  // instance method can also apply.

        Scanner scan = new Scanner(System.in); // scanner introduced
        System.out.println("Enter Sales ID : "); // sales ID input
        String num = scan.next();

        System.out.println("Sellers name : ");  // seller name input
        String name = scan.next();

        System.out.println("Enter the Basic Salary : ");  // basic print input
        int sal = scan.nextInt();

        System.out.println("Enter the Sales Amount : ");// sales amount input
        int a = scan.nextInt();

        System.out.println("Sales ID : " + num);   //print sales ID
        System.out.println("Seller's name : " + name); // print seller name
        System.out.println("Basic Salary : " + sal);  // print basic salary
        System.out.println("Sales Amount :" + a);  // print sales amount.

        if (a >= 50000) {                // // using Nested if else syntax + for sales 50000 or more, comm 35%
            System.out.println("Sales Commission : 35%");  // print comm 35%
            System.out.println("Sales amount :" + a * 35 / 100); // print amount

        } else if (a >= 30000) {         // for sales 30000 or more, comm 20%
            System.out.println("Sales Commission : 20%"); // print comm 20%
            System.out.println("Sales amount :" + a * 20 / 100); // print sales amount

        } else if (a >= 20000) {        // for sales 20000 or more, comm 10%
            System.out.println("Sales Commission : 10%"); // print comm 10%
            System.out.println("Sales amount :" + a * 10 / 100); // print sales amount

        } else if (a >= 10000) {        // for sales 10000 or more
            System.out.println("Sales Commission : 5%"); // print comm 5%
            System.out.println("Sales amount :" + a * 5 / 100); // print amount

        } else if (a >= 0) {              // ELSE for sales under 10000, comm 2%
            System.out.println("Sales Commission : 2%"); // print 2%
            System.out.println("Sales amount :" + a * 2 / 100); // print amount

        } else
            System.out.println(" PLEASE CHECK YOUR SALES RECORDS"); // for any thing else
            System.out.println(" _______________________________");
    }
}