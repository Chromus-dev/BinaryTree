import ajs.printutils.PrettyPrintTree;
import java.util.ArrayList;

public class Tree {
    private TreeNode root;

    public Tree(Integer rootValue) {
        this.root = new TreeNode(rootValue);
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public int addRandomChild(int min, int max) {
        double random = Math.random();
        int numToAdd = (int) (random * max) + min;

        this.addChild(numToAdd);

        return numToAdd;
    }

    public void addChild(Integer val) {
        addChildHelper(val, root);
    }

    public void addChildren(String nodes) {
        int i = nodes.indexOf(',');
        while (i != -1) {
            this.addChild(Integer.parseInt(nodes.substring(0, i)));

            nodes = nodes.substring(i + 1);
            i = nodes.indexOf(',');
        }

        // add last number
        this.addChild(Integer.parseInt(nodes));
    }

    public void addChildHelper(Integer val, TreeNode parentNode) {
        if ((val > parentNode.value()) && !(val <= parentNode.value())) {
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

    public String traverse() {
        ArrayList<Integer> nodes = new ArrayList<Integer>();

        traverseHelper(this.root, nodes);

        String nodesString = "";
        int i = 0;

        while (i < nodes.size()) {
            nodesString += nodes.get(i).toString();

            if (nodes.size() > 1 && i < nodes.size() - 1)
                nodesString = nodesString + ", ";

            i++;
        }

        return nodesString;
    }

    public TreeNode traverseHelper(TreeNode root, ArrayList<Integer> nodes) {
        if (root == null)
            return null;

        nodes.add(root.value());

        traverseHelper(root.left(), nodes);
        traverseHelper(root.right(), nodes);
        return null;
    }

    public void displayTree() {
        PrettyPrintTree<TreeNode> prettyTree = new PrettyPrintTree<TreeNode>(
                TreeNode::getChildren,
                TreeNode::stringValue);

        prettyTree.display(this.root);
    }
}
