import java.util.*;

class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
  }
};

class Main {

  // Problem Statement #
  // Given a binary tree and a number ‘S’, find if the tree has a path from
  // root-to-leaf such that the sum of all the node values of that path equals
  // ‘S’.

  private static boolean hasPathSum(TreeNode root, int sum) {
    if (root == null)
      return false;
    if (root.val == sum && root.left == null && root.right == null)
      return true;
    return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(12);
    root.left = new TreeNode(7);
    root.right = new TreeNode(1);
    root.left.left = new TreeNode(9);
    root.right.left = new TreeNode(10);
    root.right.right = new TreeNode(5);
    System.out.println(Main.hasPathSum(root, 23));

  }
}