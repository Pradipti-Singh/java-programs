import java.sql.SQLOutput;

public class Break_Continue {
    public static void main(String[] args) {
        //BREAK
        System.out.println("Break- For loop");
        for (int i=0;i<50;i++){
            System.out.println(i);
            System.out.println("Java is good");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        //BREAK - IN WHILE LOOP
        System.out.println("");
        System.out.println("Break - while loop");
        int j = 0;
        while(j<5){
            System.out.println(j);
            System.out.println("Java is a language");
            if(j==2) {
                System.out.println("Ending the loop");
                break;
            }
            j++;
        }
        System.out.println("loops end here");

        //BREAK-DO WHILE
        System.out.println("");
        System.out.println("Break-do while");
        int k = 0;
        do{
            k++;
            if(k==2){
                System.out.println("Ending the loop");
                break;
            }
            System.out.println(k);
            System.out.println("Java is great");

        }while(k<5);
        System.out.println("Loop ends here");

        //CONTINUE- FOR LOOP
        System.out.println("");
        System.out.println("Continue - For");
        for (int i=0;i<50;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is good");
        }

        //CONTINUE - WHILE
        System.out.println("");
        System.out.println("Continue - while loop");
        int m = 0;
        while(m<5){
            m++;
            if(m==2) {
                System.out.println("Ending the loop");
                continue;
            }
        }
        System.out.println(m);
        System.out.println("Java is a language");
        System.out.println("loops end here");


        //CONTINUE- DO WHILE
        System.out.println("");
        System.out.println("Continue - Do While");
        int l = 0;
        do{
            l++;
            if(l==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(l);
            System.out.println("Java is great");

        }while(l<5);
        System.out.println("Loop ends here");

    }

}

//OUTPUT
/*
Break- For loop
0
Java is good
1
Java is good
2
Java is good
Ending the loop

Break - while loop
0
Java is a language
1
Java is a language
2
Java is a language
Ending the loop
loops end here

Break-do while
1
Java is great
Ending the loop
Loop ends here

Continue - For
0
Java is good
1
Java is good
Ending the loop
3
Java is good
4
Java is good
5
Java is good
6
Java is good
7
Java is good
8
Java is good
9
Java is good
10
Java is good
11
Java is good
12
Java is good
13
Java is good
14
Java is good
15
Java is good
16
Java is good
17
Java is good
18
Java is good
19
Java is good
20
Java is good
21
Java is good
22
Java is good
23
Java is good
24
Java is good
25
Java is good
26
Java is good
27
Java is good
28
Java is good
29
Java is good
30
Java is good
31
Java is good
32
Java is good
33
Java is good
34
Java is good
35
Java is good
36
Java is good
37
Java is good
38
Java is good
39
Java is good
40
Java is good
41
Java is good
42
Java is good
43
Java is good
44
Java is good
45
Java is good
46
Java is good
47
Java is good
48
Java is good
49
Java is good

Break - while loop
Ending the loop
5
Java is a language
loops end here

Continue - Do While
1
Java is great
Ending the loop
3
Java is great
4
Java is great
5
Java is great
Loop ends here



 */