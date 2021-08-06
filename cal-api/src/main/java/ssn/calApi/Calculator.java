package ssn.calApi;
import java.util.Scanner;

public class Calculator {

        public int solution;
        int x, y;
        int operation;

        //constructor for initialising the values and calling calc function
    public Calculator(int num1, int num2, int operator) {
        x = num1;
        y = num2;
        operation = operator;
        Calc();
    }


        private int addition(int x, int y) {
        return x + y;
    }


        private int subtraction(int x, int y) {
        return x - y;
    }


        private int multiplication(int x, int y) {
        return x * y;
    }


        private int division(int x, int y) {
        return x / y;
    }

        //method to calculate
        private int Calc() {
        switch (operation) {
            case (1):
                solution = addition(x, y);
                break;
            case (2):
                solution = subtraction(x, y);
                break;
            case (3):
                solution = multiplication(x, y);
                break;
            case (4):
                solution = division(x, y);
                break;
        }
        return solution;

    }

    }
