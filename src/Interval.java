/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Represents an Interval with two Endpoints
 */
public class Interval {
    /**
     * Total count of Intervals that have been initialized.
     * Used to generate intervalID.
     */
    private static final AtomicInteger count = new AtomicInteger(0);


    private static final int START = 1;
    private static final int END = -1;


    /**
     * The left endpoint in the Interval.
     */
    private Node leftEp;

    /**
     * The right endpoint in the Interval.
     */
    private Node rightEp;

    /**
     * The unique ID of the Interval.
     */
    private int intervalID;

    public Interval(int leftEp, int rightEp) {
        intervalID = count.incrementAndGet();
        this.leftEp = new Node(new Endpoint(leftEp, START));
        this.rightEp = new Node(new Endpoint(rightEp, END));
    }

    public Node getLeftEp() {
        return this.leftEp;
    }

    public Node getRightEp() {
        return this.rightEp;
    }

    public int getIntervalID() {
        return this.intervalID;
    }
}
