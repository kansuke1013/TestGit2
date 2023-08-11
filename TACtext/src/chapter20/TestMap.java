package chapter20;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String args[]) {

		Map<String, String> mp = new HashMap<String, String>();

		mp.put("1", "abc");
		mp.put("3", "def");
		mp.put("2", "xyz");
		mp.put("1", "mno");

		System.out.println(mp.get("2"));

		Set<String> keys = mp.keySet();
		for(String key : keys) {
			System.out.println(mp.get(key));
		}

		mp.remove("1");
		for(String key : keys) {
			System.out.println(mp.get(key));
		}

	}
}
