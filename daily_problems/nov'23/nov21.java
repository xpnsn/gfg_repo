

class Node {
    int data;
    Node left, right;
    Node(int d) {
        data = d;
        left = right = null;
    }

    void addLeft(Node child) {
        left = child;
    }
    void addRight(Node child) {
        right = child;
    }
}

public class nov21 {
    
    static boolean isIdentical(Node root1, Node root2) {

        if(root1 == null || root2 == null) {
            return (root1 == root2);
        }
        return (root1.data == root2.data) && isIdentical(root1.left, root2.left) && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.addLeft(new Node(9));
        root.addRight(new Node(8));

        Node root1 = new Node(10);
        root1.addLeft(new Node(9));
        root1.addRight(new Node(8));

        System.out.println(isIdentical(root1, root));
    }
}
