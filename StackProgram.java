import java.util.Stack;

public class StackProgram {
    public static void main(String[] args) {
        Stack<String> studentNames = new Stack<>();
        studentNames.push("Alice");
        studentNames.push("Bob");
        studentNames.push("Charlie");
        studentNames.push("David");
        studentNames.push("Eve");
        System.out.println("Initial stack: " + studentNames);
        String poppedName = studentNames.pop();
        System.out.println("Popped name: " + poppedName);
        System.out.println("Remaining stack: " + studentNames);
    }
}