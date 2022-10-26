// print middle element of a list 
public class printMiddle {
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
    // public void printMiddleElement() {
    //     if(head == null) {
    //         System.out.println("List is empty ?");
    //     };

    //     Node storeNode = head;
    //     if(head != null) {
    //         int length = length();
    //         int middle = length / 2;
    //         while(middle != 0) {
    //             storeNode = storeNode.next;
    //             middle--;
    //         };
    //     };

    //     System.out.println("middle element is -> " + storeNode.num);
    // };

    // second method 
    public void printMiddleElement() {
        Node storeFirst = head;
        Node storeSecond = head;
        while(storeSecond != null && storeSecond.next != null) {
            storeSecond = storeSecond.next.next;
            storeFirst = storeFirst.next;
        };
        System.out.println("middle element is -> " + storeFirst.num);
    };

    public static void main(String[] args) {
        printMiddle sc = new printMiddle();
        sc.addLast(0);
        sc.addLast(1);
        sc.addLast(2);
        sc.addLast(3);
        sc.addLast(4);
        sc.addLast(4);
        sc.printList();
        sc.printMiddleElement();
    }
}
