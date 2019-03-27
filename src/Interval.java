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

    /**
     * The left endpoint in the Interval.
     */
    private Endpoint leftEp;

    /**
     * The right endpoint in the Interval.
     */
    private Endpoint rightEp;

    /**
     * The unique ID of the Interval.
     */
    private int intervalID;

    public Interval(int leftEp, int rightEp) {
        intervalID = count.incrementAndGet();
        this.leftEp = new Endpoint(leftEp, 1);
        this.rightEp = new Endpoint(rightEp, -1 );
    }

    public Endpoint getLeftEp() {
        return this.leftEp;
    }

    public Endpoint getRightEp() {
        return this.rightEp;
    }

    public int getIntervalID() {
        return this.intervalID;
    }
}
