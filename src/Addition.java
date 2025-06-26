import java.util.*;

// Basic of the Java

public class Addition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int num1 = sc.nextInt();

        System.out.println("Enter the Secound the number");
        int num2 = sc.nextInt();

        System.out.println("Enter the Float Number 1");
        float a1 = sc.nextFloat();

        System.out.println("Enter the Secound Number ");
        float a2 = sc.nextFloat();

        float sum = a1 + a2;

        int Sum = num1 + num2;

        System.out.println("Normal Sum "+Sum);

        System.out.println("Float Sum"+Sum);

        System.out.println("ENter First Latter");
        String s1 = sc.next();

        System.out.println("Enter the Secound Number");
        String s2 = sc.next();

        String cal = s1 + s2 ;

        System.out.println("Full String "+cal);

        System.out.println(" Enter the Full Latter");
        String  one_sentece = sc.next();

        System.out.println("Enter the Full Later");
        String Full_line = sc.nextLine();

        System.out.println(one_sentece);
        System.out.println(Full_line);
    }
}
