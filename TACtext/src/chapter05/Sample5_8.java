package chapter05;

public class Sample5_8 {

	public static void main(String[] args) {

		int total = 1, num = 2;

		while(num < 20) {
			total += num;

			if(total >=50) {
				System.out.println(num);
				break;
			}
			System.out.println("1～" + num + "の総和は50未満");
			num++;
		}

	}

}
