public class PalindromeCheckerApp {
    public static void main(String[] args) {
                String str = "madam";
                boolean isPalindrome = true;
                int length = str.length();
                for (int i = 0; i < length / 2; i++) {
                    if (str.charAt(i) != str.charAt(length - i - 1)) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    System.out.println("The string \"" + str + "\" is a Palindrome.");
                } else {
                    System.out.println("The string \"" + str + "\" is NOT a Palindrome.");
                }
            }
    }
