package chapter08;

public class Sample_8_6 {

	public static void main(String[] args) {

		Student4[] st;
		st = new Student4[3];

		for(int i = 0; i < st.length; i++) {
			st[i] = new Student4(i * 10, i * 10, i * 10);
		}
		for(int i = 0; i < st.length; i++) {
			st[i].show();
		}

	}

}
