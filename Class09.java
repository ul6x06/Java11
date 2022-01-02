
package Java11;

interface Bath {
	public void show();

	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

interface AdvanceMath {
	public void mod(int a, int b);

	public void fac(int a); // 計算 a!

	public void pow(int a, int b); // 計算 a^b
}

class Kompute implements Bath, AdvanceMath {
	public int ans;

	public void add(int a, int b) {
		ans = a + b;
	}

	public void sub(int a, int b) {
		ans = a - b;
	}

	public void mul(int a, int b) {
		ans = a * b;
	}

	public void div(int a, int b) {
		ans = a / b;
	}

	public void mod(int a, int b) {
		ans = a % b;
	}

	public void fac(int a) {
		ans = 1;
		for (int i = 1; i <= a; i++)
			ans *= i;
	}

	public void pow(int a, int b) {
		ans = 1;
		for (int i = 1; i <= b; i++)
			ans *= a;
	}

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class Class09 {

	public static void main(String[] args) {
		Kompute kmp = new Kompute();
		kmp.add(3, 5);

		kmp.show();
		kmp.sub(3, 5);
		kmp.show();
		kmp.mul(3, 5);
		kmp.show();
		kmp.div(3, 5);
		kmp.show();
		kmp.mod(3, 5);
		kmp.show();
		kmp.fac(5);
		kmp.show();
		kmp.pow(3, 5);
		kmp.show();
	}

}
