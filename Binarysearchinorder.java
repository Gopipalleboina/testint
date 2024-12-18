import java.util.*;
public class Binarysearchinorder{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    Node root;
    Binarysearchinorder(){
        root=null;
    }
    void insert(int data){
        if(root==null){
            root=new Node(data);
        }
        else{
            insertnode(root,data);
        }
    }
   void insertnode(Node root,int data){
      
        if(root.left==null){
           root.left=new Node(data);
        }
       else if(root.right==null){
            root.right=new Node(data);
        }
        else{
        if(root.left.left==null || root.left.right==null){
            insertnode(root.left,data);
        }
        else{
            insertnode(root.right,data);
        }
        }
        
    }
    void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root){
        if(root==null){
            return;
        }
         System.out.print(root.data+" ");
         preorder(root.left);
         preorder(root.right);
    }
    void postorder(Node root){
         if(root==null){
            return;
        }
        postorder(root.left);
         postorder(root.right);
         System.out.print(root.data+" ");
         
    }
     public static void main(String[] args){
         Binarysearchinorder bt=new Binarysearchinorder();
         bt.insert(1);
         bt.insert(2);
         bt.insert(3);
         bt.insert(4);
         bt.insert(5);
         bt.insert(6);
         bt.insert(7);
         System.out.println("inorder:");
         bt.inorder(bt.root);
         System.out.println("\npreorder:");
         bt.preorder(bt.root);
         System.out.println("\npostorder:");
         bt.postorder(bt.root);
     }
    }
