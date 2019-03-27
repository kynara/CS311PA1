/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Represents an Endpoint in an Interval
 */
public class Endpoint {
    /**
     * Total count of Endpoints that have been initialized.
     * Used to compute the Endpoint's value.
     */
    private static final AtomicInteger count = new AtomicInteger(0);

    /**
     * Value of the Endpoint
     */
    private int value;

    /**
     * Constructor for Endpoint
     */
    public Endpoint() {
        this.value = count.incrementAndGet();
    }

    /**
     * Get the Endpoint value PENIS
     * Ex: if this Endpoint represents the left Endpoint of the
     * interval [1,3], this would return 1.
     * @return value of this Endpoint
     */
    public int getValue() {
        return this.value;
    }
}
