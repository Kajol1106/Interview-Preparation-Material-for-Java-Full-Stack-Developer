package Collection;

public class QueueDemo {
    static int n = 3;
    static int[] arr = new int[n];
    static int front = 0;
    static int rear = 0;
    public static void enqueue(int val) {
        if(rear == n) {
            System.out.println("Queue is full...");
        }
        else {
            arr[rear] = val;
            System.out.println("Enqueued element is "+ arr[rear]);
            rear++;
        }
    }

    public static void dequeue() {
        if(front == rear) {
            System.out.println("Queue is empty...");
        }
        else {
            System.out.println("Dequeued element is "+ arr[front]);
            front++;
        }
    }

    public static void main(String[] args) {
        enqueue(12);
        enqueue(14);
        enqueue(19);
        enqueue(12);

        dequeue();
        dequeue();
        dequeue();
        dequeue();
    }

}
