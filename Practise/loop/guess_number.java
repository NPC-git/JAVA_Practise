package prcatise;
/*PC gets a random number from 1-100,guess it,
     it will be true if guess incorrectly six times in a row*/


import java.util.Random;
import java.util.Scanner;

public class guess_number {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("enter a number from 1 to 100");
            int guess = sc.nextInt();

            count ++;
            if(count == 6){
                System.out.println("right");
                break;
            }

            if (guess > number) {
                System.out.println("number is too high");
            } else if(guess < number){
                System.out.println("number is too low");
            }else{
                System.out.println("you are right");
            }
        }













    }
        }














