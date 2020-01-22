package adil.array;

public class FirstNonRepeatedCharacter {

	public static void main(String args[]) {
		String str="gezaeksofrgeeks";
		int ch=firstNonRepeatingCharacter(str);
		System.out.println(str.charAt(ch));
	}

	private static int firstNonRepeatingCharacter(String str) {
		// TODO Auto-generated method stub
		int hmap[]=new int[26];
		for(int i=0;i<str.length();i++){
			hmap[str.charAt(i)-'a']++;
			
		}
		int index = -1;
		for(int i=0;i<26;i++){
			if(hmap[str.charAt(i)-'a']==1) {
				index=i;
				break;
			}
		}
		return index;
	}
}
