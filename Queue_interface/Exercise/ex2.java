import java.util.Deque;
import java.util.ArrayDeque;

class Tester {
    
    public static Deque<Integer> changeSmallest(Deque<Integer> inputStack) {
        if (inputStack.isEmpty()) {
            return inputStack; // Nothing to modify
        }

        int smallest = Integer.MAX_VALUE;
        Deque<Integer> tempStack = new ArrayDeque<>();

        // Find the smallest value and push other elements to tempStack
        while (!inputStack.isEmpty()) {
            int value = inputStack.pop();
            smallest = Math.min(smallest, value);
            tempStack.push(value);
        }

        // Push the smallest value to the bottom of the stack
        while (!tempStack.isEmpty()) {
            int value = tempStack.pop();
            if (value != smallest) {
                inputStack.push(value);
            }
        }
        inputStack.push(smallest);

        return inputStack;
    }

    public static void main(String[] args) {
        Deque<Integer> inputStack = new ArrayDeque<>();
        inputStack.push(10);
        inputStack.push(8);
        inputStack.push(5);
        inputStack.push(12);
        inputStack.push(5);
        
        Deque<Integer> updatedStack = changeSmallest(inputStack);
        
        System.out.println("Stack After Modification:");
        for (Integer value : updatedStack) {
            System.out.println(value);
        }
    }
}
