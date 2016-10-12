public class Xchild extends Xsuper {

	private int	age;

	Xchild() {

	}

	Xchild(int n, String str) {
		super(str);
		this.age = n;

	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
