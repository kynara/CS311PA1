/**
 * Project 1
 * Created by Maxwell Talley, Kynara Fernandes, and Garrett Greenfield
 * for Com S 311 Spring 2019
 */

/**
 * Represents an Endpoint in an Interval
 */
public class Endpoint {
    /**
     * Value of the Endpoint
     */
    private int value;

    /**
     * The type of Endpoint that this is.
     * 0 for START
     * 1 for END
     */
    private int type;

    /**
     * ID of the interval the Endpoint is in.
     * Shares this ID with another Endpoint.
     */
    private int intervalID;

    private static final int START = -1;
    private static final int END = 1;

    /**
     * Constructor for Endpoint
     */
    public Endpoint(int value, int type) {
        this.value = value;
        this.type = type;
    }

    /**
     * Get the Endpoint value
     * Ex: if this Endpoint represents the left Endpoint of the
     * interval [1,3], this would return 1.
     * @return int
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Get the type of this Endpoint
     * Either: 0 for START Endpoint
     *
     * @return int
     */
    public int getType() { return this.type; }
}
