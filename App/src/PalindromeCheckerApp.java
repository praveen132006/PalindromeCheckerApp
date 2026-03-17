interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : str.toCharArray())
            stack.push(c);

        for (char c : str.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

class PalindromeChecker {
    private PalindromeStrategy strategy;

    PalindromeChecker(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    boolean checkPalindrome(String input) {
        return strategy.check(input);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        PalindromeChecker checker = new PalindromeChecker(strategy);

        boolean result = checker.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}