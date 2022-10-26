public class reverseList {
    Node head;

    public class Node {
        int num;
        Node next;

        Node(int num) {
            this.num = num;
            this.next = null;
        };
    };

    // add first
    public void addFirst(int num) {
        Node currentNode = new Node(num);
        currentNode.next = head;
        head = currentNode;
    };

    // add last 
    public void addLast(int num) {
        Node newNode = new Node(num);
        if(head == null) {
            head = newNode;
            return;
        };

        Node currentNode = head;
        while(currentNode.next != null) {
            currentNode = currentNode.next;
        };
        currentNode.next = newNode;
    };

    // print list 
    public void printList() {
        Node currentNode = head;
        while(currentNode != null) {
            System.out.print(currentNode.num + "->");
            currentNode = currentNode.next;
        };
        System.out.println("null");
    };

    // remove first
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is a empty ?");
            return;
        };

        head = head.next;
    };

    // remove last 
    public void removeLast() {
        if(head == null) {
            System.out.println("List is a empty ?");
            return;
        };

        if(head.next == null) {
            head = null;
            return;
        };

        Node firstNode = head;
        Node secondNode = head.next;
        while(secondNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        };
        firstNode.next = null;
    };

    // reverse list iterative way 
    public void reverseIterative() {
        if(head == null || head.next == null) {
            return;
        };

        Node previousNode = head;
        Node currentNode = head.next;
        while(currentNode != null) {
            Node nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        };
        head.next = null;
        head = previousNode;
    };

    // reverse recursive way 
    public Node reverseRecursive(Node head) {
        // base case 
        if(head == null || head.next == null) {
            return head;
        };

        Node storeNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return storeNode;
    };

    public static void main(String[] args) {
        reverseList sc = new reverseList();
        sc.addFirst(0);
        sc.addFirst(1);
        sc.addLast(2);
        sc.addLast(3);
        sc.addLast(1);
        sc.printList();
        // sc.reverseIterative();
        sc.head = sc.reverseRecursive(sc.head); 
        sc.printList();        
    };
};