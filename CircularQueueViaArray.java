class CircularQueue{
  static int front;
  static int rare;
  static int size;
  static int[] cqueue;
  public CircularQueue(int capacity){
    this.size=capacity;
    this.cqueue=new int[capacity];
    this.rare=-1;
    this.front=-1;
  }
  void enqueue(int data){
    if((rare+1)%size == front){
      System.out.println("Dequeue the element first then enqueue");
    }
    else{
      rare=(rare+1)%size;
      cqueue[rare]=data;
      System.out.println("added element in the circuilar queue is "+cqueue[rare]);
    }
  }
  void display(){
    int i=front+1;
    if(rare==-1){
      System.out.println("Queue is empty");
    }
    else{
     while(true){
       System.out.print(cqueue[i]+" ");
       if(rare==i){
        break;
       }
       i=(i+1) % size ;
      }
    }
    System.out.println("");
  }
  void dequeue(){
    if(rare==-1){
      System.out.println("Queue is empty");
    }
    else{
      front=(front+1)%size;
      System.out.println("The dequed element is "+cqueue[front]);
    }
  }
  void front(){
    if(front==-1){
      System.out.println("Queue is empty");
    }
    else{
      System.out.println("The front element of the queue is "+cqueue[front+1]);
    }
  }
}
public class CircularQueueViaArray{
    public static void main(String[] args) {
        CircularQueue cq=new CircularQueue(5);
        //cq.display();
        cq.enqueue(20);
        cq.enqueue(30);
        cq.enqueue(40);
        cq.enqueue(50);
        cq.enqueue(60);
        cq.display();
        cq.dequeue();
        cq.dequeue();
        cq.enqueue(70);
        cq.front();
        cq.display();
    }
}