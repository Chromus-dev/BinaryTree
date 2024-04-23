public class Tree {
    private TreeNode root;

    public Tree(Integer root) {
        this.root = new TreeNode(root);
    }

    public void addChild(Integer val) {
        TreeNode parentNode = root;

        while (!(parentNode.left() == null && parentNode.right() == null)) {
            if (val > parentNode.value())
                parentNode = parentNode.right();
            else
                parentNode = parentNode.left();
        }

        if (val > parentNode.value())
            parentNode.setRight(new TreeNode(val));
        else
            parentNode.setLeft(new TreeNode(val));
    }

    // public Integer[] toArray() {
    // }

    public void displayTree() {
    }
}
