import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class tests {

    /*
    EXPLANATION OF JUNIT TESTS
    @Test
    public void testName() {
        Node tester = new Node(); // the class Node is tested

        // assert statements
        assertEquals(expected-output, tester.method-to-be-tested(10, 0), "notes to be sent to user");

    }

    ----COPYABLE----
    TESTS FOR NODE CLASS
    @Test
    public void testName() {
        Node tester = new Node(); // the class Node is tested

        // assert statements
        assertEquals(expected, tester.method(10, 0), "notes");

    }

    TESTS FOR RBTREE
    @Test
    public void testName() {
        RBTree tester = new RBTree(); // the class Node is tested

        // assert statements
        assertEquals(expected, tester.method(10, 0), "notes");

    }

    TESTS FOR ENDPOINT
    @Test
    public void testName() {
         Endpoint tester = new Endpoint(); // the class Node is tested

        // assert statements
        assertEquals(expected, tester.method(10, 0), "notes");

    }

    TESTS FOR INTERVALS
    @Test
    public void testName() {
         Intervals tester = new Intervals(); // the class Node is tested

        // assert statements
        assertEquals(expected, tester.method(10, 0), "notes");

    }


    POSSIBLE ASSERTS
    assertTrue([message,] boolean condition)
    assertFalse([message,] boolean condition)
    assertEquals([message], expected, actual, tolerance(optional))
    assertNull([message,] object)
    assertNotNull([message,] object)
    assertSame([message,] expected, actual)
    assertNotSame([message,] expected, actual)

    */

    @Before
    public void setupRBTree(){
        //set this up for things that need to be created for the tests you make below

    }

    @Test
    public void testName() {
        RBTree tester = new RBTree(); // the class Node is tested

        // assert statements
        assertEquals(expected, tester.method(10, 0), "notes");

    }


}
