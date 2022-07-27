import java.util.TimerTask;

/**
 * Deals with all code related to recording, displaying and calculating times
 */
public class TimeHandler extends TimerTask {

  private static int time = 0;
  private static boolean countState = false;

  // Timer task run method. Gets called each time the timer task is executed
  public void run() {
    System.out.print("Triggered \t");

    if (countState) {
      time += 1;
    }

    System.out.println("countState: ");
    System.out.println(countState);
    System.out.println("time: ");
    System.out.println(time);
  }

  /**
   * Increment the time elapsed by a specified incremental value
   * 
   * @param increment The increment (in milliseconds) that will be applied to to
   *                  the time
   */
  public static void incrementTime(int increment) {
    if (countState)
      time += increment;
  }

  /**
   * Changes the count state of the program
   * @param countState The new count state of the program
   */
  public static void setCountState(boolean countState) {
    TimeHandler.countState = countState;
  }

  /**
   * Returns the current count state of the program
   * @return Count state of the program
   */
  public static boolean getCountState() {
    return countState;
  }

  /**
   * Toggles the count state on and off
   */
  public static void toggleCountState() {
    countState = !countState;
  }

  /**
   * Sets the time elapsed in milliseconds
   * 
   * @param time The time elapsed in milliseconds
   */
  public static void setTime(int time) {
    TimeHandler.time = time;
  }

  /**
   * Returns the time elapsed in milliseconds
   * 
   * @return The time elapsed in milliseconds
   */
  public static int getTime() {
    return time;
  }

  /**
   * Converts time in milliseconds to the format mm : ss : milliseconds
   * 
   * @return A string representing the time formated mm : ss : milliseconds
   */
  public static String getFormatedTime() {
    return Util.formatTime(time);
  }
}
