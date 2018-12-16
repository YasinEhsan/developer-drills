package javaGenerics;

public class BoxClient {
	public static void main(String args[]) {
		Box<Integer> x = new Box<>();
		Box<String> y = new Box<>();
		x.addA(3);
		x.addB(1);
		x.addC(4);
		y.addA("X");
		y.addB("Y");
		y.addC("Z");
		System.out.println(x.getA() + y.getC());
	}
}