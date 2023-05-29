import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
    }
}

/*
OUTPUT
Enter the first number
5
Enter the second number
6
The sum of these numbers is
11
*/
