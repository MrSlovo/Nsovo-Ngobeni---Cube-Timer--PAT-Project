/** A class that handles all generation and validation of scrambles */
public class ScrambleHandler {

	/** An array of all moves allowed to be included in the scramble */
	private static final String[] MOVE_SET_3x3 = { "R", "R'", "L", "L'", "F", "F'", "B", "B'", "U", "U'", "D", "D'" };

	/**
	 * Genearates a random scramble of 15 moves
	 * 
	 * @return A string representing a scramble in the standard cube notation format
	 */
	public static String generateScramble() {
		String scramble = "";
		for (int i = 0; i < 15; i++) {
			String move = MOVE_SET_3x3[(int) Math.floor(Math.random() * MOVE_SET_3x3.length)];
			scramble += move;
		}
		return scramble;
	}

	/**
	 * Generates a random scramble with a specified number of moves
	 * 
	 * @param scrambleLength The number of moves the scramble contains
	 * @return A string representing a scramble in the standard cube notation format
	 */
	public static String generateScramble(int scrambleLength) {
		String scramble = "";
		for (int i = 0; i < scrambleLength; i++) {
			String move = MOVE_SET_3x3[(int) Math.floor(Math.random() * MOVE_SET_3x3.length)];
			scramble += move;
		}
		return scramble;
	}
}
