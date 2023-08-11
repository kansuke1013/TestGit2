package chapter19;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Example_19_2 {

	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str;
			int it1;
			int it2;
			int result;

			System.out.println("1つ目の数値を入力してください");
			str = br.readLine();
			it1 = Integer.parseInt(str);

			System.out.println("2つ目の数値を入力してください");
			str = br.readLine();
			it2 = Integer.parseInt(str);

			result = it1 + it2;
			System.out.println(it1 + " + " + it2 + " = " + result);
		}catch(NumberFormatException e) {
			System.out.println("数値を入力してください");
		}catch(Exception e) {
			System.out.println("例外発生");
		}

	}

}
