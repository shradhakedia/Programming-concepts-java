package Extra;


//Create a class Game, which allows a user to play "Guess the Number" game once.
//        Game should have the following methods:
//        Constructor to generate the random number
//        takeUserInput() to take a user input of number
//        isCorrectNumber() to detect whether the number entered by the user is true
//        getter and setter for noOfGuesses
//        Use properties such as noOfGuesses(int), etc to get this task done!


import java.util.Random;
import java.util.Scanner;

public class Game {
    int num;
    int inp;
    int guess;
    Game(){
        Random r = new Random();
        num = r.nextInt(51);

    }
    void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        inp=sc.nextInt();
    }
     boolean isCorrectNumber(){
        if(inp==num)
            return true;
        if(inp<num){
            System.out.println("Enter a greater no.");
        }
        else {
            System.out.println("Enter a smaller no.");
        }
        return false;
     }
     void setNoOfGuesses(){
        guess=1;
     }
     int getNoOfGuesses(){
        while(!isCorrectNumber()){
            guess++;
            takeUserInput();
        }
        return guess;
     }

    public static void main(String[] args) {
        Game g = new Game();
        g.setNoOfGuesses();
        g.takeUserInput();
        int guess=g.getNoOfGuesses();
        System.out.println("No. of guesses you took: "+guess);
    }
}
