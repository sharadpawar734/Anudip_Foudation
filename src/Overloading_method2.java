import java.util.*;

public class Overloading_method2 {
                                                    // to create first method pass same paramete value in method
    static void change(int a){
        a = 99;
    }
                                                                //Method overload karto chnage 2 var
    static void change2(int [] arr){
        arr[0] = 99;
    }

    public static void main(String[] args) {

        int [] marks = {11,78,94,35,77,32};

        change2(marks);

        System.out.println("The value is update : "+ marks[0]);

    }
}
