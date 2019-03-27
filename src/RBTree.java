/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

/**
 * Represents a Red-Black Tree
 */
public class RBTree {
    /**
     * Root Node of the RBTree
     */
    private Node root;

    /**
     * Number of internal nodes in the RBTree
     */
    private int size;

    /**
     * Height of the RBTree
     */
    private int height;

    /**
     * T.nil of the RBTree. The RBTree must have exactly one instance of nil
     */
    private Node nil;

    private static final int RED = 0;
    private static final int BLACK = 1;

    /**
     * Constructor for RBTree
     */
    public RBTree() {
        size = 0;
        height = 0;
        nil = new Node();
        root = nil;
    }

    /**
     * Get the root of the RBTree
     * @return root Node
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Get the nil Node
     *
     * NOTE: A red-black tree T must contain exactly one instance
     * of T.nil
     * @return the nil Node
     */
    public Node getNILNode() {
        return null;
    }

    /**
     * Get the number of internal nodes in the tree
     * @return size of the RBTree
     */
    public int getSize() {
        return size;
    }

    /**
     * Get the height the tree
     * @return the height of the RBTree
     */
    public int getHeight() {
        return height;
    }

    public void addNode(Node z) {
        size++;
        Node y = this.nil;
        Node x = this.root;
        while(x != this.nil) {
            y = x;
            if(z.getKey() < x.getKey()) {
                x = x.left;
            } else {
                x = x.right;
            }
        }
        z.parent = y;
        //NOT COMPLETE
    }
}
