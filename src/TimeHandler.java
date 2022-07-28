import java.util.TimerTask;

/**
 * Deals with all code related to recording, displaying and calculating times
 */
public class TimeHandler extends TimerTask {

  private int time = 0;
  private boolean countState = false;

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
  public void incrementTime(int increment) {
    if (countState)
      time += increment;
  }

  /**
   * Changes the count state of the program
   * 
   * @param countState The new count state of the program
   */
  public void setCountState(boolean countState) {
    this.countState = countState;
  }

  /**
   * Returns the current count state of the program
   * 
   * @return Count state of the program
   */
  public boolean getCountState() {
    return countState;
  }

  /**
   * Toggles the count state on and off
   */
  public void toggleCountState() {
    countState = !countState;
  }

  /**
   * Sets the time elapsed in milliseconds
   * 
   * @param time The time elapsed in milliseconds
   */
  public void setTime(int time) {
    this.time = time;
  }

  /**
   * Returns the time elapsed in milliseconds
   * 
   * @return The time elapsed in milliseconds
   */
  public int getTime() {
    return time;
  }

  /**
   * Converts time in milliseconds to the format mm : ss : milliseconds
   * 
   * @return A string representing the time formated mm : ss : milliseconds
   */
  public String getFormatedTime() {
    return Util.formatTime(time);
  }
}
