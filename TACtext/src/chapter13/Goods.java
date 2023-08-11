package chapter13;

public class Goods {

	// フィールド
	protected String name;
	protected int price;

	// コンストラクタ
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// showメソッド
	public void show() {
		System.out.println("-------------------------");
		System.out.println("商品名 : " + name);
		System.out.println("価格 : " + price);
	}
	
	public int getPrice() {
		return price;
	}
}
