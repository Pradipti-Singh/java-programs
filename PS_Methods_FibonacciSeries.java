import java.util.Scanner;

public class PS_Methods_FibonacciSeries {
    static int Fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return Fibonacci(n-2)+ Fibonacci(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        for(int i=0;i<10;i++){
            System.out.print(Fibonacci(i)+" ");
        }

    }
}

//OUTPUT
/*
Enter the number: 10
0 1 1 2 3 5 8 13 21 34
 */