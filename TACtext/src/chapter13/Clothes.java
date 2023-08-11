package chapter13;

public class Clothes extends Goods {

	// フィールド
	private String color;
	private String size;

	// コンストラクタ&スーパークラスのコンストラクタも呼び出し
	public Clothes(String name, int price, String color, String size) {
		super(name, price);
		this.color = color;
		this.size = size;
	}

	// showメソッド(オーバーライド)
	public void show() {
		super.show();
		System.out.println("色: " + color);
		System.out.println("サイズ: " + size);
	}

}
