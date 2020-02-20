package ch4_TreesAndGraphs.Q6_getNextInorderNode;

public class Question {
    static TreeNode getNextInorderNode(TreeNode root) {
        if (root == null) return null;

        if (root.right != null) {
            return leftMostChild(root.right);
        } else {
            TreeNode q = root;
            TreeNode x = q.parent;
            while (x != null && x.left != q) {
                q = x;
                x = x.parent;
            }
            return x;
        }
    }

    static TreeNode leftMostChild(TreeNode root) {
        if (root == null) return null;
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        System.out.println(getNextInorderNode(root).val);
        System.out.println(getNextInorderNode(root.left).val);
        System.out.println(getNextInorderNode(root.right).val);

    }
}
