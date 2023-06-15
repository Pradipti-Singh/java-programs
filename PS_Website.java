import java.util.Scanner;

public class PS_Website {
    public static void main(String[] args) {
        System.out.println("Enter the website:");
        Scanner sc = new Scanner(System.in);
        String Website = sc.nextLine();

        if(Website.endsWith(".com")){
            System.out.println("Commercial Website");
        }
        else if(Website.endsWith(".org")){
            System.out.println("Organization Website");
        }
        else if(Website.endsWith(".in")){
            System.out.println("Indian Website");
        }
        else{
            System.out.println("Unknown Website");
        }
    }
}

//OUTPUT 1
/*
Enter the website:
abcdef.com
Commercial Website
 */

//OUTPUT 2
/*
Enter the website:
abcd.org
Organization Website
 */

//OUTPUT 3
/*
Enter the website:
abcd.in
Indian Website
 */

//OUTPUT 4
/*
Enter the website:
abcd.mdn
Unknown Website
 */