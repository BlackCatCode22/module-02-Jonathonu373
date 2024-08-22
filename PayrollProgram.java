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

    static void theHelloMethod(){
        System.out.println(" \n Hello from theHelloMethod() ! ");
    }

    //Create a method that gets input.
    static void aPersonalGreeting(String someName) {
        System.out.println(" \n Hello " + someName + " how are you today?");

    }
    public static void main(String[] args) {
        System.out.println(" \nWelcome to the Methods!\n");
        //Variables (members)
        String theUserName = "";


        // Create a Scanner object for user input
Scanner scanner = new Scanner(System.in);

        theHelloMethod();


        // Create a Scanner object for user input






        // Variables used in this program.
        String userName = "";
        int hoursWorked = 0;


        int anotherNumber;
        int payrate = 0;
        int overtimeHours = 0;
        double hrlyPayRate = 0.0;
        double weeklyPayWithout = 0.0;
        double overTimePay = 0.0;
        double totalPay;

        // Say hello to the user and get user pay information.
        // Get the user's name.
        // Create a Scanner object to get input fromt the user.
        Scanner myScannerObj = new Scanner(System.in);

        // Get the user's name.
        System.out.println("\n Please enter your name: ");
        userName = myScannerObj.nextLine();

        System.out.println("\n Hello, " + userName + ". I hope you're doing well.");

        //Get weekly hours worked from the user.

        // Get the hourly pay rate from the user.
        System.out.println("\n Please enter how many hours you worked this week (Please use whole numbers):");
        payrate = myScannerObj.nextInt();


        // Use the Scanner object to get input from this prompt, and store what was returned
        // from your Scanner object in a variable
        hoursWorked = myScannerObj.nextInt();

        //Create an output statement to the used echoing the user's input.
        System.out.println("\n Hey " + userName + " you worked: " + hoursWorked + " this week!");

        // Processing
        overtimeHours = hoursWorked - 40;
        if (hoursWorked > 40) {
            overTimePay = overtimeHours * payrate * 1.5;
        } else {
            overTimePay = 0;

            //Calculate total weekly pay
            totalPay = weeklyPayWithout + overTimePay;

            //output results
            System.out.printf("\n%s, Your total weekly pay is:$%.2f\n", userName, totalPay);
            System.out.printf("\n Regular pay: \n", weeklyPayWithout);
            System.out.printf(" Overtime pay: \n", overTimePay);
        }

        //Close the scanner
        myScannerObj.close();




    }
}