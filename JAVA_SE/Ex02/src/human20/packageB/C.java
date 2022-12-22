package human20.packageB;

import human20.packageA.A;

public class C {
	public static void main (String[] args) {
		A a1 = new A(true);
		// a1은 public은 import 조건하 접근 가능
		A a2 = new A(10);
		// a2는 default이므로 다른 PKG이므로 접근 불가
		A a3 = new A(9.1);
		// a3는 private이므로 다른 클래스에서는 접근 불가
	}
}
