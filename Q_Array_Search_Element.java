//PROBLEM: Searching for an element x in a matrix.

import java.util.Scanner;

public class Q_Array_Search_Element {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
       int rows = sc.nextInt();
        System.out.print("Enter the no. of cols:");
       int cols = sc.nextInt();

       int [][] matrix = new int[rows][cols];
        System.out.println("Enter the elements");

       //input
        // rows
        for(int i=0;i<rows;i++){
            //columns
            for(int j=0;j<cols;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.print("Enter the element to be search:");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    System.out.printf("%d is found at the (%d,%d) location",x,i,j);
                }
            }
        }
    }
}

//OUTPUT
/*
Enter the no. of rows:3
Enter the no. of cols:4
Enter the elements
1 2 3 4
5 34 5 6
7 7 5 6
Enter the element to be search:34
34 is found at the (1,1) location
 */

