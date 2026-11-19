import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }

        int sum = 0;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (node.val >= low && node.val <= high) {
                sum += node.val;
            }

            if (node.val > low && node.left != null) {
                stack.push(node.left);
            }

            if (node.val < high && node.right != null) {
                stack.push(node.right);
            }
        }

        return sum;
    }

    public static void main(String[] args) {




        TreeNode root1 = new TreeNode(10);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(15);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(7);
        root1.right.right = new TreeNode(18);

        int low1 = 7;
        int high1 = 15;

        System.out.println("Example 1: " +
            rangeSumBST(root1, low1, high1));





        TreeNode root2 = new TreeNode(10);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(15);
        root2.left.left = new TreeNode(3);
        root2.left.right = new TreeNode(7);
        root2.left.left.left = new TreeNode(1);
        root2.left.right.left = new TreeNode(6);
        root2.right.left = new TreeNode(13);
        root2.right.right = new TreeNode(18);

        int low2 = 6;
        int high2 = 10;

        System.out.println("Example 2: " +
            rangeSumBST(root2, low2, high2));
    }
}
