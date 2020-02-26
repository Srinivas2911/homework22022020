import java.util.Scanner;

public class SalarySlip_5 {

/*5. WAP to input employee id, name, basic salary then find HRA, TA,
DA, PF and Gross salary HRA = basic salary 10% DA = Basic salary 8%
TA = Basic salary 9% PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
*/

    public static void main(String[] args) {  // main method - static
        SalarySlip_5 obj = new SalarySlip_5();// object created for instance method
        obj.mySalary();                       // instance method called in main method
    }

    public void mySalary() {                  // instance method

        Scanner scan = new Scanner(System.in); // Scanner for user inputs
        System.out.println("Employee ID : ");  // Print Employee ID
        int ID = scan.nextInt();               // input value by user

        System.out.println("Employee Name : "); // Print Employee Name
        String name = scan.next();              // input name by user

        System.out.println("Enter the Basic Salary : "); // Print Basic salary
        double Sal = scan.nextInt();     // defined Salary value (Sal) as double due to  allow decimal places
        // input by user

        double Hra = 10 * Sal / 100;     // defined HRA = 10% of Basic Salary / double for decimal
        double Ta = 8 * Sal / 100;      // defined TA = 8% of Basic Salary as double
        double Da = 9 * Sal / 100;      // defined DA = 9% of Basic Salary as double
        double Pf = 20 * Sal / 100;     // defined PF = 20% of Basic Salary as double

        double result = Sal + Hra + Ta + Da - Pf; // Gross Salary defined as result as double for use of decimal places.

        // Printing the Salary Slip as a format
        System.out.println(" _____________________________");   //  print in string
        System.out.println("|       SALARY SLIP           |");
        System.out.println("|_____________________________|");
        System.out.println("|Employee Id     : " + ID + "        |"); //input ID will reflect here.
        System.out.println("|Employee Name   : " + name + "        |");//input name will reflect here.
        System.out.println("|_____________________________|");
        System.out.println("|Basic Salary    : " + Sal + "    |");  // input Salary will reflect here
        System.out.println("|HRA 10%         :  " + Hra + "    |"); // calculated HRA will reflect
        System.out.println("|TA 8%           :  " + Ta + "    |");  // Calculated TA will reflect
        System.out.println("|DA 9%           :  " + Da + "    |");  // Calculated DA will reflected
        System.out.println("|PF(-)20%        :  " + Pf + "    |");  // Calculated PF will reflect here.
        System.out.println("|_____________________________|");
        System.out.println("|Gross Salary    : =" + result + "   |"); // Gross calculated salary will reflect here.
        System.out.println("|=============================|");
    }
}
