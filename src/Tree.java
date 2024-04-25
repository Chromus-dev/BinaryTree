import ajs.printutils.PrettyPrintTree;

public class Tree {
    private TreeNode root;

    public Tree(Integer rootValue) {
        this.root = new TreeNode(rootValue);
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void addChild(Integer val) {
        addChildHelper(val, root);
    }

    public void addChildHelper(Integer val, TreeNode parentNode) {
        if (val > parentNode.value()) {
            if (parentNode.right() == null)
                parentNode.setRight(val);
            else
                addChildHelper(val, parentNode.right());
        } else {
            if (parentNode.left() == null)
                parentNode.setLeft(val);
            else
                addChildHelper(val, parentNode.left());
        }
    }

    // public Integer[] toArray() {
    // }

    public void displayTree() {
        PrettyPrintTree<TreeNode> prettyTree = new PrettyPrintTree<TreeNode>(
                TreeNode::getChildren,
                TreeNode::stringValue);

        prettyTree.display(this.root);
    }
}
