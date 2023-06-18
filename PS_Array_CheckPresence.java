//PROBLEM: Write a java program to find out whether a given integer is present in an array or not.

public class PS_Array_CheckPresence {
    public static void main(String[] args) {
        int [] array = {78,45,90,23,60};
        int find = 90;
        boolean isInArray = false;
        int arr = 0;
        for(int i=0;i<5;i++){
            if(array[i]==90){ //this will be checked only if it's correct
                isInArray = true; //this isInArray will be used outside the loop
                arr = i;
                break; // loop will get break //when only it is true it will be used otherwise not
            }

        }
        if(isInArray){
            System.out.printf("Found the array at array[%d]",arr);
        }
        else{
            System.out.println("Cannot find");
        }



    }
}

//OUTPUT
/*
Found the array at array[2]
 */



//DOUBT SOLUTION
/*
for(int i=0;i<5;i++){
    if(array[i]==90){
        System.out.Println("Found");
        break;
    }
    else{
         System.out.Println("Not Found");
    }

}

OUTPUT:
Not Found
Not Found
Found


->This cannot be used as everytime the loop will be executed it will print the else part until it does not find the
condition true.

for(int i=0;i<5;i++){
    if(array[i]==90){
        System.out.Println("Found");
        break;
    }

 OUTPUT:
 Found

 ->this will give the output but we want to show the one output regarding if the required data is not available.
 ->so this will not be suitable.

 #WHY WE WROTE THAT CODE:
 -> in that code the isInArray will be true only if the condition in the "if" condition is true.
 -> once the condition is true , isInArray will be assigned as true .
 -> then only the if(isInArray), it will execute as found otherwise else part will get executed.

 *DIFFERENCE:
 ->in the wrong code everytime when the condition is checked it will either print if part or else part for sure.
 ->we don't want the else part to get printed every time.
 ->so in the correct code when the loops will get over and isInArray cannot be found true then it will come out
   of the for loop and the as the isInArray remained false then it will print the else part of the program.
 */