package JavaEclipsVezbe;

import java.util.Map;
import java.util.TreeMap;

public class GeeksGreeks {
			public static void main(String[] args) {
		String str = "Geeks for Geeks";
		Map<String, Integer> mp = new TreeMap<>();
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {

		if (mp.containsKey(arr[i])) {
		mp.put(arr[i], mp.get(arr[i]) + 1);
		} else {
		mp.put(arr[i], 1);
		}
		}
		System.out.println(mp);
		}
		}


