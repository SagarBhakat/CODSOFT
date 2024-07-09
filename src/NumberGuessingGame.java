import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing game.");
        Scanner input = new Scanner(System.in);
        int number;

        number =(int) Math.ceil(100*(Math.random()));
        int guess;
        int result;



        do{
            System.out.print("Guess number  : ");
            guess = input.nextInt();
            result = guess-number;
            if(result>0){
                System.out.println("Guess Lower");
            }else if(result<0){
                System.out.println("Guess Higher");
            }


        }while(number!=guess);
        System.out.println("Congrats,You have guessed correctly");

    }
}