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
