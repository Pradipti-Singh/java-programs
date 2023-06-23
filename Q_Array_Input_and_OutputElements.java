//PROBLEM:Taking a matrix as an input and printing its element.

import java.util.Scanner;

public class Q_Array_Input_and_OutputElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no. of column: ");
        int cols = sc.nextInt();

        int [][] num = new int[rows][cols];
        //input
        //rows
        System.out.println("Enter the matrix element:");
        for(int i=0;i<rows;i++ ){
            //columns
            for(int j=0;j<cols;j++){
                num[i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("The matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(num[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//OUTPUT
/*
Enter no. of rows: 3
Enter no. of column: 4
Enter the matrix element:
1 2 3 4
4 3 2 1
5 6 7 8
The matrix:
1 2 3 4
4 3 2 1
5 6 7 8
 */
