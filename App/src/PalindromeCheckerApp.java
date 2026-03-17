public class PalindromeCheckerApp {

    static boolean check(String str, int start, int end) {
        if (start >= end)
            return true;

        if (str.charAt(start) != str.charAt(end))
            return false;

        return check(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        if (check(normalized, 0, normalized.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}