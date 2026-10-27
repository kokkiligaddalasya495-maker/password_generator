
import java.util.Scanner;
import java.util.Random;

public class PasswordGenerator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter a number: ");
        String number = sc.nextLine();

        // Change letters randomly to uppercase or lowercase
        String newName = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (r.nextBoolean()) {
                newName = newName + Character.toUpperCase(ch);
            } else {
                newName = newName + Character.toLowerCase(ch);
            }
        }

        // Select a random symbol
        String symbols = "@#$%&*!?";
        char symbol = symbols.charAt(r.nextInt(symbols.length()));

        // Generate the password
        String password = newName + symbol + number;

        // Limit password to 15 characters
        if (password.length() > 15) {
            password = password.substring(0, 15);
        }

        System.out.println("Generated Password: " + password);

        sc.close();
    }
}
