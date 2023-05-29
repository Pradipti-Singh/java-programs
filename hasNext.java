import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        Boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}

/*
OUTPUT
Taking input from the user
5
true
*/
