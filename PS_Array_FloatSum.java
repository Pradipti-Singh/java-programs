
//PROBLEM: Create an array of 5 floats and calculate their sum.

import java.util.Scanner;

public class PS_Array_FloatSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float [] num = new float[5];
        float sum =0;
        for(int i=0;i<5;i++){
            System.out.printf("Enter num[%d] : ",i,"\n");
            num[i] = sc.nextFloat(); //taking input in array
            sum += num[i];


        }
        System.out.println("Total sum of the given float number = "+sum);
    }
}

//OUTPUT
/*
Enter num[0] : 2
Enter num[1] : 5.6
Enter num[2] : 8.9087
Enter num[3] : 7.8
Enter num[4] : 76
Total sum of the given float number = 100.3087
 */
