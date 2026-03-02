public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "madam";
        char[] ch = str.toCharArray();

        int start = 0;
        int end = ch.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (ch[start] != ch[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }
    }
}