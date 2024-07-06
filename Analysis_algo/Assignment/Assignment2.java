import java.util.ArrayDeque;
import java.util.Deque;

class Tester {

    public static Deque<Character> updateStack(Deque<Character> inputStack) {
        if (inputStack.size() < 3) {
            // Not enough elements to update, return the original stack
            return inputStack;
        }

        // Create a temporary stack to hold the bottom three elements
        Deque<Character> tempStack = new ArrayDeque<>();
        for (int i = 0; i < 3; i++) {
            tempStack.push(inputStack.pollLast());
        }

        // Add the elements from tempStack back to the inputStack
        while (!tempStack.isEmpty()) {
            inputStack.push(tempStack.pop());
        }

        return inputStack;
    }

    public static void main(String[] args) {
        Deque<Character> inputStack = new ArrayDeque<>();
        inputStack.push('E');
        inputStack.push('D');
        inputStack.push('C');
        inputStack.push('B');
        inputStack.push('A');

        Deque<Character> resultStack = updateStack(inputStack);

        System.out.println("The alphabets in the updated stack are:");
        for (Character alphabet : resultStack) {
            System.out.println(alphabet);
        }
    }
}
