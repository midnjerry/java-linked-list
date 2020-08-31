
public class LinkedList {
    int size = 0;
    Node head;
    Node tail;

    public void add(Object obj) {
        Node node = new Node();
        node.data = obj;

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = tail.next;
            //     T
            // A B C  +  n
            //     T
            // A B C n
            //       T
        }


        size++;
    }

    public Object removeHead() {
        if (head == null) {
            throw new NullPointerException("Head is empty");
        }
        // A B C
        //   H T

        // B C
        // H T

        // A
        // HT

        // A  (H == null)   (T = A)

        Object result = head.data;
        head = head.next;
        if (size == 1) {
            tail = null;
        }
        size--;
        return result;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.next;
        }

        return current.data;
    }

    public Object remove(int index){
        // A -> B -> C
        // remove(0)
        // B -> C
        return null;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    private class Node {
        Object data;
        Node next;
    }
}
