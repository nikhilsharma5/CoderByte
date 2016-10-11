
/**
 * The Class Reverse.
 */
public class ReverseString {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		ReverseString r = new ReverseString();
		System.out.println(r.reverse("987654321"));

	}

	/**
	 * Reverse.
	 *
	 * @param str the str
	 * @return the string
	 */
	private String reverse(String str) {
		for (int i = 0; i < str.length(); i++) {
			str = str.substring(1, str.length() - i) + str.substring(0, 1)
					+ str.substring(str.length() - i, str.length());
		}
		return str;
	}
}
