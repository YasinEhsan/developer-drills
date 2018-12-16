package javaGenerics;

public class Box<T> {
	T a, b, c;
	public void addA(T t) {
		a = t;
	}
	public T getA() {
		return a;
	}
	public void addB(T t) {
		b = t;
	}
	public T getB() {
		return b;
	}
	public void addC(T t) {
		c = t;
	}
	public T getC() {
		return c;
	}
}
