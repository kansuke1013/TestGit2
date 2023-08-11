package chapter16;

public class Example_16_5 {

	public static void main(String[] args) {

		try {
			Bank2 tokyo = new Bank2(5000);
			tokyo.in(3000);
			tokyo.out(10000);
		}catch(NoMoneyException e) {
			System.out.println(e);
		}

	}

}
