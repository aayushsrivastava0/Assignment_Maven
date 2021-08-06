package ssn.calImpl;
import java.util.Scanner;
import ssn.calApi.Calculator;

public class Application {
    public static void main(String[] args) {
        int operand1 = 0;
        int operand2 = 0;
        int choice = 0;

        System.out.println("Select Operation to perform? ('+', '-', '*', '/')");
        System.out.println(" Input 1 for Addition");
        System.out.println(" Input 2 for Subtraction");
        System.out.println(" Input 3 for Multiplication");
        System.out.println(" Input 4 for Division");


        Scanner in = new Scanner(System.in);
        System.out.println("Input Any Number from above:\n");
        choice = in.nextInt();

        //perform checking for valid choice and get input from the user
        if (choice >= 1 && choice <= 4) {
            in.nextLine();
            System.out.println("Input First Number:\n");
            operand1 = in.nextInt();
            in.nextLine();
            System.out.println("Input Second Number:\n");
            operand2 = in.nextInt();
        }
        else
        {
            System.out.println("Incorrect Choice");
        }

        //create a new object cal of the class Calculator
        Calculator cal = new Calculator(operand1, operand2, choice);

        //Print the solution return by the object cal
        System.out.println("Solution = " + cal.solution);

    }
}

