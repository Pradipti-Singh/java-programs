import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>=18 && age<=60){
            System.out.println("Youth");
        }
        else if(age>60 && age<100){
            System.out.println("Senior citizen");
        }
        else if(age>100){
            System.out.println("Super senior citizen");
        }
        else if(age<18){
            System.out.println("kid");
        }
        else{
            System.out.println("input invalid");
        }

    }
}
