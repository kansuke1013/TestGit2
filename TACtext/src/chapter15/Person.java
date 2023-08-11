package chapter15;

public class Person implements Comparable {

	private String name;
	private int age;
	private int height;

	public Person(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public void show() {
		System.out.println(name + " : " + "age.." + age + ", height.." + height);
	}

	public int compareTo(Object obj) {
		Person another = (Person)obj;
		return age - another.age;
	}
}
