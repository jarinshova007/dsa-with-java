package topic_07_queue;
// Linear queue with array (no shifting)

public class QueueWithArrayNoShifting {
    static class Queue {
        int size;
        int arr[];

        Queue(int size) {
            this.size = size;
            this.arr = new int[size];
        }

        int front = -1;
        int rear = -1;

        // isEmpty - O(1)
        public boolean isEmpty() {
            return front == -1 && rear == -1;
        }

        // isFull - O(1)
        public boolean isFull() {
            return rear == size - 1;
        }

        // enqueue - O(1)
        public void push(int data) {
            if (isFull()) {
                System.out.println("Overflow!");
                return;
            }

            // if it is the first element
            if (rear == -1) {
                front = 0;
            }

            arr[++rear] = data;
        }

        // dequeue - O(1)
        public int pop() {
            if (isEmpty()) {
                System.out.println("Underflow!");
                return -1;
            }

            int frontData = arr[front];

            // if it is the only element
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }

            return frontData;
        }

        // peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Underflow!");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(4);

        q.peek(); // underflow
        q.pop(); // underflow

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5); // overflow
        q.push(6); // overflow

        q.peek(); // 1
        q.pop();
        q.peek(); // 2
        q.pop();

        // print - 3, 4
        System.out.println("The queue:");
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}