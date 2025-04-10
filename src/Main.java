import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a single operator.\n e.g. '+','-','*','/' :\n");
        String operator = myScanner.next();

        System.out.print("Enter first number: ");
        //read next integer
        int num1 = myScanner.nextInt();

        System.out.print("Enter second number: ");
        //read second integer
        int num2 = myScanner.nextInt();

        //total up to two together in to a sum
        int result = 0;

        if (operator.equals("+")){
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        }else if (operator.equals("*")) {
            result = num1 * num2;
        }else if (operator.equals("/")) {
            result = num1 / num2;
        }

        System.out.println("The sum is " + result);
    }
}