public class Operators {
    public static void main(String[] args) {
        //AND operator - both the condition needs to be true
        boolean a = true;
        boolean b = false;
        System.out.println("For AND operator:");
        if(a&&b){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        boolean c = false;
        boolean d = false;
        if(c&&d){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        boolean e = true;
        boolean f = true;
        if(e&&f){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(a&&b&&c){ //left-to-right associativity
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //OR operator
        System.out.println("For OR operator:");
        if(a||b){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

        if(c||d){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        if(e||f){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(a||b||c){ //left-to-right associativity
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        if(a&&b||c){ //left-to-right
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        //NOT operator
        System.out.println("For NOT operator:");
        System.out.println("NOT(A) is " + !a);
        System.out.println("NOT(B) is " + !b);
    }
}

//OUTPUT
/*
For AND operator:
No
No
Yes
No
For OR operator:
yes
No
Yes
Yes
No
For NOT operator:
NOT(A) is false
NOT(B) is true
 */
