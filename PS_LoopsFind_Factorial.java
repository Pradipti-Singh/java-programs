import java.util.Scanner;

public class PS_LoopsFind_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=n;i!=0;i--){
             fact = fact*i;

        }
        System.out.printf("Factorial of %d is: ",n);
        System.out.println(fact);

    }
}

//OUTPUT
/*
Enter the number: 3
Factorial of 3 is: 6
 */
