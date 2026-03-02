import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String str = "ABC";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            queue.add(str.charAt(i));
            stack.push(str.charAt(i));
        }

        System.out.println("Queue (FIFO):");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }

        System.out.println();

        System.out.println("Stack (LIFO):");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}