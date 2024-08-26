import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KeywordChecker {
    public static void main(String[] args) {
        // List of all Java keywords
        String[] keywordsArray = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", 
            "class", "const", "continue", "default", "do", "double", "else", "enum", 
            "extends", "final", "finally", "float", "for", "goto", "if", "implements", 
            "import", "instanceof", "int", "interface", "long", "native", "new", 
            "package", "private", "protected", "public", "return", "short", "static", 
            "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", 
            "transient", "try", "void", "volatile", "while"
        };

        // Convert the array to a set for faster lookup
        Set<String> keywordsSet = new HashSet<>(Arrays.asList(keywordsArray));

        // Take input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string is a Java keyword
        if (keywordsSet.contains(input)) {
            System.out.println("The string is a Java keyword.");
        } else {
            System.out.println("The string is not a Java keyword.");
        }

        scanner.close();
    }
}
