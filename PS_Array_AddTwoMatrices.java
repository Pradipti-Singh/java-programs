//PROBLEM: Create a java program to add two matrices of size 2*3.

public class PS_Array_AddTwoMatrices {
    public static void main(String[] args) {
        int [][] matrix1 ={{1,1,1},
                           {1,1,1}} ;

        int [][] matrix2 ={{2,2,2},
                           {2,2,2}} ;

        //SOLUTION 1
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                for(int a=0;a<matrix2.length;a++){
                    for(int b=0;b<matrix2[a].length;b++){
                       if(i==a && j==b){
                           int sum = matrix1[i][j]+matrix2[a][b];
                           System.out.print(sum+ " ");
                       }


                    }


                }

            }
            System.out.print("\n");
        }

        //SOLUTION 2
        System.out.println(" ");
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                int result= matrix1[i][j]+matrix2[i][j];
                System.out.print(result + " ");
            }
            System.out.println(" ");

        }




    }
}

//OUTPUT
/*
3 3 3
3 3 3

3 3 3
3 3 3

 */

