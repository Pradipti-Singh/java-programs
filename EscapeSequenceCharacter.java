public class EscapeSequenceCharacter {
    public static void main(String[] args) {
        System.out.println("Pradipti is a \" CSE \" student");
        System.out.println("Your domain is: Java \\ Python");
        System.out.println("Pradipti\nSingh");
        System.out.println("Pradipti\tSingh");
        System.out.println("Pradipti\fSingh");
        System.out.println("Pradipti\rSingh");
        System.out.println("Pradipti\bSingh");
    }
}
/*
\t	Insert a tab in the text at this point.
\b	Insert a backspace in the text at this point.
\n	Insert a newline in the text at this point.
\r	Insert a carriage return in the text at this point.
\f	Insert a form feed in the text at this point.
\'	Insert a single quote character in the text at this point.
\"	Insert a double quote character in the text at this point.
\\	Insert a backslash character in the text at this point.
 */

//OUTPUT
/*
Pradipti is a " CSE " student
Your domain is: Java \ Python
Pradipti
Singh
Pradipti	Singh
PradiptiSingh
Singh
PradiptSingh
 */

