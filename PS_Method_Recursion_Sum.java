//Problem: Write a recursive function to calculate sum of first n natural numbers.


import java.util.Scanner;

public class PS_Method_Recursion_Sum {
    //sum(n) = 1+2+3...+n
    //sum(n) = 1+2+3...+n-1+n
    //sum(n) = sum(n-1)+n
    static int SumRec(int n){
        //Base condition
        if(n==1){
            return 1;
        }
        return n + SumRec(n-1);
    }
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int c = sc.nextInt();
        System.out.printf("The sum of first %d numbers are : %d",c,SumRec(c));

    }
}

//OUTPUT
/*
Enter the number: 4
The sum of first 4 numbers are : 10
 */
