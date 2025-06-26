import java.util.*;

public class Overloading_Method {

    static  void Gokes(){
        System.out.println("Alchohol pati ke biwini ne night ko husbend ko hi bahar nikaldiya beacuse oh nashe me jada kharate le raha tha 😂😂");
    }

    static void Gokes(int a , int b){
         int sum = a + b;

        System.out.println(sum);

        return;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  First number: ");
        int a = sc.nextInt();

        System.out.println("Enter the Secound the number: ");
        int b = sc.nextInt();

        Gokes();
        Gokes(5,7);
    }
}
