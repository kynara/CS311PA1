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
        root.parent = nil;
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

    /**
     *
     */
    public void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if(y.left != this.nil){
            y.left.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == this.nil){
            this.root = y;
        }
        else if(x == x.parent.left){
            x.parent.left = y;
        } else {
            x.parent.right = y;
        }
        y.left = x;
        x.parent = y;
    }

    /**
     *
     */
    public void rightRotate(Node x) {
        Node y = x.left;
        x.left = y.right;
        if(y.right != this.nil){
            y.right.parent = x;
        }
        y.parent = x.parent;
        if(x.parent == this.nil){
            this.root = y;
        }
        else if(x == x.parent.right){
            x.parent.right = y;
        } else {
            x.parent.left = y;
        }
        y.right = x;
        x.parent = y;
    }

    /**
     * Adds node to tree in correct position
     * @param z Node to be added
     */
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
        if(y == this.nil) {
            this.root = z;
        }
        else if(z.getKey() < y.getKey()) {
            y.left = z;
        } else {
            y.right = z;
        }
        z.left = this.nil;
        z.right = this.nil;
        z.color = RED;

        //THIS IS THE FIX UP PART

        while(z.parent.color == RED) {
            if(z.parent == z.parent.parent.left) {
                y = z.parent.parent.right;
                if(y.color == RED) {
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if(z == z.parent.right) {
                        z = z.parent;
                        leftRotate(z);
                    }
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    rightRotate(z.parent.parent);
                }
            } else {
                //THE SAME ASS BEFORE WITH LEFT AND RIGHT EXCHANGED KILL ME NOW
            }
        }
    }



}
