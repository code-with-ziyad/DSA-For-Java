class Node {
    int data;      // data store karega
    Node next;     // next node ka reference

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;  // pehla node (head) ko store karega

    // Insert node at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode; // agar list empty hai
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // last node ka next = new node
        }
    }

    public void addfirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addposition(int data, int position){
        if(position <= 0){
            System.out.println("invalid position");
            return;
        }
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println(" Position out of range!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
public class LL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.addfirst(5);
        list.addfirst(4);

        list.display();  // Output: 10 -> 20 -> 30 -> null
    }
}
