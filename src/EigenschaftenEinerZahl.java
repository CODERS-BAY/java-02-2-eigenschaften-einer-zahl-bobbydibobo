import java.util.Random;
import java.util.Scanner;

public class EigenschaftenEinerZahl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 100!");
        int chosenNumber = scanner.nextInt();

        Random rnd = new Random();
        int upperbound = 101;
        int luckyNumber = rnd.nextInt(upperbound);

        System.out.println("The lucky number is: " + luckyNumber);

        String roundNum = "Your number is round!";
        String evenNum = "Your number is even!";
        String luckyMatch = "Congrats you picked the lucky number!";
        String twoDigits = "Your number has two digits!";

        if (chosenNumber == luckyNumber){
            System.out.println(luckyMatch);
        }

        if (chosenNumber % 10 == 0){
            System.out.println(roundNum);
        }

        if (chosenNumber % 2 == 0){
            System.out.println(evenNum);
        }

        if (10 <= chosenNumber && chosenNumber < 100){
            System.out.println(twoDigits);
        }

    }

}
