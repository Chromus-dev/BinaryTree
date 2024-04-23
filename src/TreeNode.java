public class TreeNode {
    private Integer value;
    private TreeNode left = null;
    private TreeNode right = null;

    public TreeNode(Integer v) {
        this.value = v;
    }

    public Integer value() {
        return this.value;
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
}
