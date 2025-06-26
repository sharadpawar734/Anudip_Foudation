import java.util.*;

public class Uesed_Method {

    //Create Method
    static  int logic(int num1, int num2){

        int Sum = num1 * num2;

        return Sum;
    }                                //end method

    public static void main(String[] args) {
        int Product;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number");
        int num1 = sc.nextInt();

        System.out.println("Enter the Secound Number");
        int num2 = sc.nextInt();

         Product = logic(num1, num2);

        System.out.println("Final Answaer is : " +Product);
    }
}
