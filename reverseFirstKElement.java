
package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class ReverseFirstKElements {
    public static void reverseFirstK(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k < 0) {
            throw new IllegalArgumentException("Invalid value of k");
        }

        Stack<Integer> stack = new Stack<>();

        // Step 1: Push the first k elements into the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Step 2: Enqueue the elements from stack back to the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 3: Move the remaining elements (n-k) to the back of the queue
        int remainingElements = queue.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.add(queue.poll());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int k = 3;
        System.out.println("Original Queue: " + queue);
        reverseFirstK(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + queue);
    }
}
