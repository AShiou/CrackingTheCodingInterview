package ch4_TreesAndGraphs.Q8_commonAncester;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    TreeNode(int val) {
        this.val = val;
    }

    static TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length - 1);
    }

    static TreeNode createMinimalBST(int[] arr, int start, int end) {
        if (end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = createMinimalBST(arr, start, mid - 1);
        if (n.left != null) n.left.parent = n;
        n.right = createMinimalBST(arr, mid + 1, end);
        if (n.right != null) n.right.parent = n;
        return n;
    }

    void printInOrder(TreeNode root) {
        if (root != null) {
            printInOrder(root.left);
            System.out.println(root.val);
            printInOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        TreeNode root = TreeNode.createMinimalBST(array);
        root.printInOrder(root);
    }
}
