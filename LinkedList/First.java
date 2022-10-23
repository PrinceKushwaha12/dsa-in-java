public class First {
    Node head;
    public int count;
    // create node 
    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        };
    };

    // add first index
    public void addFirst(String data) {
        Node newData = new Node(data);
        newData.next = head;
        head = newData;
    };

    // add lastindex 
    public void addLast(String data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        };

        Node nextNode = head;
        while(nextNode.next != null) {
            nextNode = nextNode.next;
        }
        nextNode.next = newNode;
    }

    // remove first 
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty list, there is no value ? ");
            return;
        };
        head = this.head.next;
    };
    
    // remove last 
    public void removeLast() {
        if(head == null) {
            System.out.println("empty list ?");
            return;
        };

        if(head.next == null) {
            head = null;
            return;
        };

        Node currentNode = head;
        Node LastNode = head.next;
        while(LastNode.next != null) {
            currentNode = currentNode.next;
            LastNode = LastNode.next;
        };
        currentNode.next = null; 
    };

    // print list 
    public void print() {
        Node newData = head;
        while(newData != null) {
            System.out.print(newData.data + " ");
            newData = newData.next;
        };
    };

    public static void main(String[] args) {
        First first = new First();
        first.addFirst("prince");
        first.addFirst("name");
        first.addLast("Kumar");;
        first.removeFirst();
        first.removeLast();
        first.print();
    };
};