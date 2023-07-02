import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us=NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india=NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(payment);
        String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
//OUTPUT
/*
Input (stdin)
12324.134

Your Output (stdout)
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

Expected Output
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €
*/
