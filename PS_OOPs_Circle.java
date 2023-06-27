import java.util.Scanner;

class Circle{
    float r;
    public float  circumference(){
        return 2*3.14f*r;
    }
    public float Area(){
        return 3.14f*r*r;
    }
}

public class PS_OOPs_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle cr = new Circle();
        System.out.print("Enter the radius:");
        cr.r = sc.nextFloat();
        System.out.println("Area: "+cr.Area());
        System.out.println("Circumference: "+cr.circumference());
    }



}

//OUTPUT
/*
Enter the radius:3
Area: 28.26
Circumference: 18.84
 */
