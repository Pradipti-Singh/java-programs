import java.util.Scanner;

public class PS_Methods_Factorial {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for(int i=1;i<=n;i++){
                product *= i;
            }
            return product;
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
Enter the number:5
The value of factorial 5 is: 120
 */