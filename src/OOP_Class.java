import java.util.*;

  class  Employee{

      int id ;
      String  name;
      int salary;

  }

public class OOP_Class {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

//        System.out.println("Enter the Employee id:  ");
//        int s1 = sc.nextInt(emp.id);
//        System.out.println("It is employe Id: "+ s1);
//
//        System.out.println("Enter the Employee name:  ");
//        String s2 = sc.nextLine();
//        System.out.println("It is employe Id: "+ s2);
//
//        System.out.println("Enter the Employee id:  ");
//        int s3 = sc.nextInt(emp.salary);
//        System.out.println("It is employe Id: "+ s3);

//
//        System.out.println("Enter the Employee name: " +emp.name);
//        int s2 = Integer.parseInt(sc.nextLine());
//
//        System.out.println("Enter the employee Salary: "+emp.Salary);
//        int s3 = sc.nextInt();
//        System.out.println("Employee Salary: "+ s3);


        System.out.println("This is a Custom Class: ");
        emp.id = 101;                            //It object Attribute
        emp.name = "Sharad Rajaram Pawar";       //It object Attribute
        emp.salary = 40000;                      //It object Attribute


        //Print the Attribute
        System.out.println("Employee id: "+emp.id);
        System.out.println("Employee Name: "+emp.name);
        System.out.println("Employee Salary: "+emp.salary);
    }
}
