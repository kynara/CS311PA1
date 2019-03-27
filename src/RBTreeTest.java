import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class RBTreeTest {

    private RBTree tree;
    private Endpoint[] endpoints;

    @BeforeEach
    void setUp() {
        endpoints = new Endpoint[8];
        endpoints[0] = new Endpoint(0);
        endpoints[1] = new Endpoint(1);
        endpoints[2] = new Endpoint(3);
        endpoints[3] = new Endpoint(4);
        endpoints[4] = new Endpoint(6);
        endpoints[5] = new Endpoint(7);
        endpoints[6] = new Endpoint(9);
        endpoints[7] = new Endpoint(11);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getRoot() {
    }

    @Test
    void addNodeWorks(){
        tree = new RBTree();
        for(int i = 0; i < 8; i++) {
            Node n = new Node(endpoints[i]);
            tree.addNode(n);
        }
        assertEquals("0 1 3 4 6 7 9 11 ", tree.breadthFirstTraversal(), "RBT does not match expected");
    }

    @Test
    void getNILNode() {
    }

    @Test
    void getSize() {
    }

    @Test
    void getHeight() {
    }

    @Test
    void addNode() {
    }
}