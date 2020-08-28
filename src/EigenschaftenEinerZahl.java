import java.util.Random;
import java.util.Scanner;

public class EigenschaftenEinerZahl {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number between 1 and 100!");
        int luckyNumber = scanner.nextInt();

        Random rnd = new Random();
        int upperbound = 101;
        int randomNumber = rnd.nextInt(upperbound);

        System.out.println("The lucky number is: " + randomNumber);

        String roundNum = "Your number is round!";
        String evenNum = "Your number is even!";
        String luckyMatch = "Congrats you picked the lucky number!";
        String twoDigits = "Your number has two digits!";

        if (luckyNumber == randomNumber) {
            System.out.println(luckyMatch);
        } else if (luckyNumber % 10 == 0 && luckyNumber % 2 == 0 && luckyNumber > 10 && luckyNumber < 100) {
            System.out.printf("%n%s & %s & %s", roundNum, evenNum, twoDigits);
        } else if (luckyNumber % 2 == 0 && luckyNumber > 10 && luckyNumber < 100) {
            System.out.printf("%n%s %s", evenNum, twoDigits);
        } else if (luckyNumber % 2 == 0) {
            System.out.println(evenNum);
        } else if (luckyNumber > 10 && luckyNumber < 100) {
            System.out.println(twoDigits);
        }

    }

}
