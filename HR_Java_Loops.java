/*
Objective
In this challenge, we're going to use loops to help us do some simple math.

Task
Given an integer,N , print its first 10 multiples. Each multiple N*i (where 1<=i<=10 ) should be printed on a new line in the form: N x i = result.

Input Format

A single integer,N.

Constraints
2<=N<=20
Output Format

Print 10 lines of output; each line i (where i) contains the result N x i of  in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/

//CODE
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int mul = n*i;
            System.out.printf("%d x %d = %d\n",n,i,mul);
        }
    }
}
