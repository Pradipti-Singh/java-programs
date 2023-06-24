import java.sql.SQLOutput;

class Employee1{
    int id;
    String name;
    int salary;
    public void PrintDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
    }
    public int getSalary(){

        return salary;
    }
}

public class OOPs_Custom_Class{
    public static void main(String[] args) {
        System.out.println("This is our custom class.");
        Employee1 Pradipti = new Employee1();// Instantiating a new Employee Object
        Employee1 Singh    = new Employee1();// Instancing a new Employee Object

        // Setting Attributes for Pradipti
        Pradipti.id = 4;
        Pradipti.name = "Pradipti";
        Pradipti.salary = 12;

        // Setting Attributes for Singh
        Singh.id = 5;
        Singh.name = "Singh";
        Singh.salary = 24;

        //Printing details with help of method
        Pradipti.PrintDetails();
        Singh.PrintDetails();
        int salary = Pradipti.getSalary();
        System.out.println(salary);
        int salary1 = Singh.getSalary();
        System.out.println(salary1);

    }
}

//OUTPUT
/*
This is our custom class.
My id is 4
My name is Pradipti
My id is 5
My name is Singh
12
24
 */
