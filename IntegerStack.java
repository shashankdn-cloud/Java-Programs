import java.util.*;

public class IntegerStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            stack.push(i);
        }
        System.out.println("Stack elements: " + stack);
        System.out.println("Top element using peek(): " + stack.peek());
    }
}