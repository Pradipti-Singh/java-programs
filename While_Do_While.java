import java.util.Scanner;

public class While_Do_While {
    public static void main(String[] args) {
        System.out.println("For While");
        int a = 0;
        while(a<5){
            System.out.println(a);
            a++;
        }

        System.out.println("For Do While");
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b<5);

        System.out.println("Do while perform the task atleast one time");
        int c = 10;
        do{
            System.out.println(c);
            c++;
        }while(c<5);

        //Write a program to print first n naturals numbers using do-while loop
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = 1;
        do{
            System.out.println(d);
            d++;
        }while(d<=n);

    }
}

//OUTPUT
/*
For While
0
1
2
3
4
For Do While
0
1
2
3
4
Do while perform the task atleast one time
10
Enter the number
10
1
2
3
4
5
6
7
8
9
10

 */
