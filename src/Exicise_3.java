import java.util.*;

public class Exicise_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name/Number: ");
        String str = sc.nextLine();

        String rev = new StringBuilder(str).reverse().toString();

        if (str.equals(rev)){
            System.out.println("It is Plaidrome ");
        }
        else {
            System.out.println("It is not Palindrome ");
        }

    }
}
