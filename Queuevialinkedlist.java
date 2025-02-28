class node{
    int data;
    node next;
    public node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queuelinklist{
    node rare,front;
    public Queuelinklist(){
     rare=front=null;
    }
    boolean isEmpty(){
        return rare==null && front==null;
    }
    void enqueue(int data){
        node new_node=new node(data);
        if(rare==null){
            rare=front=new_node;
            System.out.println("equeued data is "+rare.data);
        }
        else{
            rare.next=new_node;
            rare=new_node;
            System.out.println("equeued data is "+rare.data);
        }
    }
    void dequeue(){
     if(isEmpty()){
        System.out.println("Queue is empty");
     }
     else{
        System.out.println("Dequeued data is "+front.data);
        front=front.next;
     }
    }
    void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
         }
         else{
         node temp=front;
         while(temp!=null){
            System.out.print(" "+temp.data);
            temp=temp.next;
         }
         System.out.println(" ");
         }
    }
    void frontdata(){
        if(isEmpty()){
            System.out.println("Queue is empty");
         }
         else{
            System.out.println("Front element is "+front.data);
         }
    }
    void raredata(){
        if(isEmpty()){
            System.out.println("Queue is empty");
         }
         else{
            System.out.println("Front element is "+rare.data);
         }
    }
}
public class Queuevialinkedlist {
    public static void main(String[] args) {
        Queuelinklist q = new Queuelinklist();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.dequeue();
        q.display();
        q.frontdata();
        q.raredata();
    }
}
