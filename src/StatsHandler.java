public class StatsHandler {
	// * An array of all scrambles */
	private static Scramble[] scrambles;

	/**
	 * Returns the average time taken to complete the last n solves in milliseconds
	 * 
	 * @param n The number of solves to be averaged
	 * @return The average time taken to complete the solves
	 */
	public static int getAverage(int n) {
		int totalTime = 0;
		for (int i = scrambles.length - 1; i >= 0; i--) {
			Scramble s = scrambles[i];
			totalTime += s.getTime();
		}
		return totalTime / n;
	}

	/**
	 * Returns the average time taken to complete the last n solves in the format mm
	 * : ss : cc
	 * 
	 * @param n The number of solves to be averaged
	 * @return The average time taken to complete the solves
	 */
	public static String getFromatedAverage(int n) {
		int avg = getAverage(n);
		return Util.formatTime(avg);
	}

	/**
	 * The total amount of time spent solving scrambles in milliseconds
	 * 
	 * @return The total amount of time spent solving scrambles
	 */
	public static int getTotal() {
		int totalTime = 0;
		for (int i = 0; i < scrambles.length; i++) {
			Scramble s = scrambles[i];
			totalTime += s.getTime();
		}
		return totalTime;
	}

	/**
	 * The total amount of time spent solving scrambles in the format mm : ss : cc
	 * 
	 * @return The total amount of time spent solving scrambles
	 */
	public static String getFormatedTotal() {
		int total = getTotal();
		return Util.formatTime(total);
	}
}
