import javax.swing.plaf.synth.SynthOptionPaneUI;

public class revise {

    Node head;
    public int size;

    revise() {
        size = 0;
    };

    class Node {
        public int num;
        Node next;
        
        Node(int num) {
            this.num = num;
            this.next = null;
            size++;
        };
    };

    // add first 
    public void addFirst(int num) {
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    };

    // add Last 
    public void addLast(int num) {
        Node newNode = new Node(num);
        if(head == null) {
            head = newNode;
            return;
        };

        Node storeNode = head;
        while(storeNode.next != null) {
            storeNode = storeNode.next;
        };
        storeNode.next = newNode;
    };

    // remove first 
    public void removeFirst() {
        if(head == null) {
            System.out.println("List is empty ?");
            return;
        };

        head = head.next;
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
        }

        Node firstNode = head;
        Node secondNode = head.next;
        while(secondNode.next != null) {
            firstNode = firstNode.next;
            secondNode = secondNode.next;
        };
        firstNode.next = null;
    };

    // count length
    public int length() {
        Node storeNode = head;
        int count = 0;
        while(storeNode != null) {
            storeNode = storeNode.next;
            count++;
        };
        return count;
    };

    // print middle element 
    public void printMiddleElement() {
        if(head == null) {
            System.out.println("list is empty");
            return;
        };

        Node slow = head;
        Node fast = head;
        while(fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        };

        System.out.println(slow.num);
    };

    // print list
    public void printList() {
        
        if(head == null) {
            System.out.println("list is a empty ?");
        };

        Node storeNode = head;
        while(storeNode != null) {
            System.out.print(storeNode.num + "->");
            storeNode = storeNode.next;
        };
        System.out.println("null");
    };

    // reverse iterative 
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

    // reverse recursive
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null) {
            return head;
        };

        Node store = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return store;
    };

    public static void main(String[] args) {
        revise sc = new revise();
        sc.addFirst(0);  
        sc.addFirst(1);  
        sc.addFirst(2);
        sc.addLast(3);
        sc.addLast(4);
        sc.printList();  
        sc.head = sc.reverseRecursive(sc.head); 
        sc.printMiddleElement();    
        sc.printList();
    };
};
