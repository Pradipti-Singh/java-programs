public class Methods1 {
    static void tellJoke(){
        System.out.println("Why was six afraid of seven?\n" +
                            "Because 7-8-9.");
    }

    static void change(int a){
        a=0;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }

    public static void main(String[] args) {
        tellJoke();

        System.out.println("Changing the Integer:");
        int [] marks = {89,90,78,98,68};
        int x = 45;
        change(x);
        System.out.println(x);

        System.out.println("Changing the integer in an array:");
        change2(marks);
        System.out.println("Array:at marks[0] = "+marks[0]);




    }
}

//OUTPUT
/*

Why was six afraid of seven?
Because 7-8-9.
Changing the Integer:
45
Changing the integer in an array:
Array:at marks[0] = 98

 */
