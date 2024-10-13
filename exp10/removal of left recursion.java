import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the non-terminal
        System.out.println("Enter the non-terminal (e.g., A): ");
        String nonTerminal = scanner.nextLine();

        // Input the production without "A ->", just the rules like "Aα | β"
        System.out.println("Enter the production, e.g., Aα | β : ");
        String production = scanner.nextLine();

        // Split the production rules by '|'
        String[] rules = production.split("\\|");
        String alpha = ""; // For A -> Aα (recursive part)
        String beta = "";  // For A -> β (non-recursive part)

        for (String rule : rules) {
            rule = rule.trim();
            if (rule.startsWith(nonTerminal)) {
                alpha = rule.substring(nonTerminal.length()).trim();  // α part (recursive)
            } else {
                beta = rule.trim();  // β part (non-recursive)
            }
        }

        // New non-terminal for the transformed grammar
        String newNonTerminal = nonTerminal + "'";

        // Print the transformed grammar after removing left recursion
        System.out.println("The grammar after removing left recursion: ");
        System.out.println(nonTerminal + " → " + beta + newNonTerminal);
        System.out.println(newNonTerminal + " → " + alpha + newNonTerminal + " | ε");

        scanner.close();
    }
}
