/**
 * 
 */
package adil.array;

/**
 * @author NoQCart
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Listen";
		String str1 = "Sileno";
		if (anagram(str.toLowerCase(), str1.toLowerCase()))
		System.out.print("Yes , It's Anagram.");
		else {
			System.out.print("Nope !");

		}
		String s1="bbcDEF";
		char c=' ';
		//if(s1.charAt(0)>='a' && s1.charAt(0)<='z')
		 c=(char)(s1.charAt(0)-32);
		
		System.out.println(c);
	}

	private static boolean anagram(String str, String str1) {
		// TODO Auto-generated method stub

		int ch1[] = new int[26];
		int ch2[] = new int[26];

		for (int i = 0; i < str.length() && i < str1.length(); i++) {
			ch1[str.charAt(i) - 'a']++;
			ch2[str1.charAt(i) - 'a']++;

		}
		for (int i = 0; i < 26; i++)
			if (ch1[i] != ch2[i]) {
				return false;
			}
		return true;
	}

}
