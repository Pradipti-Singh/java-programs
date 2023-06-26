//PROBLEM:Create a class Rectangle with a method to initialize its side, calculating area, perimeter etc.

import java.util.Scanner;

class Rectangle{
    int l;
    int b;

    public int Area(){
        int ar = l*b;
        return ar;
    }
    public int Parameter(){
        int par = 2*(l+b);
        return par;
    }
}
public class PS_OOPs_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rect = new Rectangle();
        System.out.print("Enter length:");
        rect.l = sc.nextInt();
        System.out.print("Enter breadth:");
        rect.b = sc.nextInt();
        System.out.println("Area : "+rect.Area());
        System.out.println("Parameter : "+rect.Parameter());

    }
}

//OUTPUT
/*
Enter length:2
Enter breadth:3
Area : 6
Parameter : 10
 */