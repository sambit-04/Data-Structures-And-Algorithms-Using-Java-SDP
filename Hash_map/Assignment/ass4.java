import java.util.LinkedList;
import java.util.List;

class Queue {
    private List<String> queue;
    private int maxSize;

    public Queue(int maxSize) {
        this.maxSize = maxSize;
        this.queue = new LinkedList<>();
    }

    public boolean enqueue(String data) {
        if (queue.size() < maxSize) {
            queue.add(data);
            return true;
        }
        return false;
    }

    public String dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0);
        }
        return null; // Or throw an exception
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public List<String> getQueue() {
        return queue;
    }
}

class Tester {

    public static void main(String args[]) {
        Queue queue = new Queue(5);

        queue.enqueue("Emily");
        queue.enqueue("Lily");
        queue.enqueue("Rachel");
        queue.enqueue("Rose");

        queue.dequeue();
        queue.dequeue();

        System.out.println("Current state of the queue:");
        System.out.println(queue.getQueue());
    }
}
