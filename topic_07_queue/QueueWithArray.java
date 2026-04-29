package topic_07_queue;

public class QueueWithArray {
    static class Queue {
        int size;
        int arr[];

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        int rear = -1;

        // isEmpty
        public boolean isEmpty() {
            return rear == -1;
        }

        // isFull
        public boolean isFull() {
            return rear == size - 1;
        }

        // enqueue -> O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue overflow, can't add " + data);
                return;
            }

            arr[++rear] = data;
        }

        // peek -> O(n)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }

            return arr[0];
        }

        // dequeue -> O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;

            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(9);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);

        // 1 2 3 4 5
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
