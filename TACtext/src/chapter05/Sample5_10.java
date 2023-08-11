package chapter05;

public class Sample5_10 {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if (j > i) {
					break;
				}
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
