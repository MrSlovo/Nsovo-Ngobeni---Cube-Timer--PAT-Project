/** A utility class that acts as a vendor for common tasks throughout the program */
public class Util {
	public static String formatTime(int time) {
    // Converts milliseconds into minutes and seconds
    int min = (int) Math.floor((time % (1000 * 60 * 60)) / (1000 * 60));
    int sec = (int) Math.floor((time % (1000 * 60)) / 1000);
    int centi = (int) Math.floor((time % 1000) / 10);

    // Converts time into seconds and adds leading 0's where applicalble
    String minPad = min < 10 ? "0" + min : min + "";
    String secPad = sec < 10 ? "0" + sec : sec + "";
    String centiPad = centi < 10 ? "0" + centi : centi + "";

		// Return the time in formate mm : ss : cc
    return minPad + ":" + secPad + ":" + centiPad;
	}
}
