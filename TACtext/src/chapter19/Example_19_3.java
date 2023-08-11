package chapter19;

import java.util.Date;

public class Example_19_3 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();
		for(int i = 0; i < 1000; i++) {
			System.out.print("A");
		}
		System.out.println();
		long end = System.currentTimeMillis();

		Date d = new Date(start);
		System.out.println("開始時刻: " + d);

		d.setTime(end);
		System.out.println("終了時刻: " + d);

		long time = end - start;
		System.out.println("処理に要した時間は: " + time + "ミリ秒。");

		System.out.println(start);
		System.out.println(end);
	}

}
