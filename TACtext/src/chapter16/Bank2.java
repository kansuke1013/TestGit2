package chapter16;

public class Bank2 {

	private int account;

	public Bank2(int money) throws NoMoneyException {

		if(money > 0) {
			account = money;
		}else {
			throw new NoMoneyException(money);
		}
		System.out.println("新規口座を作成しました。");
		show();
	}

	public void show() {
		System.out.println("預金額: " + account + "円");
	}

	public void in(int money) throws NoMoneyException{

		if(money > 0) {
			account += money;
			System.out.println(money + "円入金しました。");
			show();
		}else {
			throw new NoMoneyException(money);
		}
	}

	public void out(int money) throws NoMoneyException {

		if(money > 0 && account >= money) {
			account -= money;
			System.out.println(money + "円出金しました。");
			show();
		}else {
			throw new NoMoneyException(money);
		}
	}
}
