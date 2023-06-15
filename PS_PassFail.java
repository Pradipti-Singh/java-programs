import java.util.Scanner;

public class PS_PassFail {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks in Physics");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in Chemistry");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3;
        System.out.println("Your obtained percentage is "+avg);

        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation, You are Qualified.");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}

//OUTPUT 1
/*
Enter your marks in Physics
33
Enter your marks in Chemistry
33
Enter your marks in Maths
33
Your obtained percentage is 33.0
You are not eligible
 */

//OUTPUT 2
/*
Enter your marks in Physics
56
Enter your marks in Chemistry
79
Enter your marks in Maths
90
Your obtained percentage is 75.0
Congratulation, You are Qualified.
 */
