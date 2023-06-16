import java.util.Scanner;

public class PS_Sum_Of_Mul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the multiplicand: ");
        int n = sc.nextInt();
        System.out.print("Enter till where it should get multiplied: ");
        int m = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=m;i++){
            int mul = n*i;
            sum += mul;
            System.out.printf("%d * %d = %d \n",n,m,mul);
        }
        System.out.printf("Total sum of multiples of %d : %d ",n,sum);
    }
}
//OUTPUT
/*
Enter the multiplicand: 8
Enter till where it should get multiplied: 10
8 * 10 = 8
8 * 10 = 16
8 * 10 = 24
8 * 10 = 32
8 * 10 = 40
8 * 10 = 48
8 * 10 = 56
8 * 10 = 64
8 * 10 = 72
8 * 10 = 80
Total sum of multiples of 8 : 440


 */
