import java.util.*;

public class Excise_2 {

    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        a = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= a; i++){
            fact = fact * i;

            System.out.println("Factorial: "+fact);
        }

    }
}
