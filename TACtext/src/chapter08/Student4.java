
package chapter08;

public class Student4 {

	int japanese;
	int math;
	int english;

	Student4() {
		this(100, 100, 100);
	}

	Student4(int japanese, int math, int english) {
		this.japanese = japanese;
		this.math = math;
		this.english = english;
	}

	void show() {
		System.out.println("国語: " + japanese);
		System.out.println("数学: " + math);
		System.out.println("英語: " + english);
	}

}
