//PROBLEM: Create a class Square with a method to initialize its side, calculating area, perimeter etc.

import java.util.Scanner;

class Square{
    int side;

    public int Area(){
        int ar = side*side;
        return ar;
    }
    public int Parameter(){
        int par = 4*side;
        return par;
    }

}

public class PS_OOPs_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square sq = new Square();
        System.out.println("Enter the side:");
        sq.side = sc.nextInt();
        System.out.println("Area :"+sq.Area());
        System.out.println("Paramenter :"+sq.Parameter());


    }
}

//OUTPUT
/*
Enter the side:
2
Area :4
Paramenter :8
 */
