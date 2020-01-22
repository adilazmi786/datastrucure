package adil.array;

public class LongestPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "forgeeksskeefor";
		findLongestPalindrome(str);
	}

	private static void findLongestPalindrome(String str) {
		// TODO Auto-generated method stub

		System.out.println("Length is:"+searchPalindrome(str));
	}

	private static int searchPalindrome(String str) {
		// TODO Auto-generated method stub
		int maxLength = 1;
		int start = 0;
		for (int i = 1; i < str.length(); i++) {

			// for odd
			int low = i - 1;
			int high = i;
			while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {

				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < str.length() && str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		
		}
		System.out.println("Longest substring: "+longestPalindromeSubstring(str,start,start+maxLength-1));
		return maxLength;
	}

	private static String longestPalindromeSubstring(String str, int start, int end) {
		// TODO Auto-generated method stub
		
		return str.substring(start,end+1);
	}

}
