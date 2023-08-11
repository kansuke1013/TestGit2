package chapter06;

public class Sample {

	public static void main(String[] args) {

		int[] table = new int[10];
		for(int i = 0; i < table.length; i++) {
			table[i] = i;
		}
		for(int element : table) {
			System.out.print(element + " ");
		}

	}

}
