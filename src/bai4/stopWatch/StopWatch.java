package bai4.stopWatch;

public class StopWatch {
    static long startTime;
    static long endTime;
    public StopWatch(){

    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    public double  getElapsedTime() {
        return endTime - startTime;
    }
}
