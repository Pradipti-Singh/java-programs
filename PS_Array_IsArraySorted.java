public class PS_Array_IsArraySorted {
    public static void main(String[] args) {
        int [] arr = {5,67,98,677,86};
        boolean isSorted = true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
               isSorted = false;
               break;
            }
        }
        if(isSorted){
            System.out.println("The array is Sorted.");
        }
        else{
            System.out.println("The array is not sorted.");
        }
    }
}

//OUTPUT
/*
The array is not sorted.
 */
