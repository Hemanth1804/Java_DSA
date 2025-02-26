
import java.util.*;
public class StackOperation {
    //Push operation
    public static void Stack_push(Stack<Integer> s){
       Scanner sc =new Scanner(System.in);
       System.out.println("enter how many intiger you want to push on stack");
       int n=sc.nextInt();
       int item;
       System.out.println("enter "+ n +" intiger you want to push on stack");
       for(int i=0;i<n;i++){
        item=sc.nextInt();
        s.push(item); //it help to push on to the stack
       }
    }
    //POP opertion from the stack
    public static void Stack_pop(Stack<Integer> s){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter how many intiger you want to pop from stack");
        int n=sc.nextInt();
        int item,i=0;
        if(n>s.size()){
            System.out.println("Invalid");
        }
        else if(s.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
        while(s.size()-i!=s.size()-n){
         item=s.pop();//it is help to pop the element form the stack
         System.out.println("Pop "+item);
         i++;
             }
        }
    }
    //It is used to print the top of the stack element
    public static void Stack_peek(Stack<Integer> s){
        System.out.println("The top of the stack element is "+s.peek());
    }
    //This Function is used to search the element in the stack it will print the index of that element
    public static void Stack_search(Stack<Integer> s){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the element You want to saerch");
        int element=sc.nextInt();
        if(s.search(element)==-1){
            System.out.println("Searched element is not in the stack");
        }
        else{
            System.out.println("The searched element in the position "+(s.search(element)));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>(); //initializing the stack
        Stack_push(stack);
        Stack_pop(stack);
        Stack_peek(stack);
        Stack_search(stack);
    }
}
