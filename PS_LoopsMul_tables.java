import java.util.Scanner;

public class PS_LoopsMul_tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for table:");
        int n = sc.nextInt();
        System.out.print("Enter the number till where it should get multiplied:");
        int m = sc.nextInt();
        System.out.printf("Table of %d: \n",n);

        for(int i=1;i<=m;i++){ // incrementing for loop
            int mul = n*i;
            System.out.printf("%d X %d = ",n,i);
            System.out.println(mul);
        }
        //TABLE IN REVERSE
        System.out.println("");
        System.out.printf("Table of %d in reverse:\n",n);
        for(int j=m;j!=0;j--){ //decrementing for loop
            int mul1 = n*j;
            System.out.printf("%d X %d = ",n,j);
            System.out.println(mul1);
        }

    }
}
//OUTPUT
/*
Enter the number for table:2
Enter the number till where it should get multiplied:20
Table of 2:
2 X 1 = 2
2 X 2 = 4
2 X 3 = 6
2 X 4 = 8
2 X 5 = 10
2 X 6 = 12
2 X 7 = 14
2 X 8 = 16
2 X 9 = 18
2 X 10 = 20
2 X 11 = 22
2 X 12 = 24
2 X 13 = 26
2 X 14 = 28
2 X 15 = 30
2 X 16 = 32
2 X 17 = 34
2 X 18 = 36
2 X 19 = 38
2 X 20 = 40

Table of 2 in reverse:
2 X 20 = 40
2 X 19 = 38
2 X 18 = 36
2 X 17 = 34
2 X 16 = 32
2 X 15 = 30
2 X 14 = 28
2 X 13 = 26
2 X 12 = 24
2 X 11 = 22
2 X 10 = 20
2 X 9 = 18
2 X 8 = 16
2 X 7 = 14
2 X 6 = 12
2 X 5 = 10
2 X 4 = 8
2 X 3 = 6
2 X 2 = 4
2 X 1 = 2
 */