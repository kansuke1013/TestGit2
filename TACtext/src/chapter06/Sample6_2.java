package chapter06;

public class Sample6_2 {

	public static void main(String[] args) {

		int[] data = {40, 30, 83};

		for(int i = 0; i < data.length; i++) {
			System.out.println("data[" + i + "] = " + data[i]);
		}

		for(int element : data) {
			System.out.println(element + " ");
		}

	}

}
