public class second {
    Node head;
    public int size;
    
    second() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        };
    };

    // add first 
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    };

    // add last 
    public void addLast(int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        };

        Node storeHead = head;
        while(storeHead.next != null) {
            storeHead = storeHead.next;
        };
        storeHead.next = newNode;
    };

    // print list 
    public void printList() {
        Node newNode = head;
        while(newNode != null) {
            System.out.print(newNode.data + "->");
            newNode = newNode.next;
        }
    }

    // remove first 
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty ?");
            return;
        };
        
        head = this.head.next;
        size--;
    };

    // remove last 
    public void removeLast() {
        if(head == null) {
            System.out.println("List is empty ?");
            return;
        };

        size--;
        if(head.next == null) {
            head = null;
            return;
        };

        Node storeFirst = head;
        Node storeLast = head.next;

        while(storeLast.next != null) {
            storeFirst = storeFirst .next;
            storeLast = storeLast.next;
        };
        storeFirst.next = null;
    };

    public static void main(String[] args) {
        second sc = new second();
        sc.addFirst(1);
        sc.addFirst(2);
        sc.addFirst(3);
        sc.addLast(0);
        sc.addLast(0);
        sc.addLast(0);
        sc.removeFirst();
        sc.removeLast();
        sc.removeLast();
        sc.printList(); 
        System.out.println();
        System.out.println("size is " + sc.size);   
        
    };
};