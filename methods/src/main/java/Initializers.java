public class Initializers {
    private static final int NUM_BUCKETS = 45;
    public static void main(String[] args) {
        //NUM_BUCKETS = 5; // DOES NOT COMPILE
    }

    private static final int NUM_SECONDS_PER_HOUR;
    static {
        int numSecondsPerMinute = 60;
        int numMinutesPerHour = 60;
        NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
    }
}
