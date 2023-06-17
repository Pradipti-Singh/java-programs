public class Array {
    public static void main(String[] args) {
        //Array is a collection of similar types of data.
        //Array indices starts from 0 and goes till(n-1) where n is the size of the array
        // There are three main  ways to create an array in java

        //1st - Declaration then memory allocation
        int[] marks ; // declaration
        marks = new int[5]; // memory allocation
        marks[0]=100;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=56;
        System.out.println(marks[2]);

        //2nd - Declaration and memory allocation
        int[] marks1= new int[5];
        marks1[0]=100;
        marks1[1]=20;
        marks1[2]=30;
        marks1[3]=40;
        marks1[4]=56;
        //marks1[5]=70; - throws an error
        System.out.println(marks[2]);
        //System.out.println(marks1[5]); - cannot print as the memory allocated is only 5 and 6th element cannot be included

        // 3rd - Declaration , memory allocation and initialization together
        int[] marks2 ={100,20,30,40,56};
        System.out.println(marks2[2]);


    }
}

//OUTPUT
/*
30
30
30
 */
