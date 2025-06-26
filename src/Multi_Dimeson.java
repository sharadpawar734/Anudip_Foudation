import java.util.*;

//Multi Dimsion Array

public class Multi_Dimeson {

    public static void main(String[] args) {

       // int [] marks ;

        int [][]  flats;

        flats = new int [3][4];

        flats [0][1] = 1;
        flats [0][2] = 5;
        flats [0][8] = 30;

        //secound floar
        flats [1][1] = 201;
        flats [1][2] = 202;
        flats [1][9] = 215;

        //Third Floar
        flats[2][1] = 310;
        flats[2][2] = 340;
        flats [2][3] = 390;

        System.out.println("Print the 2 Dimasion Array by using the for loop: ");
        for (int i = 0; i < flats.length; i++){
            System.out.println(flats[i]);
        }
    }
}
