public class BinaryTreeArray29 {
    int[] data;
    int idxLast;
    int maxSize;

    public BinaryTreeArray29(){
        maxSize = 10;
        data = new int[10];
        idxLast = -1; 
    }
    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    void traverseInOrder(int idxStart){
        if(idxStart<=idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.print(data[idxStart]+" ");
            traverseInOrder(2*idxStart+2);
        }
    }

    void add(int data) {
        if (idxLast < maxSize - 1) {
            idxLast++;
            this.data[idxLast] = data;
        } else {
            System.out.println("Tree is full!");
        }
    }

    void traversePreOrder() {
        traversePreOrder(0); // Start traversal from root
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " "); // Print current node
            traversePreOrder(2 * idxStart + 1); // Traverse left subtree
            traversePreOrder(2 * idxStart + 2); // Traverse right subtree
        }
    }

    void traversePostOrder() {
        traversePostOrder(0); // Start traversal from root
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1); // Traverse left subtree
            traversePostOrder(2 * idxStart + 2); // Traverse right subtree
            System.out.print(data[idxStart] + " "); // Print current node
        }
    }
}