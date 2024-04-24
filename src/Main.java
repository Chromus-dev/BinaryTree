public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.setLeft(new TreeNode(2));
        root.setRight(new TreeNode(3));

        Tree binaryTree = new Tree(root);

        binaryTree.displayTree();
    }
}
