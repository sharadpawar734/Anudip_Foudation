import java.util.*;

 class Empl{
     int id ;
     String  name;
     int salary;

     public void Prit(){
         System.out.println("Emp id : "+id);
         System.out.println("Emp name: "+name);
         System.out.println("Emp Salary: "+salary);
     }
 }
public class OOp_Class2 {

    public static void main(String[] args) {

        System.out.println("This is a Custom Class: ");
        Empl emp = new Empl();
        Empl Manager = new Empl();


        emp.id = 101;                            //It object Attribute
        emp.name = "Sharad Rajaram Pawar";       //It object Attribute
        emp.salary = 40000;

        Manager.id = 201;                          //yk notes dusra file madhi je class ch name ani file name any other same astil tar working/ run houla essues yeto
        Manager.name = "Apurva";
        Manager.salary = 250000;

        emp.Prit();
        Manager.Prit();

    }
}
