/**
 * The Class Factorial.
 */
public class Factorial {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		Factorial f = new Factorial();
		System.out.printf("Factorial: %s", f.factorial(40));

	}

	/**
	 * Factorial.
	 *
	 * @param num
	 *            the num
	 * @return the int
	 */
	private long factorial(Integer num) {
		long factorial = 1;
		if (num <= 0) {
			throw new IllegalArgumentException("Invalid Input");
		} else {
			for (int i = 1; i <= num; i++) {
					factorial = factorial * i;
			}
		}
		return factorial;
	}
}
