class Queue {
    int capacity;
    int rare;
    int front;
    int[] queue;

    // Constructor
    public Queue(int capacity) {
        this.capacity = capacity;
        this.rare = -1;
        this.front = 0;
        this.queue = new int[capacity];
    }

    // Enqueue operation
    void enqueue(int data) {
        if (rare == capacity - 1) { 
            System.out.println("Queue is full");
        } else {
            rare += 1;
            queue[rare] = data;
            System.out.println(data + " added to queue");
        }
    }
    void display(){
        if(rare == -1){
            System.out.println("Queue is empty");
        }
        else{
            for(int i=front;i<=rare;i++){
                System.out.print(queue[i]+"<=");
            }
            System.out.println("\b");
        }
    }
    void dequeue(){
        if(rare == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("The dequeued element is "+ queue[front]);
            front+=1;
        }
    }
    void front(){
        if(rare == -1){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("The front element is "+queue[front]);
        }
    }
}
public class QueueviaArray {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.display();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.dequeue();
        q.enqueue(60);
        q.front();
        q.display();
    }
}
