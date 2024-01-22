package GuesserGame;

import java.util.Scanner;

class Guesser{

    int numGuess;
    public int guessNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess a number");
        numGuess=sc.nextInt();
        return numGuess;

}

}
class Player1{
    int playNum;
    public int getPlayNum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player 1 kindly guess a number");
        playNum=sc.nextInt();
        return playNum;

    }

}

class Player2{
    int playNum;
    public int getPlayNum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player 2 kindly guess a number");
        playNum=sc.nextInt();
        return playNum;

    }

}
class Player3{
    int playNum;
    public int getPlayNum(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player 3 kindly guess a number");
        playNum=sc.nextInt();
        return playNum;

    }

}


class Umpair{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    public void collectNumGuesser() {

        Guesser g = new Guesser();
        numFromGuesser = g.guessNumber();
    }
    public void collectNumPlayer(){

        Player1 p1 = new Player1();
        Player2 p2 = new Player2();
        Player3 p3 = new Player3();

        numFromPlayer1 =p1.getPlayNum();
        numFromPlayer2 =p2.getPlayNum();
        numFromPlayer3 =p3.getPlayNum();


        }

    public void compare(){
        if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3 ){

            System.out.println("All Players Won The Game");
        }
        else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2){
            System.out.println("Players 1 and 2 Won The Game");
        }
        else if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
            System.out.println("Players 2 and 3 Won The Game");
        }
        else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3){
            System.out.println("Players 1 and 3 Won The Game");
        }
        else if (numFromGuesser == numFromPlayer1){
            System.out.println("Winner is Player 1");

        }
        else if (numFromGuesser == numFromPlayer2){
            System.out.println("Winner is Player 2");

        }
        else if (numFromGuesser == numFromPlayer3){
            System.out.println("Winner is Player 3");

        }
        else {
            System.out.println("Game Lost! Try again....");
        }
    }
}





public class GuesserGame {

public static void main (String[] args){

Umpair um = new Umpair();
um.collectNumGuesser();
um.collectNumPlayer();
um.compare();




   }

}
