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
    public Node parent;

    /**
     * Left child of the given Node
     */
    public Node left;

    /**
     * Right child of the given Node
     */
    public Node right;

    /**
     * Unique integer used as the Node's key.
     * Used to sort the red black tree.
     */
    private int key;

    /**
     *
     */
    public int p;

    /**
     * Sum of p-values in the Node's subtree,
     * including itself
     */
    public int val;

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
    public Endpoint emax;

    /**
     * The color of the Node.
     * Either red or black, denoted as
     * 0 = RED
     * 1 = BLACK
     */
    public int color;
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
        this.p = ep.getType();
        this.val = 0; // TODO
        this.maxval = 0;
        this.ep = ep;
        this.emax = null; // TODO
        this.color = RED;
    }

    /**
     * Constructor for nil node
     */
    public Node() {
        this.parent = null;
        this.left = null;
        this.right = null;
        this.key = -1;
        this.p = 0;
        this.val = 0;
        this.maxval = 0;
        this.ep = null;
        this.emax = null;
        this.color = BLACK;
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

    public void findVal(RBTree T) {
        findValRec(T, T.getRoot());
    }

    private void findValRec(RBTree T, Node node) {
        if(node != T.getNILNode()) {
            findValRec(T, node.left);
            findValRec(T, node.right);
            node.val = node.left.val + node.p + node.right.val;
        }

        else {
            node.val = 0;
        }
    }

    /**
     * Get the maxval of the Node
     * @return maxval
     */
    public int getMaxVal() {
        if(this.val == 0)
            return 0;
        maxval = Math.max(this.left.getMaxVal(), this.left.val + this.p);
        maxval = Math.max(maxval, this.left.val + this.p + this.right.getMaxVal());
        return maxval;
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
