class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setting x now.");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructror.");
    }
}
class Derived extends Base{
    int y;

    public int getY(){
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}

public class Inheritance {
    public static void main(String[] args) {
        Derived ob = new Derived();
        ob.setX(5);
        System.out.println(ob.getX());
        ob.printMe();
    }
}

//OUTPUT
/*
I am setting x now.
5
I am a constructror.
 */
//Base ob cannot acces y . as base only has x. derived class extends base not base class extends derived class.
//Multiple inheritance is not supported. two classes cannot be super class.