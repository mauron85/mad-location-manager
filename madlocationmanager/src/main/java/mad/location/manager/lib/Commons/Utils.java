package mad.location.manager.lib.Commons;

/**
 * Created by lezh1k on 2/13/18.
 */

public class Utils {

    public static int hertz2periodUs(double hz) { return (int) (1.0e6 / (1.0 / hz));}
    public static long nano2milli(long nano) {return (long) (nano / 1e6);}

    //todo move to some another better place
    public static double ACCELEROMETER_DEFAULT_DEVIATION = 0.1;
    public static final int GPS_MIN_TIME = 2000;
    public static final int GPS_MIN_DISTANCE = 0;
    public static final int SENSOR_DEFAULT_FREQ_HZ = 10;
    public static final int GEOHASH_DEFAULT_PREC = 8;
    public static final int GEOHASH_DEFAULT_MIN_POINT_COUNT = 2;
    //!!

    public enum LogMessageType {
        KALMAN_ALLOC,
        KALMAN_PREDICT,
        KALMAN_UPDATE,
        GPS_DATA,
        ABS_ACC_DATA,
        FILTERED_GPS_DATA
    }
}
