package Java11;

interface Nath {
	public void show();

	public void add(int a, int b);

	public void sub(int a, int b);

	public void mul(int a, int b);

	public void div(int a, int b);
}

class Xompute implements Nath {
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

	public void show() {
		System.out.println("ans=" + ans);
	}
}

public class Class05 {

	public static void main(String args[]) {
		Xompute xmp = new Xompute();
		xmp.add(3, 5);
		xmp.show();
		xmp.sub(3, 5);
		xmp.show();
		xmp.mul(3, 5);
		xmp.show();
		xmp.div(3, 5);
		xmp.show();
	}

}
