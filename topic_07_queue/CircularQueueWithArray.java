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
            return front == -1 & rear == -1;
        }

        // isFull
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // enqueue -> O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("The queue is full, can't add " + data);
                return;
            }

            if (front == -1) {
                front = 0;
            }

            arr[(rear + 1) % size] = data;
        }

        // dequeue -> O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue!");
                return -1;
            }

            // single element
            if (front == rear) {
                front--;
                rear--;
            } else {
                front = (front + 1) % size;
            }

            return arr[front++];
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
        Queue q = new Queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4); // no space
        q.remove();
        q.add(5);
        q.add(6); // no space;

        // 2, 3, 5
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}