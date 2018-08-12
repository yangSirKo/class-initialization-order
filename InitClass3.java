package secondChapter.interview1;

class A3 {

	public A3(String str) {
		System.out.println("superClass constructor execute: "+str);
	}
	public A3() {
		System.out.println("superClass constructor execute , no parameter");
	}
	static {
		System.out.println("superClass static code block execute");
	}
}

class B3 extends A3{
	static A3 a1 = new A3("a1");
	A3 a2 = new A3("a2");
	static {
		System.out.println("subClass static code block execute");
		a1 = new A3("a3");
	}
	public B3(String str) {
		super();
		System.out.println("subClass constructor execute");
		a2 = new A3("a4");
	}
	A3 a5 = new A3("a5");
}

public class InitClass3 {
	public static void main(String[] args) {
		new B3("b1");
	}
}
/**
	superClass static code block execute
	superClass constructor execute: a1
	subClass static code block execute
	superClass constructor execute: a3
	superClass constructor execute , no parameter
	superClass constructor execute: a2
	superClass constructor execute: a5
	subClass constructor execute
	superClass constructor execute: a4
*/