import java.util.Scanner;
import java.io.*;
public class Calculator {
    public static void main(String[] args) throws IOException {
        Calculations calculations = new Calculations();
        System.out.print("Enter what would you like to do\n1.Square Root\n2.Factorial\n3.Natural Logarithm\n4.Power Function\nEnter your choice: ");
        Scanner sc = new Scanner(System.in);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = sc.nextInt();
        double result,num1,num2;
        long factorial,fact_input;
        switch (choice){
            case 1:
                System.out.print("Enter the number: ");
                num1 = sc.nextDouble();
                result = calculations.squareRoot(num1);
                System.out.println("The square root is: "+Double.toString(result));
                break;
            case 2:
                System.out.print("Enter the number: ");
                fact_input = sc.nextLong();
                factorial = calculations.factorial(fact_input);
                System.out.println("The factorial is: "+Long.toString(factorial));
                break;
            case 3:
                System.out.print("Enter the number: ");
                num1 = sc.nextDouble();
                result = calculations.naturalLog(num1);
                System.out.println("The natural log is: "+Double.toString(result));
                break;
            case 4:
                System.out.print("Enter the number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter the power: ");
                num2 = sc.nextDouble();
                result = calculations.powerFunction(num1,num2);
                System.out.println("The power function value is: "+Double.toString(result));
                break;
            default:
                System.out.println("Inappropriate value chosen");
        }
    }
}
