import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RBTreeTest {

    RBTree tree;

    @BeforeEach
    void setUp() {
        Endpoint[] endpoints = new Endpoint[8];
        endpoints[0] = new Endpoint(0);
        endpoints[1] = new Endpoint(1);
        endpoints[2] = new Endpoint(3);
        endpoints[3] = new Endpoint(4);
        endpoints[4] = new Endpoint(6);
        endpoints[5] = new Endpoint(7);
        endpoints[6] = new Endpoint(9);
        endpoints[7] = new Endpoint(11);

        System.out.println("HERE BUD");

        tree = new RBTree();
        for(int i = 0; i < 8; i++) {
            Node n = new Node(endpoints[i]);
            System.out.println("HERE" + i);
            tree.addNode(n);
            tree.breadthFirstTraversal();
        }

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getRoot() {
    }

    @Test
    void addNodeWorks(){
        tree.breadthFirstTraversal();
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