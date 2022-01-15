package LeetCodePractice.TOP100;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTarversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(root, res);
        return res;
    }

    public void helper(TreeNode root, List<Integer> res) {
        if (root != null) {
            helper(root.left, res);
            res.add(root.val);
            helper(root.right, res);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        BinaryTreeInorderTarversal binaryTreeInorderTarversal = new BinaryTreeInorderTarversal();
        System.out.println(binaryTreeInorderTarversal.inorderTraversal(treeNode));

    }
}
// Definition for a binary tree node.
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }

      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
