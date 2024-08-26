public class ConstantStringChecker {
    public static void main(String[] args) {
        String input = "aaaaa";
        boolean isConstant = isStringConstant(input);
        
        if (isConstant) {
            System.out.println("The string is constant.");
        } else {
            System.out.println("The string is not constant.");
        }
    }

    public static boolean isStringConstant(String str) {
        if (str == null || str.isEmpty()) {
            return false; 
        }

        char firstChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }
}
