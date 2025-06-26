import java.util.*;

public class Recursion {

    static int factorial(int n){

        if (n == 0 || n == 1){      // Recursion Manje function call karat itself
            return 1;
        }
        else {
            return n * factorial(n = n - 1);
        }
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(" The Factorial Value is n is: " +factorial(n));
    }
}
