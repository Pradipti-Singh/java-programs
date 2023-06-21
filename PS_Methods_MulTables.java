//Problem: Write a java method to print multiplication table of a number n.

import java.util.Scanner;

public class PS_Methods_MulTables {
    static void Mul(int n){
        for(int i=1;i<=10;i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int x = sc.nextInt();
        System.out.printf("Table of %d :\n",x);
        Mul(x);
    }
}

//OUTPUT
/*
Enter the Number: 5
Table of 5 :
5 X 1 = 5
5 X 2 = 10
5 X 3 = 15
5 X 4 = 20
5 X 5 = 25
5 X 6 = 30
5 X 7 = 35
5 X 8 = 40
5 X 9 = 45
5 X 10 = 50
 */