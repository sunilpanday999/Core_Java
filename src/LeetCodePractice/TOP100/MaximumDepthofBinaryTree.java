package LeetCodePractice.TOP100;

public class MaximumDepthofBinaryTree {
    public static int maxDepth(TreeNode root) {

        if (root == null) return 0;

        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        int bigger = Math.max(leftDepth, rightDepth);
        return bigger;
    }

    public static void main(String[] args) {
//        TreeNode node = new TreeNode();
//        node.
    }
}
