import java.time.LocalDateTime;

/** A Scramble object that stores the relevent data relating to a scramble */
public class Scramble {
	/** The scramble written in standard cube notation */
	private String scramble;
	/** Whether or not the solve has been succesfully completed */
	private boolean solveStatus;
	/** The time taken to solve the scramble (in milliseconds) */
	private int time;
	/** The date and time the solve was completed */
	private LocalDateTime timeOfSolve;

	/**
	 * Instantiates a new Scramble object
	 * 
	 * @param scrammble A string representation of the scramble used written in
	 *                  standard cube notation
	 * @param time      A integer value containing the time taken to complete the
	 *                  solve the scramble in milliseconds
	 */
	public Scramble(String scrammble, int time) {
		this.scramble = scrammble;
		this.time = time;
		timeOfSolve = LocalDateTime.now();
	}

	/**
	 * Returns the scramble used to mix up the cube
	 * 
	 * @return A string containing the scramble used
	 */
	public String getScramble() {
		return scramble;
	}

	/**
	 * Changes the scramble
	 * 
	 * @param scramble The new scramble to be stored
	 */
	public void setScramble(String scramble) {
		this.scramble = scramble;
	}

	/**
	 * Returns a boolean value representing whether or not the scramble has been
	 * succesfully solved
	 * 
	 * @return The solve status of the scramble
	 */
	public boolean getStatus() {
		return solveStatus;
	}

	/**
	 * Changes the solve status of the scramble
	 * 
	 * @param solveStatus The new solve status of the scramble
	 */
	public void setSolveStatus(boolean solveStatus) {
		this.solveStatus = solveStatus;
	}

	/**
	 * Returns the time taken to solve the scramble
	 * 
	 * @return A integer containing time taken to solve the scramble
	 */
	public int getTime() {
		return time;
	}

	/**
	 * Changes the time taken to solve the scramble
	 * 
	 * @param time An integer value with the new time value in milliseconds
	 */
	public void setTime(int time) {
		this.time = time;
	}

	/**
	 * Returns the time the solve was completed
	 * 
	 * @return A LocalDateTime object containg the date the solve was completed
	 */
	public LocalDateTime getTimeOfSolve() {
		return timeOfSolve;
	}

	/**
	 * Changes the date and time the scramble was completed to the current date and
	 * time
	 */
	public void setTimeOfSolve() {
		this.timeOfSolve = LocalDateTime.now();
	}

	/**
	 * Changes the date and time the scramble was completed
	 * 
	 * @param timeOfSolve The new time of solve
	 */
	public void setTimeOfSolve(LocalDateTime timeOfSolve) {
		this.timeOfSolve = timeOfSolve;
	}
}
