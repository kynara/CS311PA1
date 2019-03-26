/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

/**
 * Represents a node in the RBTree.
 */
public class Node {
    private Node parent;
    private Node left;
    private Node right;
    private int key;
    private int p;
    private int val;
    private int maxval;
    private Endpoint ep;
    private Endpoint emax;
    private int color;

    /**
     * Constructor for a Node
     */
    public Node() {

    }

    /**
     * Get the parent of the Node
     * @return parent Node
     */
    public Node getParent() {
        return null;
    }

    /**
     * Get the left child of the Node
     * @return left child
     */
    public Node getLeft() {
        return null;
    }

    /**
     * Get the right child of the Node
     * @return right child
     */
    public Node getRight() {
        return null;
    }

    /**
     * Get the key of the Node
     * @return key
     */
    public int getKey() {
        return 0;
    }

    /**
     * Get the value of function p based on the endpoint
     * @return the value of p
     */
    public int getP() {
        return 0;
    }

    /**
     * Get the val of the Node
     * @return val
     */
    public int getVal() {
        return 0;
    }

    /**
     * Get the maxval of the Node
     * @return maxval
     */
    public int getMaxVal() {
        return 0;
    }

    /**
     * Get the Endpoint that the Node represents
     * @return this Node's Endpoint
     */
    public Endpoint getEndpoint() {
        return null;
    }

    /**
     * Get emax value. Calling this on the root Node will give
     * the Endpoint object whose getValue() provides a point of
     * maximum overlap.
     * @return Endpoint representing emax
     */
    public Endpoint getEmax() {
        return null;
    }

    /**
     * Returns 0 if red, 1 if black
     * @return int representing a color
     */
    public int getColor() {
        return -1;
    }
}
