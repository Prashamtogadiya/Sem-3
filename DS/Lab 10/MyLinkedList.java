import java.util.*;

public class MyLinkedList {
    Node head;
    int size = 0;

    public MyLinkedList() {
        head = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }

    }

    public boolean isEmpty(){
        return head == null;
    }

    public void insertFirst(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

    }

    public void insertLast(int val) {
        Node newNode = new Node(val);
        if (isEmpty()) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void delIndex(int index){
        if(isEmpty()){
            System.out.println("List is Empty");
            return;
        }
        if(index==0){
            head=head.next;
            return;
        }
        int count =0;
        Node curNode = head, preNode = null;
        while(curNode!=null && count<index){
            preNode=curNode;
            curNode=curNode.next;
            count++;
            
        }
        if(curNode==null){
            System.out.println("Index out of range");
            return;
        }

        preNode.next=curNode.next;


    }

    public void delete(int val) {
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        if(head.data==val){
            head=head.next;
            size--;
            return;
        }
        Node prevNode = head;
        while (prevNode.next!=null && prevNode.next.data!=val) {
            prevNode = prevNode.next;
        }
        if(prevNode.next==null){
            System.out.println("Value not found");
            return;
        }
        prevNode.next = prevNode.next.next;
        size--;
        System.out.println("Number Deleted");
        

    }

    public void reverse(){
        if(isEmpty()){
            System.out.println("Linked List is Empty");
            return;
        }

        if(head.next==null){
            System.out.println("List has only one node");
            return;
        }
        Node nxtNode,curNode=head.next,preNode=head;
        while(curNode!=null){
            nxtNode = curNode.next;
            curNode.next=preNode;
            //Updating the preNode and curNode
            preNode=curNode;
            curNode=nxtNode;
        }
        head.next=null;
        head = preNode;
        
        

    }

    public int size() {
        return size;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        Scanner sc = new Scanner(System.in);
        int val;
        boolean check = true;
        while (check) {
            System.out.println(
                    "\n[1] Insert at first\n[2] Insert at last\n[3] Remove\n[4] Reverse\n[5] Print\n[6] Size\n[7] Remove at index\n[8] Exit");
            System.out.print("\nEnter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter val : ");
                    val = sc.nextInt();
                    list.insertFirst(val);
                }

                case 2 -> {
                    System.out.print("Enter val : ");
                    val = sc.nextInt();
                    list.insertLast(val);
                }

                case 3 -> {
                System.out.print("Enter number to delete : ");
                val = sc.nextInt();
                list.delete(val);
                }

                case 4 -> list.reverse();

                case 5 -> list.display();

                case 6 -> System.out.println("Size : " + list.size());

                case 7 -> {
                    System.out.println("Enter a Index at which you want to delete : ");
                    val = sc.nextInt();
                    list.delIndex(val);
                }

                case 8 -> check = false;
            }
        }
        sc.close();
    }
}