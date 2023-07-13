class MyEmployee1{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setId(int i){
        this.id=i;
    }
    public int getId(){
        return id;
    }
}

public class PS_AccessModifier2 {
    public static void main(String[] args) {
        MyEmployee1 pradipti = new MyEmployee1();
        pradipti.setName("PeaceWithPradipti");
        System.out.println(pradipti.getName());
        pradipti.setId(234);
        System.out.println(pradipti.getId());
    }
}
/*
OUTPUT
PeaceWithPradipti
234
 */
