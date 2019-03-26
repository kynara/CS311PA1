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
     * Constructor for RBTree
     */
    public RBTree() {

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
        return -1;
    }

    /**
     * Get the height the tree
     * @return the height of the RBTree
     */
    public int getHeight() {
        return -1;
    }
}
