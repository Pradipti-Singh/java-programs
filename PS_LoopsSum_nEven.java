import java.util.Scanner;

public class PS_LoopsSum_nEven {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the required even number: ");
    int n = sc.nextInt();
    int i = 0;
    int sum = 0;
    System.out.println("Even numbers: ");
     while(i<n){
        sum = sum + 2*i;
         System.out.println(2*i);
        i++;
     }
     System.out.println("The sum of n even numbers are: "+sum);
    }
}

//OUTPUT
/*
Enter the required even number: 3
Even numbers:
0
2
4
The sum of n even numbers are: 6
 */