public class ProblemSet_Strings {
    public static void main(String[] args) {
        //Problem1
        String name = "Pradipti Singh";
        System.out.println(name.toLowerCase());

        //Problem2-replace space with "_"
        String text = "Pradipti Singh";
        System.out.println(text.replace(" ","_"));

        //Problem3- letter = "Dear <|name|>, Thanks a lot"
        String letter =  "Dear <|name|>, Thanks a lot";
        System.out.println(letter.replace("<|name|>","Radha"));

        //Problem4 - detect double and triple spaces in a string
        String myString = "Today is a     beautiful day";
        String myString1 = "Today is a beautiful day";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        System.out.println(myString1.indexOf("  "));
        System.out.println(myString1.indexOf("   "));

        //Problem5 - write the following format using escape sequence character in letter format
        System.out.println("Dear Pradipti,\n\tThis Java course is nice.\n\tThanks");
    }
}

//OUTPUT
/*
10
10
-1
-1
Dear Pradipti,
	This Java course is nice.
	Thanks
 */
