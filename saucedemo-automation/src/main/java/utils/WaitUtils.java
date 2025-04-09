package utils;

public class WaitUtils {
	 public static void pause(int millis) {
	        try {
	            Thread.sleep(millis);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void pauseDefault() {
	        pause(1000);  // default 1 second delay
	    }

}
