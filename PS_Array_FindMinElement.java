public class PS_Array_FindMinElement {
    public static void main(String[] args) {
        int [] arr = {5,67,98,677,86};
        int min = Integer.MAX_VALUE;
        for(int e : arr){
            if(e<min){
                min = e;
            }
        }
        System.out.println("The Minimum value is : "+min);
    }
}

//OUTPUT
/*
The Minimum value is : 5
 */
