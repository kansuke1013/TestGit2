package chapter20;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {

		List<String> lt = new ArrayList<String>();

		lt.add("abc");
		lt.add("xyz");
		lt.add("def");

		for(int i = 0; i < lt.size(); i++) {
			System.out.println(lt.get(i));
		}

		lt.remove(1);

		for(int i = 0; i < lt.size(); i++) {
			System.out.println(lt.get(i));
		}

	}

}
