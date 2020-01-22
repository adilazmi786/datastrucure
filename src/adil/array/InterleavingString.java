package adil.array;

public class InterleavingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "AB";
		String str2 = "C";
		char[] strArray = new char[str1.length() + str2.length()];
		strArray = (str1 + str2).toCharArray();
		System.out.print(print(strArray) + " ");

		printInterleavingString(strArray, str1);
		
		System.out.println();
		recursiveInterLeaving(str1,str2);

	}

	private static void recursiveInterLeaving(String str1, String str2) {
		// TODO Auto-generated method stub
		
		
	}

	private static void printInterleavingString(char[] strArray, String str1) {
		// TODO Auto-generated method stub
		for (int j = str1.length()-1; j >= 0; j--) {
			for (int i = j; i < strArray.length -1; i++) {
				char t = strArray[i];
				strArray[i] = strArray[i + 1];
				strArray[i + 1] = t;
				System.out.print(print(strArray) + " ");
			}
		}
	}

	private static String print(char[] strArray) {
		// TODO Auto-generated method stub
		return new String(strArray);
	}

}
