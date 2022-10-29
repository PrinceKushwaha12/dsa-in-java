public class addOne {   
    Node head;

    class Node {
        public int num;
        Node next;

        Node(int num) {
            this.num = num;
            this.next = null;
        };
    };

    // add last 
    public void addFirst(int num) {
        Node nayaNode = new Node(num);
        nayaNode.next = head;
        head = nayaNode;
    };

    // add first 
    public void addLast(int num) {
        Node nayaNode = new Node(num);
        if(head == null) {
            head = nayaNode;
            return;
        };

        Node storeNode = head;
        while(storeNode.next != null) {

            storeNode = storeNode.next;
        };
        storeNode.next = nayaNode;
    };

    // print 
    public void printList() {
        Node storeNode = head;
        while(storeNode != null) {
            System.out.print(storeNode.num + "->");
            storeNode = storeNode.next;
        };
        System.out.println("null");
    };

    // ADD 1    
    public void addone() {
        if(head == null) {
            System.out.println("list is empty ?");
            return;
        };

        int carry = 1;
        while(head != null) {
            int sum = carry + head.num;
            carry = (sum >= 10) ? 1 : 0; // condition ? true : false 
            
            sum = sum % 10;
            head.num = sum;
 

        };
    };

    public static void main(String[] args) {
        addOne sc = new addOne();
        sc.addFirst(1);
        sc.addLast(2);
        sc.printList();      
    };  
};
