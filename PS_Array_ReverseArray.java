//PROBLEM: Write a java program to reverse an array.


import java.util.Scanner;

public class PS_Array_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array: ");
        int []array = new int[5];
        for(int i=0;i<5;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Reversed array :");
        for(int j=4;j>=0;j--){
            System.out.println(array[j]+" ");

        }
    }
}

//OUTPUT
/*
Enter the array:
1
2
3
4
5
Reversed array :
5
4
3
2
1
 */
