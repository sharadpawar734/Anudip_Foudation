import java.util.*;

public class If_else_Condition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Your Age : ");
        int age = sc.nextInt();

        if (age > 18 ){
            System.out.println("It Learning licence are Aplliyed");
        } else if (age == 18) {

            System.out.println("IT is applied the leraning licenece");
        } else {
            System.out.println("It is not aplied the learning laicenece ");
        }
    }
}
