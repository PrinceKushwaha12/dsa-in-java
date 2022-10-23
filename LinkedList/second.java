public class second {
    Node head;
    public int size;
    // creating same calss constracter 
    second() {
        size = 0;
    }
    // create node 
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        };
    };
    
    // addfirst
    public void add(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    };

    // addLast 
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        };

        Node nayaNode = head;
        while(nayaNode.next != null) {
            nayaNode = nayaNode.next;
        };
        nayaNode.next = newNode;
    };

    // print list 
    public void printList() {
        Node newNode = head;
        while(newNode != null) {
            System.out.print(newNode.data + " ");
            newNode = newNode.next;
        };
    };

    // remove first 
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is Empty ? ");
            return;
        };
        size--;
        head = this.head.next;
    };

    // remove last 
    public void removeLast() {
        if(head == null) {
            System.out.println("List is Empty ? ");
            return;
        };

        size--;
        if(head.next == null) {
            head = null;
            return;
        };

        Node current = head;
        Node past = head.next;
        while(past.next != null) {
            current = current.next;
            past = past.next;
        };
        current.next = null;
    };

    public static void main(String[] args) {
        second sc = new second();
        sc.add("prince");
        sc.add("name");
        sc.addLast("kumar");
        // sc.removeFirst();
        // sc.removeLast();
        sc.printList();
        System.out.println(sc.size);
    };
};
