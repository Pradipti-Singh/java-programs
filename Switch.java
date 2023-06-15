import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int age;
        char var;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age){
            case 16:
                System.out.println("You are under age");
                break;
            case 18:
                System.out.println("You are going to be adult");
                break;
            case 23:
                System.out.println("You are an adult");
            default:
                System.out.println("Live your life");
        }
        System.out.println("Thank you coming to my code");
    }

}

//OUTPUT
    /*
    18
    You are going to be adult
    Thank you coming to my code
     */

