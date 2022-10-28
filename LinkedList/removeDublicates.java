public class removeDublicates {
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

    public void remove() {
        if(head == null || head == null) {
            return;
        };

        Node storeNode = head;
        while(storeNode != null) {
            if(storeNode.num == storeNode.next.num) {
                storeNode.next = storeNode.next.next;
                storeNode = storeNode.next;
            } else {
                storeNode = storeNode.next;
            };
        };
    };

    public static void main(String[] args) {
        removeDublicates sc = new removeDublicates();
        sc.addLast(1);
        sc.addLast(2);
        sc.addLast(2);
        sc.addLast(2);
        sc.addLast(6);
        sc.addLast(6);
        sc.printList();
        sc.remove();
        sc.printList();
    };
};