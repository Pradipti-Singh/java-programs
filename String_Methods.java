import java.sql.SQLOutput;

public class String_Methods {
    public static void main(String[] args) {
        String name = "Pradipti";
        //original string is immutable

        //length() = returns length of the string name
        int value = name.length();
        System.out.println(value);

        //toLowerCase() = returns new string which has all the lowercase from the string name.
        String value1= name.toLowerCase();
        System.out.println(value1);

        //toUpperCase() = returns new string which has all the uppercase from the string name.
        String value2= name.toUpperCase();
        System.out.println(value2);
        System.out.println(name.toUpperCase()); //another way to write

        //trim() = returns a new string after receiving all the leading and trailing spaxes from the original string
        String nonTrimmed = "       SINGH      ";
        System.out.println(nonTrimmed);
        System.out.println(nonTrimmed.trim());

        //Substring(int start)= returns a substring from start to the end substring(3) returns "dipti", the index starts from 0
        System.out.println(name.substring(3)); // starts from the given index

        //Substring(int start , int end)= returns a substring from start(3)to thr end(3) returns "dipt"
        System.out.println(name.substring(3,7)); // end index is excluded from the output

        //replace(r,p) = returns a new string after replacing r with p.
        System.out.println(name.replace('i','e'));

        //startsWith()= returns true if the value starts with the given string .
        //endsWith() = returns true if name endes with given string.
        System.out.println(name.startsWith("Pra"));
        System.out.println(name.endsWith("Pra"));
        System.out.println(name.endsWith("pti"));

        //charAt() = returns character at a given index position
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));

        //indexOf() = returns the index of the given string
        System.out.println(name.indexOf("dip"));
        System.out.println(name.indexOf("i",5));
        System.out.println(name.lastIndexOf("pti"));
        System.out.println(name.lastIndexOf("i",5));

        //equals() = returns true if the given string is equal to "Pradipti"
        System.out.println(name.equals("Pradipti"));
        System.out.println(name.equals("singh"));

        //equalsIgnoreCase() = returns true if two strings are equal ignoring the case og characters.
        System.out.println(name.equalsIgnoreCase("pradipti"));
        System.out.println(name.equalsIgnoreCase("PRADIPTI"));
        System.out.println(name.equalsIgnoreCase("pRadipTI"));
        System.out.println(name.equalsIgnoreCase("pradiptisingh")); //can't add strings


    }
}

//OUTPUT
/*
8
pradipti
PRADIPTI
PRADIPTI
       SINGH
SINGH
dipti
dipt
Pradepte
true
false
true
P
r
a
3
7
5
4
true
false
true
true
true
false
 */
