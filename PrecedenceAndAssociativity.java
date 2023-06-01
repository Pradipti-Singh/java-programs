public class PrecedenceAndAssociativity {
    public static void main(String[] args) {
        //Precedence & Associativity
        int a1 = 6*5-34/2;
        System.out.println(a1);
        /*
        Highest precedence goes to * and /.
        They are evaluated on the basis of left to right associativity.
        =30-34/2
        =30-17
        =13
         */
        int b1 = 60/5-2*4 ;
        System.out.println(b1);
        /*
        =12-2*4
        =12-8
        =4
         */
        //QUICK QUIZ
        //1.(x-y)/2
        int x = 2;
        int y = 4;
        int c1 = (x-y)/2;
        System.out.println(c1);
        /*
        Here parenthesis has higher precedence than / .
        So first parenthesis will be evaluated.
        =(2-4)/2
        =-2/2
        =-1
         */

        //2.(b^2-4ac)/2a
        int a = 2;
        int b = 5;
        int c = 1;
        int d1 = (b*b-4*a*c)/2*a;
        System.out.println(d1);

        //.v^2-u^2
        int v = 2;
        int u = 1;
        int e1 = v*v-u*u;
        System.out.println(e1);
        
        //Practice set - Q. 7/4*9/2
        float a3 = 7/4.0f*9/2.0f;
        System.out.println(a3);

   }
}

//OUTPUT
/*

13
4
-1
16
3
7.875
*/
