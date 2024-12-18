public class Binarysearchtree {
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    Binarysearchtree() {
        root = null;
    }

    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public Boolean search(Node root, int data) {
        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }
        if (data < root.data) {
            return search(root.left, data);
        }
        return search(root.right, data); // Ensure all paths return a value
    }

    public Node findMin(Node root) {
        Node curr = root;
        while (curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }

    public Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
        if(data==root.data){
      if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // Node with two children
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
         else if (data < root.data) {
            root.left = delete(root.left, data);
        } else{
            root.right = delete(root.right, data);
        } 
        return root;
    }

    public static void main(String[] args) {
        Binarysearchtree bt = new Binarysearchtree();
        bt.root = bt.insert(bt.root, 30);
        bt.root = bt.insert(bt.root, 40);
        bt.root = bt.insert(bt.root, 60);
        boolean found = bt.search(bt.root, 30);
        System.out.println(found + " ");
       bt.root = bt.delete(bt.root, 60); 
    boolean isDeleted = bt.search(bt.root, 60); 
    System.out.println(isDeleted ? "60 is still present." : "60 has been deleted.");
    }
}
