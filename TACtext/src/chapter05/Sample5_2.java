package chapter05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample5_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("現在温度を入力してください");

		int ondo = Integer.parseInt(br.readLine());

		while(ondo >= 30 && ondo <= 40) {
			System.out.println("適温です:" + ondo);
			System.out.println("現在の温度を入力してください");
			ondo = Integer.parseInt(br.readLine());
		}

		System.out.println("適温ではありません。" + ondo);


	}

}
