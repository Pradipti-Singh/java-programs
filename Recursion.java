import java.util.Scanner;

public class Recursion {
    //factorial(0) = 1
    //factorial(n) = n*n-1*....1
    //factorial(5) = 5*4*3*2*1 = 120
    //factorial(n) = n * factorial(n-1)

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1); //function calling itself
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        System.out.printf("The value of factorial %d is: %d",x,factorial(x));
    }
}

//OUTPUT
/*
Enter the number:4
The value of factorial 4 is: 24
 */

