import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    private RBTree T;
    private Endpoint[] endpoints;

    private static final int START = 1;
    private static final int END = -1;

    @BeforeEach
    void setUp() {
        T = new RBTree();
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
    void getParent() {
    }

    @Test
    void getLeft() {
    }

    @Test
    void getRight() {
    }

    @Test
    void getKey() {
    }

    @Test
    void getP() {
    }

    @Test
    void getValAfterOnePairAdd() {
        Node left = new Node(endpoints[0]);
        Node right = new Node(endpoints[3]);

        T.addNode(left);
        T.addNode(right);

        assertEquals(0, left.val, "Start Node val is not correct");
        assertEquals(-1, right.val, "End Node val is not correct");
    }

    @Test
    void getValAfterMultipleAdd() {
        addMultipleNodes(T);

        assertEquals(0, T.getRoot().val, "Root Node val is not correct");
        assertEquals(3, T.getRoot().left.val, "Root Node left child val is not correct");
        assertEquals(-2, T.getRoot().right.val, "Root Node right child val is not correct");
    }

    @Test
    void getValAfterDelete() {
        addMultipleNodes(T);
        T.deleteNode(T.getRoot());

        assertEquals(1, T.getRoot().getVal(), "New root after root delete has wrong val");
    }

    @Test
    void getMaxVal() {

    }

    @Test
    void getEndpoint() {
    }

    @Test
    void getEmax() {
    }

    @Test
    void getColor() {
    }

    private void addMultipleNodes(RBTree T) {
        Node n;
        for(int i = 0; i < 8; i++) {
            n = new Node(endpoints[i]);
            T.addNode(n);
        }
    }
}