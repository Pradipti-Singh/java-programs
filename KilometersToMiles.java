import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the kilometer value:");
        Scanner sc = new Scanner(System.in);
        float km = sc.nextFloat();
        System.out.println("Kilometer value = "+km);
        float ml = (float) (km * 0.621371);
        System.out.println("The converted value of given value is "+ml+" miles.");
    }
}
