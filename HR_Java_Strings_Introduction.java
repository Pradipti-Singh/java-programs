/*
This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"
The elements of a String are called characters. The number of characters in a String is called the length, and it can be retrieved with the String.length() method.

Given two strings of lowercase English letters,  and , perform the following operations:

Sum the lengths of A and B.
Determine if  is lexicographically A larger than B (i.e.: does  come before  in the dictionary?).
Capitalize the first letter in A and B and print them on a single line, separated by a space.
Input Format

The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

Output Format

There are three lines of output:
For the first line, sum the lengths of A and B.
For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.

Sample Input 0

hello
java
Sample Output 0

9
No
Hello Java
Explanation 0

String A is "hello" and B is "java".

 has a length of A, and B has a length of ; the sum of their lengths is 9.
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java".
*/

//CODE
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int la = A.length();
        int lb = B.length();
        int sum = la + lb;
        System.out.println(sum); 
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }      
        else{
            System.out.println("No");
        }
        System.out.print( A.substring(0,1).toUpperCase() + A.substring(1)+" "+ B.substring(0,1).toUpperCase() + B.substring(1));

        
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



