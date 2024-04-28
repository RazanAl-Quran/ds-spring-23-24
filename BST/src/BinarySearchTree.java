public class BinarySearchTree {

    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int val) {
        this.root = insertNode(this.root,val);
    }

    public TreeNode insertNode(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }
        if(val <= root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    public boolean search(int val) {
        return searchNode(this.root, val);
    }

    private boolean searchNode(TreeNode root, int val) {
        if (root == null) {
            return false;
        }

        if (val == root.val) {
            return true;
        } else if (val < root.val) {
            return searchNode(root.left, val);
        } else {
            return searchNode(root.right, val);
        }
    }




}
