/** A Scramble object that stores the relevent data relating to a scramble */
public class Scramble {
	/** The scramble written in standard cube notation */
	private String scrammble;
	/** The time taken to solve the scramble (in milliseconds) */
	private int time;

	/**
	 * Instantiates a new Scramble object
	 * 
	 * @param scrammble A string representation of the scramble used written in
	 *                  standard cube notation
	 * @param time      A integer value containing the time taken to complete the
	 *                  solve the scramble in milliseconds
	 */
	public Scramble(String scrammble, int time) {
		this.scrammble = scrammble;
		this.time = time;
	}

	/**
	 * Returns the scramble used to mix up the cube
	 * 
	 * @return A string containing the scramble used
	 */
	public String getScramble() {
		return scrammble;
	}

	/**
	 * Returns the time taken to solve the scramble
	 * 
	 * @return A integer containing time taken to solve the scramble
	 */
	public int getTime() {
		return time;
	}
}
