package adil.array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
    	 boolean isRansom=false;
         HashMap<String,Integer> magazineMap=new HashMap<String,Integer>();
         HashMap<String,Integer> noteMap=new HashMap<String,Integer>();
         for(String mag:note){
             if(!noteMap.containsKey(mag)){
                 noteMap.put(mag,1);
             }else{
                 noteMap.replace(mag,noteMap.get(mag)+1);
             }
         }
         for(String mag:note){
             if(!noteMap.containsKey(mag)){
                 noteMap.put(mag,1);
             }else{
                 noteMap.replace(mag,noteMap.get(mag)+1);
             }
         }
         for(String key:noteMap.keySet()){
             if(!magazineMap.containsKey(key))
             {
                 isRansom=true;
                 break;
             }
             if(noteMap.get(key)!=magazineMap.get(key)){
                 isRansom=true;
                 break;
             }
         }
         
         if(isRansom==false)
         System.out.println("Yes");
         else
         System.out.println("No");

    }

   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
      //  String[] mn = scanner.nextLine().split(" ");

        /*int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);


        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }*/
        String[] magazine = {"two", "times", "three", "is", "not", "four"};

        String[] note = {"two","times","two","is","four"};

       /* String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }*/

        checkMagazine(magazine, note);

      //  scanner.close();
    }
}
