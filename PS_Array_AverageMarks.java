//PROBLEM: Calculate the average marks from an array containing marks of all students in physics using for-each loop.

public class PS_Array_AverageMarks {
    public static void main(String[] args) {
        float[] marks = {89, 99, 70, 95, 80};
        float avg = 0;
        for (float element : marks) {
            avg += element;
        }
        System.out.printf("Average marks = %f", avg / marks.length);

    }
}

//OUTPUT
//Average marks = 86.599998



/*
  #ANOTHER WAY
         for(int i=0;i < marks.length;i++){
            avg += marks[i];
        }
        System.out.printf("Average marks = %f",avg/marks.length);

        //OUTPUT
        Average marks = 86.599998
*/