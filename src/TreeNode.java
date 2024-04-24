import java.util.*;

public class TreeNode {
    private Integer value;
    private TreeNode left = null;
    private TreeNode right = null;

    public TreeNode(Integer v) {
        this.value = v;
    }

    public ArrayList<TreeNode> getChildren() {
        ArrayList<TreeNode> children = new ArrayList<TreeNode>();

        children.add(this.left());
        children.add(this.right());

        return children;
    }

    public Integer value() {
        return this.value;
    }

    public String stringValue() {
        return this.value.toString();
    }

    public void setValue(Integer v) {
        this.value = v;
    }

    public TreeNode left() {
        return this.left;
    }

    public TreeNode right() {
        return this.right;
    }

    public void setLeft(TreeNode l) {
        this.left = l;
    }

    public void setRight(TreeNode r) {
        this.right = r;
    }

    public void setLeft(Integer l) {
        this.left = new TreeNode(l);
    }

    public void setRight(Integer r) {
        this.right = new TreeNode(r);
    }
}
