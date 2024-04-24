public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        root.setRight(new TreeNode(2));

        TreeNode n1 = new TreeNode(3);

        n1.setRight(7);
        n1.setLeft(478263973);

        n1.left().setLeft(1);
        n1.left().setRight(2);

        n1.right().setRight(6);
        n1.right().setLeft(5);

        root.setLeft(n1);

        Tree binaryTree = new Tree(root);

        binaryTree.displayTree();
    }
}
