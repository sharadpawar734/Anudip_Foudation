import java.util.*;

class MyEmployee{

    private int id;
   private String name;

   public String getName(){
       return name;
   }

   public void Set_name(String n){
       name = n;
   }

   public int setId(int i){
      this.id = i;
       return i;
   }

    public int getId(){
        return id;
    }
}

public class Method_Geter_Setter {

    public static void main(String[] args) {
        MyEmployee my = new MyEmployee();

       my.setId(420);
        System.out.println("Employee id: " +my.getId());


     my.Set_name("Sharad Pawar");
        System.out.println( "Employee Name:  " +my.getName());     //get name return the name
    }
}
