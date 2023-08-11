package chapter13;

public class Computer extends Goods {

	// フィールド
	private String osType;
	private int memory;

	// コンストラクタ&スーパークラスのコンストラクタも呼び出し
	public Computer(String name, int price, String osType, int memory) {
		super(name, price);
		this.osType = osType;
		this.memory = memory;
	}

	// showメソッド（オーバーライド）
	public void show() {
		super.show();
		System.out.println("OSタイプ" + osType);
		System.out.println("メモリ" + memory);
	}
}
