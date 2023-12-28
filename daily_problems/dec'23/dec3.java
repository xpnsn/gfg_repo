import java.util.ArrayList;

class Node {
    int data;
    Node left, right;

    Node(int n) {
        data = n;
        left = right = null;
    }
}

public class dec3 {
    
    static void inorder(Node root, ArrayList<Integer> list) {
        if(root == null) return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    static int countPairs(Node root1, Node root2, int x) {
        ArrayList<Integer> list1 = new ArrayList<>();        
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(root1, list1);
        inorder(root2, list2);

        int i=0, j = list2.size()-1;
        int cnt = 0;

        while(i < list1.size() && j >= 0) {
            if(list1.get(i) + list2.get(j) == x) {
                cnt++;
                i++;
                j--;
            } else if(list1.get(i) + list2.get(j) < x) {
                i++;
            } else {
                j--;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.left.left = new Node(2);        
        root1.left.right = new Node(4);
        root1.right = new Node(7);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);

        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.left.left = new Node(3);        
        root2.left.right = new Node(8);
        root2.right = new Node(15);
        root2.right.left = new Node(11);
        root2.right.right = new Node(18);
        
        System.out.println(countPairs(root1, root2, 16));
    }
}
