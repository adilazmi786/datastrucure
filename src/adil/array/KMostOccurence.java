package adil.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class KMostOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9 };
		int k = 4;
		findKthMostOccurence(arr, k);
	}

	private static void findKthMostOccurence(int[] arr, int k) {
		// TODO Auto-generated method stub

		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				int v = hm.get(arr[i]);
				hm.put(arr[i], v = v + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		
		Map<Integer, Integer> map=sortByValues(hm);
		

	}

	private static HashMap sortByValues(Map<Integer, Integer> hm) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List list = new LinkedList(hm.entrySet());
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				return ((Comparable) ((Map.Entry) o2).getValue()).compareTo(((Map.Entry) (o1)).getValue());
			}
		});
		HashMap sortedHashMap = new LinkedHashMap();
		for(Iterator it=list.iterator();it.hasNext();)
		{
			Map.Entry entry=(Map.Entry) it.next();
			sortedHashMap.put(entry.getKey(), entry.getValue());
			System.out.println(entry.getKey()+","+entry.getValue());
		}
		return sortedHashMap;

	}

}
