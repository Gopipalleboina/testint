import java.util.*;
public class Fullbinarytree{
    static class Node{
        int data;
        Node left,right;
    
    Node(int data){
        this.data=data;
        left=right=null;
    }
    }
    public boolean fullbt(Node node){
        if(node==null){
            return true;
        }
        if(node.left==null && node.right==null){
            return true;
        }
        if(node.left!=null && node.right!=null){
            return fullbt(node.left) && fullbt(node.right);
        }
        return false;
    }
    public static void main(String[] args){
        Fullbinarytree f=new Fullbinarytree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        if(f.fullbt(root)){
            System.out.println("it is a fullbt");
        }
        else{
             System.out.println("it is a not fullbt");
        }
    }
    
}