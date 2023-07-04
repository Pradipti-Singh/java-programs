class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        MyEmployee pr = new MyEmployee();
        pr.setName("Pradipti Singh");
        System.out.println(pr.getName());
        pr.setId(34);
        System.out.println(pr.getId());

    }
}

//OUTPUT
/*
Pradipti Singh
34
 */

