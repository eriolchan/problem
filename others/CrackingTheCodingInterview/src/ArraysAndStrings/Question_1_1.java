package ArraysAndStrings;

/**Question 1.1
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */
public class Question_1_1 {

	/**
	 * Complexity: O(n)
	 */
	public static boolean isUniqueChars_ASCII(String s) {
		
		if (s == null || s.length() == 0) {
			return false;
		}
		
		boolean[] visited = new boolean[256];
		for (int i = 0; i < visited.length; ++i) {
			visited[i] = false;
		}
		
		int len = s.length();
		for (int i = 0; i < len; ++i) {
			int index = (int)s.charAt(i);
			if (visited[index]) {
				return false;
			} else {
				visited[index] = true;
			}
		}
		
		return true;
	}
	
	/**
	 * Complexity: O(n)
	 */
	public static boolean isUniqueChars_Bits(String s) {
		
		if (s == null || s.length() == 0) {
			return false;
		}
		
		final int Bits = 32;
		
		int[] visited = new int[Bits];
		for (int i = 0; i < visited.length; ++i) {
			visited[i] = 0;
		}
		
		int len = s.length();
		for (int i = 0; i < len; ++i) {
			int index = (int)s.charAt(i);
			int block = index / Bits;
			int shift = index % Bits;
			
			if ((visited[block] & (1 << shift)) != 0) {
				return false;
			} else {
				visited[block] |= 1 << shift;
			}
		}
		
		return true;
	}
	
	public static boolean isUniqueChars_Self(String s) {
		
		if (s == null || s.length() == 0) {
			return false;
		}
		
		int len = s.length();
		for (int i = 0; i < len - 1; ++i) {
			for (int j = i + 1; j < len; ++j) {
				if (s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}
		
		return true;
	}
}