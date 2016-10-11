/*
 * Finds the longest string from an user entered string
 * returns longest string
 */
import java.util.Scanner;

/**
 * The Class LongestWord.
 */
public class LongestWord {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("Longest String: %s", longestWord(s.nextLine()));
		s.close();
	}

	/**
	 * Longest word.
	 *
	 * @param sen the sen
	 * @return the string
	 */
	public static String longestWord(String sen) {
		String[] arr = sen.split(" ");
		String fstr = "";
		if (arr.length == 1 && sen.length() > 1) {
			return sen;
		} else if (sen.length() == 0) {
			throw new NullPointerException("Empty string Passed");
		} else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i].length() < arr[i + 1].length()) {
					fstr = arr[i + 1];
				}
			}
			return fstr;
		}
	}}
