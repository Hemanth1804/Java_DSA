class Node {
 int data;
 Node next;
 Node prev;
 Node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;
 }
}
class Doublylist{
    Node rare,front;
    boolean isEmpty(){
        return rare == null && front == null;
    }
    void enqueue(int data){
        Node new_node = new Node(data);
        if(isEmpty()){
            rare=front=new_node;
        }
        else{
            rare.next=new_node;
            new_node.prev=rare;
            rare=new_node;
        }
    }
    void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        Node temp=front;
        while(true){
            System.out.print(temp.data+" ");
            if(temp.next==null){
                break;
            }
            temp=temp.next;
        }
        System.out.println(" ");
        temp=rare;
        while(true){
            System.out.print(temp.data+" ");
            if(temp.prev==null){
                break;
            }
            temp=temp.prev;
        }
        System.out.println(" ");
    }
    void dequeueFirst(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        else{
            System.out.println("The dequed element is "+front.data);
            front=front.next;
            front.prev=null;
        }
    }
    void dequeueLast(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        else{
            System.out.println("The dequed element is "+rare.data);
            rare=rare.prev;
            rare.next=null;
        }
    }
}
public class DoublylinkedList {
    public static void main(String[] args) {
        Doublylist d = new Doublylist();
        d.enqueue(10);
        d.enqueue(20);
        d.enqueue(30);
        d.enqueue(40);
        d.display();
        d.dequeueFirst();
        d.display();
        d.dequeueLast();
        d.display();
        d.enqueue(10);
        d.enqueue(20);
        d.enqueue(30);
        d.enqueue(40);
        d.display();
    }
}
