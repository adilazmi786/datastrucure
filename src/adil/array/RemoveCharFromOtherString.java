package adil.array;

public class RemoveCharFromOtherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="geeksforgeeks";
		String str1="elephakntg";
		
		removeCharFromFirstStringIfPresentInSecondString(str,str1);
		
	}

	private static void removeCharFromFirstStringIfPresentInSecondString(String str, String str1) {
		// TODO Auto-generated method stub
		int count[]=new int[256];
		for(int i=0;i<str1.length();i++) {
			count[str1.charAt(i)]++;
		}
		int k=0;
		char[] strA=str.toCharArray();
		for(int i=0;i<strA.length;i++) {
			if(count[strA[i]]==0) {
				strA[k++]=strA[i];
			}
		}
		str=new String(strA);
		
		System.out.println("string :"+str.substring(0,k));
	}

}
