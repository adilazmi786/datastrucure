package adil.datastructure;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string...");
        String name = s.nextLine();                 // Reading input from STDIN
        Map<Character,Integer> hmap=new HashMap();
        int c;
        for(int i=0;i<name.length();i++)
        {
            if(hmap.containsKey(name.charAt(i)))
            {
            	int val=hmap.get(name.charAt(i));
            	hmap.put(name.charAt(i),val+1);
            }
            
            else
            hmap.put(name.charAt(i),1);
            
        }
        int max=0;
        char ch = 0;
      //  Collections.sort(hmap, c);
        for(Character ch1: hmap.keySet())
        {
        	
        	 if(max<hmap.get(ch1))
             {
        		 
                 max=hmap.get(ch1);
                 ch=ch1;
             //    if()
                 
             }
        }
        System.out.println(ch+" "+max);
	}

}

