/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Represents a collection of Intervals
 */
public class Intervals {
    private RBTree T;

    private static final int START = 1;
    private static final int END = -1;

    private Map<Integer, Interval> intervals;

    /**
     * Constructor for a collection of Intervals
     */
    public Intervals() {
        T = new RBTree();
        intervals = new HashMap<>();
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

        T.addNode(newInterval.getLeftEp());
        T.addNode(newInterval.getRightEp());

        intervals.put(newInterval.getIntervalID(), newInterval);
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
        Interval intervalToDelete = intervals.get(intervalID);
        T.deleteNode(intervalToDelete.getLeftEp());
        T.deleteNode(intervalToDelete.getRightEp());
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
        return getRBTree().getRoot().emax.getValue();
    }

    /**
     * Get the RBTree used
     * @return the RBTree being used for these Intervals
     */
    public RBTree getRBTree() {
        return this.T;
    }

    /**
     * This is a suggested way on how to add intervals and call POM()
     *
     * @param args
     */
    public static void main(String [] args) throws FileNotFoundException {
        String fileName = "res/large_1.txt";

        Scanner reader = new Scanner(new File(fileName));
        int size = reader.hasNext() ? reader.nextInt() : 0;

        int points[][] = new int[50020][2];
        int k = 0;
        while (reader.hasNext()){
            points[k][0] = reader.nextInt();
            points[k][1] = reader.nextInt();
            System.out.println(k);
            k++;
        }
        //        int points[][] = {{0, 4}, {1, 6}, {3, 9}, {7, 11}};

        Intervals intv = new Intervals();

        for(int i = 0; i<points.length; i++) {
//            System.out.println("Inserting: "+ Arrays.toString(points[i]));
            intv.intervalInsert(points[i][0], points[i][1]);
        }
        intv.T.findMaxVal(intv.T.getRoot());
        System.out.println("POM is: "+ intv.findPOM()); //Should return 3.
        System.out.println("should be: " + size);
    }
}
