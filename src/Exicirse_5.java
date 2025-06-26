import java.util.*;

public class Exicirse_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");
        int num = sc.nextInt();

        if (num % 400 == 0 || num % 4 == 0 && num %  100 != 0){
            System.out.println("It is leap Year ");
        }
        else {
            System.out.println("It is not leap Year");
        }
    }
}
