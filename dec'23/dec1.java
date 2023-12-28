class Node {
    int data;
    Node left, right;

    Node(int n) {
        data = n;
        left = right = null;
    }
}

public class dec1 {
    
    static boolean isDeadEnd(Node root) {
        helper(root, 1, 10001, false);
        return true;
    }

    static void helper(Node root, int l, int r, boolean flag) {

        if(flag) {
            return;
        }
        if(root.right == null && root.left == null) {
            if(l == r) {
                flag = true;
            }
        }
        helper(root.left, l, root.data -1, flag);
        helper(root.right, root.data + 1, r, flag);
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.right = new Node(9);
        root.left = new Node(5);
        root.left.left = new Node(2);
        root.left.right = new Node(7);
        root.left.left.left = new Node(1);

        System.out.println(isDeadEnd(root));
    }
}