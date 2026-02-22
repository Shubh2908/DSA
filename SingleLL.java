package Linked_List;

public class SingleLL {

    private Node head;
    private Node tail;

    private int size;

    public SingleLL() {
        this.size = 0;
    }

    // Insertion at beginning

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // Insertion at last

    public void insertLast(int val){

        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // Insertion at specific position

    public void insert(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;

    }

    // Deletion At Beginning

    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null){
            tail = null;
        }
        size--;
        return val;
    }

    // Deletion At End

    public int deleteLast(){
        if (size <=1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }

    public Node get(int index){
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Deletion of Particular node

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){  // last index
            return deleteLast();
        }

        Node prev = get(index-1);
        int val = prev.next.value;

        prev.next = prev.next.next;

        return val;
    }

    // Find any value in linked list

    public int find(int value){
        Node node = head;
        int index = 0;
        while(node != null){
            if (node.value == value){
                return index;
            }
            node = node.next;
            index++;
        }
            return -1;
    }

    // Traversal(Print) Method

    public void display() {
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }



    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
