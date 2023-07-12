class Employee2{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}

public class PS_AccesaModifier1 {
    public static void main(String[] args) {
        Employee2 emp1 = new Employee2();

        emp1.setName("Pradipti");
        System.out.println(emp1.getName());
        emp1.setId(1);
        System.out.println(emp1.getId());
    }
}

/*
OUTPUT
Pradipti
1
 */
