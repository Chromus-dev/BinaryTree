public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Tree binaryTree = new Tree(8);

        binaryTree.addChild(2);
        binaryTree.addChild(1);
        binaryTree.addChild(5);

        binaryTree.displayTree();
    }
}
