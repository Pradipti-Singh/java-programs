public class Methods {
    static int logic(int x,int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else{
            z=(x+y)*5;
        }
        //x=556;
        return z;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = logic(a,b);
        System.out.printf("a = %d\nb = %d\n",a,b);
        System.out.println(c);

        int a1 = 5;
        int b1 = 2;
        int c1 = logic(a1,b1);
        System.out.printf("a = %d\nb = %d\n",a1,b1);
        System.out.println(c1);



    }

}


//OUTPUT
/*
a = 3
b = 3
30
a = 5
b = 2
7
 */

/*
#EXPLANATION:

*METHOD : A method is a function written inside a class.
       -> Since java is an object-oriented language,we need to write the method
          inside the same class

          SYNTAX :
                  datatype name(){
                        //Method body
                       }
*CALLING A METHOD:
-> A method can be called by creating an object of the class in which the method exists followed
   by  the method call.

   Calc obj = new calc(); ->object creation
        obj.mySum(a,b);  -> method will upon an object

    ->IN EXECUTED CODE:(used when static is not present in method)
            Methods obj = new Methods();
            c = obj.logic(a,b);

 #Stactic is  in the method because it's present in main class as it will
  common method and anywhere can be used whereas without static we have to
  create object whenever we are using

#logic(a,b): the value of a and b will be assigned to the x and y and the method will
             perform its task and return the result .
          ->The value from the method call(a and b) are copied to the a and b
            of the function logic.
            Thus,even if we modify the values a and b inside the method, the value
            in the main method will remain same .
            ex: x=556 in the program

 */

