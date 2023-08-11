package chapter13;

public class Example_13_3 {

	public static void main(String[] args) {

		Goods[] g = {
				new Goods("ハンカチ", 750),
				new Computer("パソコン", 100000, "Win2004", 256),
				new Computer("パソコンB", 150000, "winYP", 512),
				new Clothes("Jeans390", 4000, "青", "LL")
		};
		// インスタンス変数
		int total = 0;

		// 配列変数gのインスタンスの種類によって動作を変える
		for(int i = 0; i < g.length; i++) {
			g[i].show();
			total += g[i].getPrice();
		}
		System.out.println("-------------------------");
		System.out.println("合計金額 : " + total + "円");
	}

}
