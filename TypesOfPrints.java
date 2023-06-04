public class TypesOfPrints {
    public static void main(String[] args) {
        int a = 2;
        float b = 5.9877f;
        System.out.print("The two values are ");
        System.out.println("2 and 5.9877");
        System.out.printf("The two values are %d and %f", a,b);
        System.out.println("");
        System.out.format("The two values are %d and %f", a,b);
        System.out.printf("The two values are %d and %8.2f", a,b); //8 = total 8 spaces & .2 = 2 numbers to be selected after decimal


    }
}

//OUTPUT
/*
The two values are 2 and 5.9877
The two values are 2 and 5.987700
The two values are 2 and 5.987700
The two values are 2 and 5.987700The two values are 2 and     5.99
 */
