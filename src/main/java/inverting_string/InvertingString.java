package inverting_string;

import java.util.Scanner;

public class InvertingString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the word: ");
        String entry = scanner.nextLine();
        String exit = "";

        for (int i = entry.length() - 1; i >= 0; i--) {
            exit += Character.toString(entry.charAt(i));
        }
        System.out.println(exit);
        scanner.close();
    }
}
