public class PS_Array_FindMaxElement {
    public static void main(String[] args) {
        int [] arr ={1,21,3,455,5,34,67};
        int max = 0;
        for(int e : arr){
            if(e>max){
                max = e;
            }
        }
        System.out.println("The maximum array is : "+max);

    }


}

//OUTPUT
/*
The maximum array is : 455
 */