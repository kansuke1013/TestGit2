package chapter16;

public class NoMoneyException extends Exception {

	// フィールド
	private int money;

	// コンストラクタ
	public NoMoneyException(int money) {
		this.money = money;
	}

	// エラーのあった金額を表示するメソッド
	public String toString() {
		return "不正な取引金額 : " + money + "円";
	}
}
