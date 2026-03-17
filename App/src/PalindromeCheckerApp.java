class PalindromeChecker {
    boolean checkPalindrome(String input) {
        String str = input.replaceAll("\\s+", "").toLowerCase();
        return check(str, 0, str.length() - 1);
    }

    private boolean check(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return check(str, start + 1, end - 1);
    }
}

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "racecar";

        PalindromeChecker obj = new PalindromeChecker();
        boolean result = obj.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + result);
    }
}