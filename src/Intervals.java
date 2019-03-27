/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

/**
 * Represents a collection of Intervals
 */
public class Intervals {
    private RBTree T;

    /**
     * Constructor for a collection of Intervals
     */
    public Intervals() {
        // TODO, figure out what data structure to use for this
    }

    /**
     * Adds the interval with left Endpoint a and right Endpoint b
     * to the collection of Intervals.
     *
     * Each newly inserted interval must be assigned an ID. The IDs
     * should be consecutive.
     *
     * Runs in O(log(n)) time.
     *
     * Ex: call intervalInsert successively on intervals [5,7], [4,9],
     * and [1,8], then IDs should be 1, 2, 3, respectively.
     * @param a left Endpoint
     * @param b right Endpoint
     */
    public void intervalInsert(int a, int b) {
        Interval newInterval = new Interval(a, b);
        // TODO
    }

    /**
     * Deletes an interval with a specified ID
     *
     * Runs in O(log(n)) time.
     *
     * Do not need to implement, but is necessary to have.
     *
     * @param intervalID ID of the interval to delete from the collection
     * @return true if successful, false otherwise.
     */
    public boolean intervalDelete(int intervalID) {
        // TODO for extra credit
        return false;
    }

    /**
     * Finds the Endpoint that has maximum overlap.
     *
     * Runs in O(1) time.
     *
     * @return the value of the Endpoint with maximum overlap
     */
    public int findPOM() {
        // TODO, double check this
        return getRBTree().getRoot().emax.getValue();
    }

    /**
     * Get the RBTree used
     * @return the RBTree being used for these Intervals
     */
    public RBTree getRBTree() {
        return this.T;
    }
}
