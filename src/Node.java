/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

/**
 * Represents a node in the RBTree.
 */
public class Node {
    /**
     * Parent of the given Node
     */
    private Node parent;

    /**
     * Left child of the given Node
     */
    private Node left;

    /**
     * Right child of the given Node
     */
    private Node right;

    /**
     * Unique integer used as the Node's key.
     * Used to sort the red black tree.
     */
    private int key;

    /**
     *
     */
    private int p;

    /**
     * Sum of p-values in the Node's subtree,
     * including itself
     */
    private int val;

    /**
     * Maximum 'val' in the Node's subtree,
     * including itself
     */
    private int maxval;

    /**
     * The Endpoint associated with the given
     * Node.
     */
    private Endpoint ep;

    /**
     * The Endpoint with the maximum overlap
     */
    private Endpoint emax;

    /**
     * The color of the Node.
     * Either red or black, denoted as
     * 0 = red
     * 1 = black
     */
    private int color;
    private static final int RED = 0;
    private static final int BLACK = 1;

    /**
     * Constructor for a Node
     */
    public Node(Endpoint ep) {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.key = ep.getValue();
        this.p = 0; // TODO
        this.val = 0; // TODO
        this.maxval = 0;
        this.ep = ep;
        this.emax = null; // TODO
        this.color = 0; // TODO
    }

    /**
     * Get the parent of the Node
     * @return parent Node
     */
    public Node getParent() {
        return this.parent;
    }

    /**
     * Get the left child of the Node
     * @return left child
     */
    public Node getLeft() {
        return this.left;
    }

    /**
     * Get the right child of the Node
     * @return right child
     */
    public Node getRight() {
        return this.right;
    }

    /**
     * Get the key of the Node
     * @return key
     */
    public int getKey() {
        return this.key;
    }

    /**
     * Get the value of function p based on the endpoint
     * @return the value of p
     */
    public int getP() {
        return this.p;
    }

    /**
     * Get the val of the Node
     * @return val
     */
    public int getVal() {
        return this.val;
    }

    /**
     * Get the maxval of the Node
     * @return maxval
     */
    public int getMaxVal() {
        return this.maxval;
    }

    /**
     * Get the Endpoint that the Node represents
     * @return this Node's Endpoint
     */
    public Endpoint getEndpoint() {
        return this.ep;
    }

    /**
     * Get emax value. Calling this on the root Node will give
     * the Endpoint object whose getValue() provides a point of
     * maximum overlap.
     * @return Endpoint representing emax
     */
    public Endpoint getEmax() {
        return this.emax;
    }

    /**
     * Returns 0 if red, 1 if black
     * @return int representing a color
     */
    public int getColor() {
        return this.color;
    }
}
