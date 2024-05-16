public class Main {
    public static void main(String[] args) {
        Tree binaryTree2 = new Tree(8);
        Tree binaryTree1 = new Tree(8);

        binaryTree1.addChildren("2,1,4,3,9,6,5,478263973");

        binaryTree2.addChild(2);
        binaryTree2.addChild(4);
        binaryTree2.addChild(3);
        binaryTree2.addChild(9);
        binaryTree2.addChild(478263973);
        binaryTree2.addChild(1);
        binaryTree2.addChild(6);
        binaryTree2.addChild(5);

        Tree mayoTree = new Tree(50);

        mayoTree.addChildren("25,13,38,6,3,9,1,75,62,88,94");

        mayoTree.displayTree();

        System.out.println(mayoTree.traverse());

        binaryTree2.displayTree();
        System.out.println();
        binaryTree1.displayTree();

        System.out.println(binaryTree2.traverse());
        System.out.println(binaryTree1.traverse());
    }
}
