class Node{
    int data;
    Node next;

Node(int data){
    this.data=data;
    this.next=null;
}
}
class LinkedList{
Node head;

public void insert(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
temp.next=newNode;
}
public void printList(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data+"");
        temp=temp.next;
}
}
}
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.print("Linked List: ");
        list.printList();
    }
}