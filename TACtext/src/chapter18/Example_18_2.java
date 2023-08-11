package chapter18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Example_18_2 {
	public static void main(String[] args) {

		String str;

		try {
			BufferedReader br = new BufferedReader(new FileReader("in.txt"));
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("out.txt")));

			while((str = br.readLine()) != null) {
				pw.println(str);
			}
			br.close();
			pw.close();
		}catch(FileNotFoundException e) {
			System.out.println("入力ファイルが見つかりません");
		}catch(IOException e) {
			System.out.println("入出力エラーです");
		}

	}

}
