public class linkedlist {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    // methods
    public void addFirst(int data){
        // step 1 = create new
        Node newNode = new Node(data);
        size++;
        if (head==null){
            head = tail = newNode;
            return;

        }

        // step 2 - new node next = head;
        newNode.next = head; //link

        // sterp 3 -  head = new node
        head = newNode;


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if (head==null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }
    public void print(){ // tc O (n)
        if (head == null){
            System.out.println("Ll is empty");
            return;
        }
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+"-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        // i = idx -1;temp -> prev
        newNode.next = temp.next;
        temp.next=newNode;

    }
    public int removefirst(){
        if (size==0){
            System.out.println("LL is infinity");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removelast(){
        if (size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        // prev i = size - 2
        Node prev = head;
        for (int i = 0;i<size-2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrsearch(int key){ // O(n TC)
        Node temp = head;
        int i = 0;
        while(temp !=null){
            if (temp.data ==  key){ // key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        // key not found case
        return -1;
    }
    public int helper(Node head,int key){
        if (head==null){
            return -1;
        }
        if (head.data==key){
            return 0;
        }
        int idx = helper(head.next,key);
        if (idx== -1){
            return -1;
        }
        return  idx+1;
    }
    public int recsearch(int key){ // TC O(n)
        return helper(head,key);

    }
    public void reverse(){ // Tc O(n )
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    public void deletenthfromend(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sz++;
        }
        if (n==sz){
            head = head.next; // remove first
            return;
        }
        //sz-n
        int i = 1;
        int itofind = sz-n;
        Node prev = head;
        while(i<itofind){
            prev = prev.next;
            i++;
        }
        prev.next= prev.next.next;
        return;
    }
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public boolean checkpalindrome(){
        if (head == null || head.next == null){
            return true;
        }
        // step 1 fin mid
        Node midNode = findMid(head);


        // step 2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;

        // step 3 check left half and right half
        while(right!=null){
            if (left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void removecycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle==false){
            return;
        }
        // find meeting point
        slow = head;
        Node prev = null;
        while(slow!= fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // remove cycle
        prev.next = null;


    }
    private Node getmid(Node head){
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1,Node head2){
        Node mergedll = new Node(-1);
        Node temp = mergedll;
        while(head != null && head2!= null){
            if (head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedll.next;
    }
    public Node mergesort(Node head){
        if (head == null || head.next == null){
            return head;
        }
        // find mid
        Node mid = getmid(head);

        Node righthead = mid.next;
        mid.next = null;
        Node newleft = mergesort(head);
        Node newright = mergesort(righthead);
        // merge
        return merge(newleft,newright);

    }
    public void zigzag(){
        // find mid
        Node slow = head;
        Node fast = head.next;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next;
        mid.next=null;
        Node prev = null;
        Node next;
        while (curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        // alt merge
        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }


    public static void main(String[] args) {
        // Linkedlist l1 = new Linkedlist();
//        l1.head= new Node(1);
//        l1.head.next= new Node(2);
//        l1.print();
// l1.addFirst(2);
//        l1.print();
// l1.addFirst(1);
//        l1.print();
// l1.addLast(4);
//        l1.print();
// l1.addLast(5);
//        l1.print();
//        l1.add(2,3);
//        l1.print();
//        System.out.println(l1.size);
//        l1.removefirst();
//         l1.print();
//         l1.removelast();
//         l1.print();
//         System.out.println(l1.size );
//         System.out.println(l1.recsearch(3));
//         System.out.println(l1.recsearch(10));
//         l1.reverse();
//        l1.print();
//        l1.deletenthfromend(3);
//        l1.addLast(1);
//        l1.addLast(2);
//        l1.addLast(3);
//        l1.addLast(1);
//        l1.print();
//        System.out.println(l1.checkpalindrome());
//        head = new Node(1);
//        Node temp = new Node(2);
//        head.next = temp;
//        head.next.next = new Node(3);
//        head.next.next.next = temp;
//        System.out.println(iscycle());
//        removecycle();
//        System.out.println(iscycle());
//        Linkedlist ll = new Linkedlist();
//       ll.addLast(1);
//        ll.addLast(2);
//        ll.addLast(3);
//        ll.addLast(4);
//        ll.addLast(5);
//        ll.print();
//        ll.zigzag();
//        ll.print();



    }

}
