import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        //String is treated like class in java
        //In java there is special support of java
        //that's why you can use it like primitive datatype
        //Strings are immutable - cannot be change

        //1st way
        String name = new String("Pradipti");
        System.out.println(name);

        //2nd way
        String name1 = "Pradipti Singh";
        System.out.println(name1);

        //Taking input
        Scanner sc = new Scanner(System.in);
        System.out.print("Taking input from the user:");
        String st = sc.nextLine();
        System.out.println(st);
    }
}

//OUTPUT
/*
Pradipti
Pradipti Singh
Taking input from the user:Pradipti is good girl.
Pradipti is good girl.
 */
