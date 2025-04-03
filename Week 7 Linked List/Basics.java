class Node{
    int data;
    Node next;
}
class Main {
    public static void main(String[] args) {
        Node head=new Node();
        head.data=4;
        head.next=null;
        System.out.println(head.data);
        Node temp=new Node();
        temp.data=6;
        head.next=temp;
        System.out.println(head.next.data);
    }
}
