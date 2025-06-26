import java.util.*;

abstract class Animal{

    public abstract void Animal_Sound();

    public void Animal_Area(){
        System.out.println("Nort Pole and South Pole is..lived by the Polar bear");
    }

}
class Lion extends Animal {

    public void Animal_Sound() {
        System.out.println("Most Popular animal in Africa Lion");
    }
}

class  Sound extends Animal{

    @Override
    public void Animal_Sound() {
        System.out.println("Polar Bear sound....Haa......");
    }
}

public class Used_Abstarction {

    public static void main(String[] args) {

        Used_Abstarction USa = new Used_Abstarction();



    }
}
