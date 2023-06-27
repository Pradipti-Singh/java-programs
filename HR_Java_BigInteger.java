/*
In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

Use the power of Java's BigInteger class and solve this problem.

Input Format

There will be two lines containing two numbers, a and b.

Constraints

a and b are non-negative integers and can have maximum 200 digits.

Output Format

Output two lines. The first line should contain a+b , and the second line should contain a*b . Don't print any leading zeros.

Sample Input

1234
20
Sample Output

1254
24680
*/

//code
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        
    }
}

//Doubt and Explaination
/*
In the provided code, a.add(b) and a.multiply(b) are used instead of a + b and a * b because BigInteger is an immutable class in Java and
does not override the + and * operators for addition and multiplication.

Unlike primitive data types like int or long, BigInteger represents arbitrary-precision integers. It provides methods for performing
arithmetic operations on large integers without the risk of overflow or loss of precision.

To perform addition and multiplication on BigInteger objects, you need to use the corresponding methods provided by the class: add() for 
addition and multiply() for multiplication. These methods handle the arithmetic operations correctly for large integer values.

Therefore, in order to add BigInteger objects a and b, you should use a.add(b), and to multiply them, you should use a.multiply(b).
*/
