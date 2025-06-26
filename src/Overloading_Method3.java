import java.util.*;

public class Overloading_Method3 {

    static void Holiday(){
        System.out.println("Sunday");
    }

    static void Holiday(int a){
        System.out.println("Isbar 1 weak me 4 day chuti ye ..full rada.." + a );
//        System.out.println("  Majya ch yeil" +b);
    }

    public static void main(String[] args) {

        Overloading_Method OM = new Overloading_Method();

      Holiday();
      Holiday(420);

    }
}
