package secondChapter.interview1;

class A2 {
	public A2(String str) {
		System.out.println("A2Class constructor execute: "+str);
	}
	static {
		System.out.println("A2Class static code block execute");
	}
}

class B2 {
	static A2 a1 = new A2("a1");
	A2 a2 = new A2("a2");
	static {
		System.out.println("B2Class static code block execute");
		a1 = new A2("a3");
	}
	public B2() {
		System.out.println("B2Class constructor execute");
		a2 = new A2("a4");
	}
	A2 a5 = new A2("a5");
}

public class InitClass2 {
	public static void main(String[] args) {
		new B2();
	}
}
/**
	A2Class static code block execute
	A2Class constructor execute: a1
	B2Class static code block execute
	A2Class constructor execute: a3
	A2Class constructor execute: a2
	A2Class constructor execute: a5
	B2Class constructor execute
	A2Class constructor execute: a4
*/