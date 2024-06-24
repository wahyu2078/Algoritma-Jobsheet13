public class BinaryTreeMain29 {
    public static void main(String[] args) {
        BinaryTree29 bt = new BinaryTree29();

        bt.add(11);
        bt.add(8);
        bt.add(2);
        bt.add(6);
        bt.add(3);



        System.out.print("Leaf : ");
        bt.displayLeafData();
        System.out.println(""); 

        System.out.print("Jumlah Leaf : " +bt.countLeafNodes());
        System.out.println(""); 

        System.out.print("Min : "+ bt.findMin());
        System.out.println(""); 

        System.out.print("Max : " + bt.findMax());
        System.out.println(""); 

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder (bt.root);
        System.out.println(""); 

        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");
        
        System.out.print("PostOrder Traversal :");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node : "+bt.find(5));
        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");

        System.out.print ("PreOrder Traversal :");
        bt.traversePreOrder(bt. root);
        System.out.println("");
    }
}