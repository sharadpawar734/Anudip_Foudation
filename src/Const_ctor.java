import  java.util.*;

public class Const_ctor {

    int x;

    public Const_ctor(int x){
        this.x = x;
        return;
    }

    public static void main(String[] args) {

        Const_ctor con = new Const_ctor(12);
        System.out.println("This value of Pass the Constructors " + con);
    }
}
