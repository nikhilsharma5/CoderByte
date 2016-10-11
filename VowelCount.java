/*
 * Counts Vowels in a passed String and adds them to a map<string, integer>
 * returns the map with count of vowels arranged alphabetically (Used TreeMap for key based sorting)
 */
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * The Class VowelCount.
 */
public class VowelCount {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.printf("Vowel Count: %s", vowelCount("aeiouaeiouaeiou lllmmmaaannn"));
	}

	/**
	 * Vowel count.
	 *
	 * @param str the str
	 * @return the map
	 */
	public static Map<String, Integer> vowelCount(String str) {
		Map<String, Integer> vowels = new TreeMap<>();
		List<String> vowel = Arrays.asList("a", "e", "i", "o", "u");
		int i = 1;
		for (char c : str.toCharArray()) {
			if (vowel.contains(String.valueOf(c))) {
				if (!vowels.containsKey(String.valueOf(c))) {
					vowels.put(String.valueOf(c), i);
				} else {
					for (Entry<String, Integer> entry : vowels.entrySet()) {
						if (entry.getKey().equals(String.valueOf(c))) {
							entry.setValue(entry.getValue() + i);
						}
					}
				}
			}
		}
		return vowels;
	}
}
