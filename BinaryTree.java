import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    int data;
    Node right;
    Node left;
    public Node(int data){
        this.data=data;
        right=left=null;
    }
}
class binarytreesoperation {
   Node root;
   void insert(int data){
      Node new_node=new Node(data);
      if(root==null){
        root=new_node;
        return;
      }
      Queue<Node> queue =new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
        Node temp=queue.poll();
        if(temp.left==null){
            temp.left=new_node;
            return;
        }
        else{
            queue.add(temp.left);
        }
        if(temp.right==null){
            temp.right=new_node;
            return;
        }
        else{
            queue.add(temp.right);
        }
      }
   }
   
   //root left right
   void preorder(Node node){
    if(node==null){
        return;
    }
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
   }

   //left root right
   void inorder(Node node){
    if(node == null){
        return;
    }
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
   }

   //left right root
   void postorder(Node node){
    if(node == null){
        return;
    }
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.data+" ");
   }
}
public class BinaryTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        binarytreesoperation bt=new binarytreesoperation();
        System.out.println("Enter the number of nodes");
        int n=sc.nextInt();
        int data;
        for(int i=0;i<n;i++){
        data=sc.nextInt();
        bt.insert(data);
        }
        bt.preorder(bt.root);
        System.out.println("");
        bt.inorder(bt.root);
        System.out.println("");
        bt.postorder(bt.root);
        System.out.println("");
    }
}
