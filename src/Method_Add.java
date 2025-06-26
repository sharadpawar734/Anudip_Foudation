import  java.util.*;

public class Method_Add {

    public  static  void  add(int a, int b){
        int sum = a + b;

        System.out.println("Total Sum is "+sum);
        return;
    }
      Method_Add(){
          System.out.println("Good Monings");
      }

    public static void main(String[] args) {

        Method_Add MA = new Method_Add();   // to create the Object for run the construction
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int a = sc.nextInt();

        System.out.println("Enter the Secound Number");
        int b = sc.nextInt();

        add(a,b);

    }
}
