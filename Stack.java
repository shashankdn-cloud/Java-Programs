import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        
        Stack<Integer> intStack = new stack<>:
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        intStack.push(4);
        intStack.push(5);

        System.out.println("Stack after pushing elements: " + intStack);
        if (!intStack.isEmpty()) {
            int topElement = intStack.peek();
            System.out.println("Top element of the stack (using peek()): " + topElement);
        } else {
            System.out.println("Stack is empty, cannot peek.");
        }
    }
}