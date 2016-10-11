/*
 * Swapping the letters in a string
 * Returns string
 */
import java.util.Arrays;
import java.util.List;

/**
 * The Class SwapCases.
 */
public class SwapCases {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.printf("Swapped Cases Output: %s", swapCases(null));
	}

	/**
	 * Swap cases.
	 *
	 * @param str the str
	 * @return the string
	 */
	private static String swapCases(String str) {

		try{
		String fs = "";
		List<String> s = Arrays.asList(str.split(""));
		for (String string : s) {
			if (string.matches("[a-z]*")) {
				fs += string.toUpperCase();
			} else if (string.matches("[A-Z]*")) {
				fs += string.toLowerCase();
			} else {
				fs += (string);
			}
		}
		return fs;
	}catch(NullPointerException ex){
		throw new NullPointerException("null string passed");
	}
}
}
