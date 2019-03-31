import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RBTreeTest {

    private RBTree tree;
    private Endpoint[] endpoints;

    private static final int START = 1;
    private static final int END = -1;

    @BeforeEach
    void setUp() {
        tree = new RBTree();

        endpoints = new Endpoint[8];
        endpoints[0] = new Endpoint(0, START);
        endpoints[1] = new Endpoint(1, START);
        endpoints[2] = new Endpoint(3, START);
        endpoints[3] = new Endpoint(4, END);
        endpoints[4] = new Endpoint(6, END);
        endpoints[5] = new Endpoint(7, START);
        endpoints[6] = new Endpoint(9, END);
        endpoints[7] = new Endpoint(11, END);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addNodeWorks() {
        for(int i = 0; i < 8; i++) {
            Node n = new Node(endpoints[i]);
            tree.addNode(n);
        }
        assertEquals("0 1 3 4 6 7 9 11 ", tree.breadthFirstTraversal(), "RBT does not add right 1");
    }

    @Test //adds the nodes in a random order still organizes it into the same BST
    void addNodeRandom() {
        tree = new RBTree();
        Node n = new Node(endpoints[3]);
        tree.addNode(n);
        n = new Node(endpoints[1]);
        tree.addNode(n);
        n = new Node(endpoints[0]);
        tree.addNode(n);
        n = new Node(endpoints[2]);
        tree.addNode(n);
        n = new Node(endpoints[4]);
        tree.addNode(n);
        n = new Node(endpoints[7]);
        tree.addNode(n);
        n = new Node(endpoints[6]);
        tree.addNode(n);
        n = new Node(endpoints[5]);
        tree.addNode(n);

        assertEquals("0 1 3 4 6 7 9 11 ", tree.breadthFirstTraversal(), "RBT does not add right");
    }

    @Test //deletes the last node added
    void deleteNodeWorks() {
        Node n = new Node();
        for(int i = 0; i < 8; i++) {
            n = new Node(endpoints[i]);
            tree.addNode(n);
        }
        tree.deleteNode(n);
        assertEquals("0 1 3 4 6 7 9 ", tree.breadthFirstTraversal(), "RBT does not delete right");
    }

    @Test //deletes node at the first location
    void deleteNodeOne() {
        tree = new RBTree();
        Node[] n = new Node[8];
        for(int i = 0; i < 8; i++) {
            n[i] = new Node(endpoints[i]);
            tree.addNode(n[i]);
        }

        tree.deleteNode(n[0]);
        assertEquals("1 3 4 6 7 9 11 ", tree.breadthFirstTraversal(), "RBT does not delete right");
    }

    @Test
    void deleteNodeOnEmpty() {
        tree = new RBTree();
        Node n = new Node();
        tree.deleteNode(n);

        assertEquals("null", tree.breadthFirstTraversal(), "RBT does not match expected");
    }

    @Test
    void getNILNode() {
        assertEquals("11", tree.getNILNode(), "RBT does not match expected");
    }

    @Test
    void getSize() {
        tree = new RBTree();
        for(int i = 0; i < 8; i++) {
            Node n = new Node(endpoints[i]);
            tree.addNode(n);
        }
        assertEquals(8, tree.getSize(), "RBT does not match expected");
    }

    @Test
    void getHeight() {
        tree = new RBTree();
        for(int i = 0; i < 8; i++) {
            Node n = new Node(endpoints[i]);
            tree.addNode(n);
        }
        assertEquals(4, tree.getHeight(), "RBT does not match expected");
    }

    @Test
    void findHeightAfterSingleAdd() {
        Node node = new Node(endpoints[0]);
        tree.addNode(node);
        assertEquals(0, tree.findHeight(), "Tree height is not correct");
    }

    @Test
    void findHeightWithMultipleAdd() {
        addMultipleNodes(tree);
        assertEquals(3 ,tree.findHeight(), "Tree height is not correct");
    }

    @Test
    void addNode() {

    }

    private void addMultipleNodes(RBTree T) {
        Node n;
        for(int i = 0; i < 8; i++) {
            n = new Node(endpoints[i]);
            T.addNode(n);
        }
    }
}