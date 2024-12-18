public class Completebinarytree{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
            
        }
    }
    public int count(Node node){
        if(node==null){
            return 0;
            
        }
        return 1+count(node.left)+count(node.right);
    }
    public boolean completebt(Node node,int index,int count){
        if(node==null){
            return true;
        }
        if(index>=count){
            return false;
        }
        return completebt(node.left,2*index+1,count) && completebt(node.right,2*index+2,count);
    }
    public static void main(String[] args){
        Completebinarytree bt=new Completebinarytree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
       int nodecount=bt.count(root);
        if(bt.completebt(root,0,nodecount)){
            System.out.println("it is a complete bt");
        }
        else{
            System.out.println("it is not a complete bt");
        }
    }
}