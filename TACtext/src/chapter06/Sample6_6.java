package chapter06;

public class Sample6_6 {

	public static void main(String[] args) {

		int[][] data = new int[3][4];
		int num = 1;

		for(int row = 0; row < data.length; row++) {
			for(int column = 0; column < data[row].length; column++) {
				data[row][column] = num;
				num++;
			}
		}

		for(int row = 0; row < data.length; row++) {
			for (int column = 0; column < data[row].length; column++) {
				System.out.print(data[row][column] + " ");
			}
			System.out.println();
		}

	}

}
