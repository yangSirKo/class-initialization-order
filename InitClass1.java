package secondChapter.interview1;

class A1 {
	public A1() {
		System.out.println("A1Class constructor execute: ");
	}

	static {
		System.out.println("A1Class static code block execute");
	}
}

class B1 {
	static A1 a1 = new A1();
	static A1 a2 = new A1();
	static {
		System.out.println("B1Class static code block execute");
	}

	public B1() {
		System.out.println("B1Class constructor execute");
	}
}

public class InitClass1 {
	public static void main(String[] args) {
		new B1();
	}
}
/**
	A1Class static code block execute
	A1Class constructor execute: 
	A1Class constructor execute: 
	B1Class static code block execute
	B1Class constructor execute
*/