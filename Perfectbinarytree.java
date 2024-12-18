public class Perfectbinarytree{
    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
       
        }
    
    public int depth(Node node){
        int d=0;
        while(node!=null){
            d++;
            node=node.left;
        }
        return d;
    }
    public boolean perfectbt(Node node,int d,int level){
        if(node==null){
            return true;
           
        }
        if(node.left==null && node.right==null){
             return d==level+1;
        }
         if(node.left==null || node.right==null){
             return false;
         }
         return perfectbt(node.left,d,level+1) && perfectbt(node.right,d,level+1);
    }
    public static void main(String[] args){
        Perfectbinarytree bt=new Perfectbinarytree();
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
       int d=bt.depth(root);
        if(bt.perfectbt(root,d,0)){
            System.out.println("it is a complete bt");
        }
        else{
            System.out.println("it is not a complete bt");
        }
    }
}
    
