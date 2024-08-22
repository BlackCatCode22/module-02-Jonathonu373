// J.U 8.20.24
/*
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked (no hour fractions), use's hourly payrate
 *
 * Processing: total weekly pay including overtime if more than 40
 *   hours were worked that week.
 *
 * Output: Polite greeting to the user and regular pay and overtime pay
 *
 *
 */
//


import java.util.Scanner;



public class PayrollProgram {
    public static void main(String[] args) {
        System.out.println("\n\n....Welcome to the Payroll Program....");


        // Variables used in this program.
        String userName = "";
        int hoursWorked = 0;

        int anotherNumber;
        int payrate =
        int overtimeHours = 0;
        double hrlyPayRate = 0.0;
        double weeklyPayWithout = 0.0;
        double overTimePay = 0.0;

        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a Scanner object to get input fromt the user.
        Scanner myScannerObj = new Scanner (System.in);

        // Get the user's name.
        System.out.println("\n Please state your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you're doing well.");

        //Get weekly hours worked from the user.
        // Output statement prompting the user for hrs worked
        System.out.println(" \n Please enter how many you worked this week \n(Please use whole numbers): ");
        // Use the Scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in a variable
        hoursWorked = myScannerObj.nextInt();

        //Create an output statement to the used echoing the user's input.
        System.out.println("\n Hey " + userName + " you worked: " + hoursWorked + " this week!");

        // Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked>40) {
            overTimePay = overtimeHours * payrate * 1.5;
        }
        else {
            overTimePay =0;}
    }
    // Calculate weekly regular pay
    if (hoursWorked > 40) {
        weeklyPaywithoutOvertime = hrlyPayRate * 40;
    }