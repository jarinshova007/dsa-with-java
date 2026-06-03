package topic_07_queue;

public class CircularQueueWithArray {
    static class Queue {
        int size;
        int arr[];

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        int front = -1;
        int rear = -1;

        // isEmpty
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue -> O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("overflow!");
                return;
            }

            // if it is the first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // dequeue -> O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }

            int frontData = arr[front];

            // single element
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return frontData;
        }

        // peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove() + " is removed");
        System.out.println(q.remove() + " is removed");
        q.add(5);
        q.add(6);

        // 3 4 5 6
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}