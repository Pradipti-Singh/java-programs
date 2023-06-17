public class Array1 {
    public static void main(String[] args) {
        //Array length - Array has length property which gives the length of the array.

        //int
        System.out.println("For Int");
        int [] marks = {100,98,89,90,80};
        System.out.println(marks.length); // gives 5 if marks is a reference to array with 5 elements
        System.out.println(marks[2]);

        //float
        System.out.println("For float");
        float [] marks1 = {90.7f,80.8f,89.5f};
        System.out.println(marks1.length);
        System.out.println(marks1[1]);

        //String
        System.out.println("For String");
        String [] name ={"Ram","Priya","Rohit","Meera"};
        System.out.println(name.length);
        System.out.println(name[1]);

        //Displaying an array
        //Naive method
        System.out.println("Displaying all elements of array using naive method: ");
        int [] mark = {100,98,89,90,80};
        System.out.println(mark[0]);
        System.out.println(mark[1]);
        System.out.println(mark[2]);
        System.out.println(mark[3]);
        System.out.println(mark[4]);

        //For loop
        System.out.println("Displaying all elements of array using FOR loop method: ");
        int [] m = {100,98,89,90,80};
        for(int i=0;i<m.length;i++){ //m.lenth = 4 , array starts from 0 and ends on (n-1) thats why we used only "<"
            System.out.println(m[i]); // Array traversal
        }

        //program to print array elements in reverse order
        System.out.println("Program to print array elements in reverse order:");
        int [] m1 = {100,98,89,90,80};
        for(int j = m1.length-1; j>=0;j--){ //decrementing
            // (m1.lenth-1) is used because array starts from 0 and ends at (n-1)
            //so here length is 5 but the last array location is 4 thats why we dis 5-1 = 4
            //j>=0 because the starting arrays location is 0 so till zero it will process
            System.out.println(m1[j]);
        }

        //Displaying the Array(For-each loop)
        System.out.println("Displaying the Array(For-each loop)");
        int [] m2 = {100,98,89,90,80};
        for(int element:m2){  // it only print the elements and not the index
            System.out.println(element); //print all the elements
        }



    }
}

//OUTPUT
/*

For Int
5
89
For float
3
80.8
For String
4
Priya
Displaying all elements of array using naive method:
100
98
89
90
80
Displaying all elements of array using FOR loop method:
100
98
89
90
80
Program to print array elements in reverse order:
80
90
89
98
100
Displaying the Array(For-each loop)
100
98
89
90
80

*/
