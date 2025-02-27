class Queue{
   static int[] queue;
   //static int size;
   static int capacity;
   static int rare=-1;
   static int front=-1;
    public  Queue(int capacity){
        this.capacity=capacity;
        // this.size=0;
        this.queue=new int[capacity];
    }
   public void enqueue(int data){
      if(rare==capacity){
        System.out.println("Queue is full");
      }
      else{
       rare+=1;
       queue[rare]=data;
      }
    }
    public void dequeue(){
        if(rare==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front+1;i<=rare;i++){
             System.out.println(queue[i]);
             front++;
            }
        }
    }
    public void front(){
        System.out.println("The front element is="+queue[front+1]);
    }
    public void display(){
        if(rare==-1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=rare;i<=0;i--){
             System.out.println(queue[i]+"<--");
            }
        }
        System.out.println("\b");
    }
}
public class QueueusingArray {
    public static void main(String[] args) {
            Queue q=new Queue(4);
            q.display(); 
      
        // Insert elements
        q.enqueue(20); 
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.enqueue(60);

        q.display();
      
        // Delete elements
        q.dequeue(); 
        q.dequeue();
        System.out.println("After two node deletions:");

        q.display();
      
        // Get the front element
        q.front();
    }
}
