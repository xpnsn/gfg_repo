import java.util.Stack;

class Node {
    int data;
    Node left, right;

    Node(int n) {
        data = n;
        left = right = null;
    }
} 

public class nov22 {
    
    static boolean areSymmetric(Node root) {


        if(root == null) {
            return true;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);

        while(!stack.empty()) {
            Node node1 = stack.pop();
            Node node2 = stack.pop();

            if(node1 == null && node2 == null) {
                continue;
            }

            if(node1 == null || node2 == null) {
                return false;
            }

            if(node1.data != node2.data) {
                return false;
            }

            stack.push(node1.left);
            stack.push(node2.right);
            stack.push(node1.right);
            stack.push(node2.left);
        }

        return true;
    }

    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(2);
        tree.left.left = new Node(3);
        tree.left.right = new Node(4);
        tree.right.left = new Node(4);
        tree.right.right = new Node(3);
        System.out.println(areSymmetric(tree));
    }
}
