import java.util.*;

public class Used_Method2 {

    //Methods Performed the Differnt Operation

    static int add(int num1, int num2) {
        return num1 + num2;
    }

    static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    static int divide(int num1, int num2) {
        return num1 / num2;  
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Enter the Operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);  // Operator as character

        switch (operator) {

            case '+':
                System.out.println("Addition is : " + add(num1, num2));
                break;

            case '-':
                System.out.println("Subtraction is : " + subtract(num1, num2));
                break;

            case '*':
                System.out.println("Multiplication is : " + multiply(num1, num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division is : " + divide(num1, num2));
                } else {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}
