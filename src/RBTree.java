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

    private String rbtString;

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
     * Iterates through the tree breadth wise
     * @return RBT in string form
     */
    public String breadthFirstTraversal()
    {
        rbtString = "";
        breadthFirstTraversalRec(root);
        System.out.println();
        return rbtString;
    }

    /**
     * Recursively iterates through a subtree
     * @param x Subtree to which the method iterates
     */
    public void breadthFirstTraversalRec(Node x) {
        if(x != this.nil) {
            breadthFirstTraversalRec(x.left);
            System.out.print(x.getKey() + "\t");
            rbtString += x.getKey() + " ";
            breadthFirstTraversalRec(x.right);
        }
    }

    /**
     *
     * @param x
     */
    public void leftRotate(Node x) {
        Node y = x.right;
        x.right = y.left;
        if(y.left != this.nil) {
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
     * @param x
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
                y = z.parent.parent.left;
                if(y.color == RED) {
                    z.parent.color = BLACK;
                    y.color = BLACK;
                    z.parent.parent.color = RED;
                    z = z.parent.parent;
                } else {
                    if(z == z.parent.left) {
                        z = z.parent;
                        rightRotate(z);
                    }
                    z.parent.color = BLACK;
                    z.parent.parent.color = RED;
                    leftRotate(z.parent.parent);
                }
            }
        }
        this.root.color = BLACK;
    }

    public void rbtTransplant(Node u, Node v){
        if (u.parent == this.nil) {
            this.root = v;
        }
        else if (u == u.parent.left) {
            u.parent.left = v;
        } else {
            u.parent.right = v;
        }
        v.parent = u.parent;
    }

    /**
     * Finds the minimum value of subtree
     * @param x
     * @return Minimum value of subtree x
     */
    public Node rbtMinimum(Node x){
        while(x.left != this.nil){
            x = x.left;
        }
        return x;
    }

    /**
     * Finds the maximum value of subtree
     * @param x
     * @return Maximum value of subtree x
     */
    public Node rbtMaximum(Node x){
        while(x.right != this.nil){
            x = x.right;
        }
        return x;
    }

    /**
     * Deletes node from tree
     * @param z Node to be deleted
     */
    public void deleteNode(Node z) {
        Node y = z;
        Node x;
        int yOriginalColor = y.color;
        if(z.left == this.nil){
            x = z.right;
            rbtTransplant(z, z.right);
        }
        else if(z.right == this.nil){
            x = z.left;
            rbtTransplant(z, z.left);
        } else {
            y = rbtMinimum(z.right);
            yOriginalColor = y.color;
            x = y.right;
            if(y.parent == z){
                x.parent = y;
            } else {
                rbtTransplant(y, y.right);
                y.right = z.right;
                y.right.parent = y;
            }
            rbtTransplant(z, y);
            y.left = z.left;
            y.left.parent = y;
            y.color = z.color;
        }
        if(yOriginalColor == BLACK) {
            //FIX UP CODE
            Node w;
            while(x != this.root && x.color == BLACK) {
                if(x == x.parent.left) {
                    w = x.parent.right;
                    if(w.color == RED) {
                        w.color = BLACK;
                        x.parent.color = RED;
                        leftRotate(x.parent);
                        w = x.parent.right;
                    }
                    if(w.left.color == BLACK && w.right.color == BLACK) {
                        w.color = RED;
                        x = x.parent;
                    }
                    else if(w.right.color == BLACK){
                        w.left.color = BLACK;
                        w.color = RED;
                        rightRotate(w);
                        w = x.parent.right;
                    }
                    w.color = x.parent.color;
                    x.parent.color = BLACK;
                    w.right.color = BLACK;
                    leftRotate(x.parent);
                    x = this.root;
                }
                else{
                    w = x.parent.left;
                    if(w.color == RED) {
                        w.color = BLACK;
                        x.parent.color = RED;
                        rightRotate(x.parent);
                        w = x.parent.left;
                    }
                    if(w.right.color == BLACK && w.left.color == BLACK) {
                        w.color = RED;
                        x = x.parent;
                    }
                    else if(w.left.color == BLACK){
                        w.right.color = BLACK;
                        w.color = RED;
                        leftRotate(w);
                        w = x.parent.left;
                    }
                    w.color = x.parent.color;
                    x.parent.color = BLACK;
                    w.left.color = BLACK;
                    rightRotate(x.parent);
                    x = this.root;
                }
            }
            x.color = BLACK;
        }
    }
}
