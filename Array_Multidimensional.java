public class Array_Multidimensional {
    public static void main(String[] args) {
        int [][] flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;

        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){ //flat[i].length represents length of that flats array
                System.out.print(flats[i][j]);
                System.out.print(" "); // space will be printed after every flat[i][j]
            }
            System.out.println(""); // this used to send the command to next line(after printing 1st row)
        }




    }
}


//Multidimensional Arrays - are array of arrays.Each element of a M-D array is an array itself .
//int [] marks = new int[]; - 1-D array
//int [][] flats = new int[][]; - 2-D array
/*
  2-D array can be visualised as follows:
                [0]      [1]       [2]
               col1      col2      col3
    [0] Row1   (0,0)     (0,1)    (0,2)
    [1] Row2   (1,0)     (1,1)    (1,2)

 */
//3-D array - String [][][]arr = new String[2][3][4];

//OUTPUT
/*
101 102 103
201 202 203
 */