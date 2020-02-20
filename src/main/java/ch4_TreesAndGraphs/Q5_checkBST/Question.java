package ch4_TreesAndGraphs.Q5_checkBST;

public class Question {
    static boolean checkBST(TreeNode n) {
        return checkBST(n, null, null);
    }

    static boolean checkBST(TreeNode n, Integer min, Integer max) {
        if (n == null) return true;

        if ((min != null && n.val <= min) ||(max != null && n.val > max)) {
            return false;
        }

        if (!checkBST(n.left, min, n.val) || !checkBST(n.right, n.val, max)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println(checkBST(root));
        TreeNode tmp = new TreeNode(11);
        root.right.right.right.left = tmp;
        System.out.println(checkBST(root));
    }
}
