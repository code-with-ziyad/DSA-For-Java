class Queue {
    int size;
    int front, rear;
    int[] arr;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = -1;
        rear = -1;
    }

    // Enqueue - Add element
    void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is Full");
        } else {
            if (front == -1) front = 0;
            arr[++rear] = data;
            System.out.println(data + " inserted into queue");
        }
    }

    // Dequeue - Remove element
    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.println(arr[front] + " removed from queue");
            front++;
        }
    }

    // Display
    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}

public class que1 {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();
    }
}
