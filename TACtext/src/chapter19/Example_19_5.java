package chapter19;

import java.util.Random;

public class Example_19_5 {

	public static void main(String[] args) {

		Random r = new Random();

		for(int i = 0; i < 10; i++) {
			System.out.print(r.nextInt(1000) + " ");
		}

	}

}
