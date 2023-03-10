package Lecture_Code.Collections.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++) {
            System.out.println(
                    i == 0 ?
                    "First element: ".concat(Integer.toString(queue.dequeue())):
                            (
                                    i == 1 ?
                                            "Second element: ".concat(Integer.toString(queue.dequeue())):
                                            "Third element: ".concat(Integer.toString(queue.dequeue()))
                            )
            );
        }
        // How not to program 101
        // Read that ternary operator is faster and more readable than an if-else block
        // Not sure that it's better in this case

        queue.enqueue(4);
        System.out.println("Queue size: ".concat(Integer.toString(queue.size())));



    }
}

