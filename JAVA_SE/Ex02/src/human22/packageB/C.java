package human22.packageB;

import human22.packageA.A;

public class C {
	public static void main(String[] args) {
		A a = new A();
		// 다른 PKG, 다른 클래스
		a.method1();
		// public이므로 다른 PKG, 다른 클래스라도 접근가능
		// 단, import 조건하에서만
		a.method2();
		// default이므로 다른 PKG에서는 접근 불가
		// 어떤 조건이라도 접근 불가
		a.method3();
		// private이므로 다른 클래스에선 접근 불가
	}

}
