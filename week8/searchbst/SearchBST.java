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

    public static TreeNode searchBST(TreeNode root, int val) {
        while (root != null) {
            if (root.val == val) {
                return root;
            } else if (val < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return null;
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);




        int val = 2;
        TreeNode result = searchBST(root, val);

        if (result != null) {
            System.out.print("Subtree: ");
            printTree(result);
        } else {
            System.out.println("Node not found");
        }

        System.out.println();




        val = 5;
        result = searchBST(root, val);

        if (result != null) {
            System.out.print("Subtree: ");
            printTree(result);
        } else {
            System.out.println("Node not found");
        }
    }
}
