package deneme;
import java.util.Timer;
import java.util.TimerTask;

public class timer {
	
	
		private static long start;
	    private static long end;
	    private static boolean started;
	    
	    private static boolean isStopped() {
	        return !started;
	    }
	 
	    private static boolean isStarted() {
	        return started;
	    }
	 
	    public static void start() {
	        if (isStopped()) {
	            startTimer();
	        } else {
	            throw new RuntimeException("Hata: Kronometre (Timer) zaten ba�lat�lm�� durumda!!!\n");
	        }
	    }
	 
	    private static void startTimer() {
	        start = System.nanoTime();
	        started = true;
	    }
	 
	    public static void stop() {
	        if (isStarted()) {
	            stopTimer();
	        } else {
	            throw new RuntimeException("Hata: Kronometre (Timer) ba�lat�lmad�!!!\n");
	        }
	    }
	 
	    private static void stopTimer() {
	        end = System.nanoTime();
	        started = false;
	    }
	 
	    public static long getElapsedTime() {
	        if (isStopped()) {
	            return end - start;
	        } else {
	            throw new RuntimeException("Hata: Kronometre (Timer) durdurulmad�!!!\n");
	        }
	 
	    }
	 
	    public static double getElapsedMilliseconds() {
	        double seconds = (double) getElapsedTime() / 1000000.0;
	        return seconds;
	    }
	 
	    public static double getElapsedSeconds() {
	        double seconds = (double) getElapsedTime() / 1000000000.0;
	        return seconds;
	    }
	}

