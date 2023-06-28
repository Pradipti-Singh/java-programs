/*
#PROBLEM: Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String)
getName (method returning String)
setName (method changing name)
 */
class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

public class PS_OOPs_Employee {
    public static void main(String[] args) {
        Employee Pradipti = new Employee();
        Pradipti.setName("Pradipti singh");
        Pradipti.salary = 23;
        System.out.println(Pradipti.getName());
        System.out.println(Pradipti.getSalary());


    }
}

//OUTPUT
/*
Pradipti singh
23
 */
