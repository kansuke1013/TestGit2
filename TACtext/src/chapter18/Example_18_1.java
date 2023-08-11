package chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example_18_1 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		System.out.println("文字列を入力してください");

		try {
			str = br.readLine();
			System.out.println(str + "が出力されました");
		}catch(IOException e) {
			System.out.println("入出力エラーです");
		}

	}

}
