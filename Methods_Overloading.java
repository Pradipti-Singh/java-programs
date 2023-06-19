public class Methods_Overloading {
    static void hello(){
        System.out.println("Hello everyone!");
    }
    static void hello(int a){
        System.out.println("I am "+a);
    }
    static void hello(int a, int b){
        System.out.println(a+" is very famous in "+b);
    }
    public static void main(String[] args) {
        hello();
        hello(5);
        hello(2,6);
    }
}

//OUTPUT
/*
Hello everyone!
I am 5
2 is very famous in 6
 */
