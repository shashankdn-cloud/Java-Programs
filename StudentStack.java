import java.util.*;

public class StudentStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Rahul");
        stack.push("Priya");
        stack.push("Kiran");
        stack.push("Sneha");
        stack.push("Amit");
        System.out.println("Initial Stack: " + stack);
        String removed = stack.pop();
        System.out.println("Popped name: " + removed);
        System.out.println("Remaining Stack: " + stack);
    }
}