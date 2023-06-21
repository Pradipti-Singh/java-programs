public class PS_Methods_Pattern1 {
    static void pattern1(int n){
        for( int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
    public static void main(String[] args) {
        pattern1(4);


    }
}

//OUTPUT
/*

 *
 **
 ***
 ****

 */
