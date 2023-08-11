package chapter15;

public class Tool {

	public static void sort(Comparable[] data) {

		for(int i = data.length -1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(data[j].compareTo(data[j + 1]) > 0) {
					Comparable work = data[j];
					data[j] = data[j + 1];
					data[j + 1] = work;
				}
			}
		}
	}
}
