public class First {
    Node head;
    public int size;

    First() {
        size = 0;
    }

    public class Node {
        int num;
        Node next;

        Node(int num) {
            this.num = num;
            this.next = null;
            size++;
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
        size--;
    }; 

    // remove last 
    public void removeLast() {
        if(head == null) {
            System.out.println("List is a empty ?");
            return;
        };

        size--;
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

    // find length of LinkedList
    public int length() {
        int count = 0;
        Node storeNode = head;
        while(storeNode != null) {
            storeNode = storeNode.next;
            count++;
        };
        return count;
    };

    // print middle element 
    public void printMiddleElement() {
        if(head == null) {
            System.out.println("List is empty ?");
        };

        Node storeNode = head;
        if(head != null) {
            int length = length();
            int middle = length / 2;
            while(middle != 0) {
                storeNode = storeNode.next;
                middle--;
            };
        };

        System.out.println("middle element is -> " + storeNode.num);
    };

    // delete index from Nth in end
    public Node removeFromNthIndex(Node head, int n) {
        // base case
        if(head.next == null) {
            return null;
        };

        // find length 
        int size = 0;
        Node current = head;
        while(current != null) {
            current = current.next;
            size++;
        };

        // check size 
        if(size == n) {
            return head.next;
        };

        // main code 
        int length = size - n;
        int i = 1;
        Node preNode = head;
        while(i < length) {
            preNode = preNode.next;
            i++;
        };

        preNode.next = preNode.next.next;
        return head;
    };

    // delete middle element 
    public void delete() {
        if(head == null || head.next == null) {
            return;
        };

        Node storeNode = head;
        int length = length();
        int sizeOfMiddle = length / 2;
        int index = 1;
        while(index != sizeOfMiddle) {
            storeNode = storeNode.next;
            index++;
        };
        storeNode.next = storeNode.next.next;
    };

    public static void main(String[] args) {
        First sc = new First();
        sc.addFirst(0);
        sc.addFirst(1);
        sc.addLast(2);
        sc.addLast(3);
        sc.addLast(1);
        sc.printList();
        // sc.reverseIterative();
        sc.head = sc.reverseRecursive(sc.head); 
        sc.printList();        
        System.out.println(sc.length());
    };
};