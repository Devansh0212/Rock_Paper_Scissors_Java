import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileNotFoundException;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();
        System.out.println("Hello, " + name);

        int userScore = getUserScore(name);
        System.out.println("Your rating: " + userScore);

        boolean b = true;
        while (b) {
            String input = scanner.next();
            if (input.equals("!exit")) {
                System.out.println("Bye!");
                b = false;
            } else if (input.equals("!rating")) {
                System.out.println("Your rating: " + userScore);
            } else if (input.equals("scissors") || input.equals("rock") || input.equals("paper")) {
                String[] options = {"scissors", "rock", "paper"};
                Random random = new Random();
                int randomIndex = random.nextInt(options.length);
                String computerOption = options[randomIndex];

                if (input.equals(computerOption)) {
                    System.out.println("There is a draw (" + computerOption + ")");
                    userScore += 50;
                } else if ((input.equals("scissors") && computerOption.equals("rock"))
                        || (input.equals("rock") && computerOption.equals("paper"))
                        || (input.equals("paper") && computerOption.equals("scissors"))) {
                    System.out.println("Sorry, but the computer chose " + computerOption);
                } else {
                    System.out.println("Well done. The computer chose " + computerOption + " and failed");
                    userScore += 100;
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    private static int getUserScore(String name) {

        try {
            File file = new File("rating.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts[0].equals(name)) {
                    return Integer.parseInt(parts[1]);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
