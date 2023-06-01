public class IncrementDecrementt {
    public static void main(String[] args) {
        System.out.println("For ++y:");
        int y = 7;
        int x = ++y; // here value of y will be incremented first then it will be assigned to x.
        System.out.println("x = "+x);
        int sum1 = x + 8 ;
        System.out.println("sum = "+sum1);
        System.out.println(" ");
        System.out.println("For y++:");
        int y1 = 7;
        int x1 = y1++; // here value of y1 will be first assigned to x1 then it will gwt incremented.
        System.out.println("x1 = "+x1);
        System.out.println("y1 = "+y1);// this shows after assigning the value of y1 to x1 , the value of y1 will get incremented
        int sum2 = x1 + 8 ;
        System.out.println("sum = "+sum2);
        System.out.println("");
        System.out.println("For char:");
        char ch = 'a';
        System.out.println(++ch); // char is incremented then assigned to ch.
        System.out.println(ch); // assigned value
        char ch1 = 'b';
        System.out.println(ch1++); // char value is assigned first then gets incremented.
        System.out.println(ch1);

    }
}

//OUTPUT
/*

For ++y:
x = 8
sum = 16
 
For y++:
x1 = 7
y1 = 8
sum = 15

For char:
b
b
b
c

*/
