package topic_07_queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class QueueJCF {
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); or
        Queue<Integer> q = new ArrayDeque<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.poll();
        }
    }
}
