import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        int scoreUI=0;
        int scoreCI=0;

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("WELCOME TO ROCK - PAPER - SCISSOR GAME");
        System.out.println("Some info:\n 0 - Rock \n 1 - Paper \n 2 - Scissor");


        while(true){
            System.out.print("Player : ");
            int uI = sc.nextInt();

            int cI = ran.nextInt(3);
            System.out.println("Computer: "+cI);

            if(uI==cI){
                System.out.println("Draw");
            }
            else if(uI==1 && cI==0 || uI==0 && cI==2 || uI==2 && cI==1 ){
                scoreUI += 1;
                System.out.println("You got a point!");
            }
            else if(uI>2){
                System.out.println("Default input");
                break;
            }
            else {
                scoreCI += 1;
                System.out.println("Computer got 1 point!");
            }
        }
        System.out.println("Your score: "+scoreUI);
        System.out.println("Computer's score: "+scoreCI);

        if(scoreUI>scoreCI){
            System.out.println("You WIN!");
        }
        else{
            System.out.println("Computer WIN!");
        }
        System.out.println("Hope you enjoy it");
    }
}

//OUTPUT
/*
WELCOME TO ROCK - PAPER - SCISSOR GAME
Some info:
 0 - Rock
 1 - Paper
 2 - Scissor
Player : 0
Computer: 1
Computer got 1 point!
Player : 1
Computer: 0
You got a point!
Player : 0
Computer: 0
Draw
Player : 1
Computer: 1
Draw
Player : 0
Computer: 0
Draw
Player : 2
Computer: 0
Computer got 1 point!
Player : 1
Computer: 1
Draw
Player : 3
Computer: 2
Default input
Computer WIN!
Hope you enjoy it
 */