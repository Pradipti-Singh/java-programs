import java.util.Scanner;

public class CbseBoardPercentagecalculator {
    public static void main(String[] args) {
        System.out.println("Enter total marks");
        Scanner sc = new Scanner(System.in);
        int tm = sc.nextInt();
        System.out.println("Enter Marks of the following subjects:");
        System.out.print("Maths = ");
        float m1 = sc.nextFloat();
        System.out.print("Science = ");
        float m2 = sc.nextFloat();
        System.out.print("Social Science = ");
        float m3 = sc.nextFloat();
        System.out.print("English = ");
        float m4 = sc.nextFloat();
        System.out.print("Hindi/ any other main subject = ");
        float m5 = sc.nextFloat();

        float sum = m1 + m2 + m3 + m4 + m5  ;
        System.out.print("Total marks obtained = ");
        System.out.println(sum);
        System.out.print("Total marks =  ");
        System.out.println(tm);
        float pt = (sum*100)/tm;
        System.out.print("Percentage obtained = ");
        System.out.print(pt);
        System.out.println("%");



    }
}

/*
OUTPUT
Enter total marks
500
Enter Marks of the following subjects:
Maths = 88
Science = 93
Social Science = 95
English = 93
Hindi/ any other main subject = 91
Total marks obtained = 460.0
Total marks =  500
Percentage obtained = 92.0%
*/
